package fi.dy.masa.tweakeroo.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import fi.dy.masa.tweakeroo.util.InventoryUtils;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.client.network.ClientConnectionState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.ClientConnection;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.network.packet.s2c.play.DeathMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import fi.dy.masa.tweakeroo.config.FeatureToggle;
import fi.dy.masa.tweakeroo.data.DataManager;
import fi.dy.masa.tweakeroo.data.ServerDataSyncer;
import fi.dy.masa.tweakeroo.tweaks.PlacementTweaks;
import fi.dy.masa.tweakeroo.util.MiscUtils;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayNetworkHandler.class)
public abstract class MixinClientPlayNetworkHandler extends ClientCommonNetworkHandler
{
    protected MixinClientPlayNetworkHandler(MinecraftClient client, ClientConnection connection, ClientConnectionState connectionState)
    {
        super(client, connection, connectionState);
    }

    @Inject(method = "onScreenHandlerSlotUpdate", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/screen/ScreenHandler;setStackInSlot(IILnet/minecraft/item/ItemStack;)V"),
            cancellable = true)
    private void onHandleSetSlot(ScreenHandlerSlotUpdateS2CPacket packet, CallbackInfo ci)
    {
        if (PlacementTweaks.shouldSkipSlotSync(packet.getSlot(), packet.getStack()))
        {
            ci.cancel();
        }
    }

    @Inject(method = "onScreenHandlerSlotUpdate", at = @At("HEAD"))
    private void beforeHandleSetSlot(ScreenHandlerSlotUpdateS2CPacket packet, CallbackInfo ci)
    {
        if (FeatureToggle.TWEAK_HAND_RESTOCK.getBooleanValue() && packet.getSyncId() == 0)
        {
            if (InventoryUtils.isHotbarSlot(packet.getSlot()))
            {
                PlacementTweaks.cacheStackInHand(Hand.MAIN_HAND);
            }
            else if (InventoryUtils.isOffhandSlot(packet.getSlot()))
            {
                PlacementTweaks.cacheStackInHand(Hand.OFF_HAND);
            }
        }
    }

    @Inject(method = "onScreenHandlerSlotUpdate", at = @At("RETURN"))
    private void afterHandleSetSlot(ScreenHandlerSlotUpdateS2CPacket packet, CallbackInfo ci)
    {
        if (FeatureToggle.TWEAK_HAND_RESTOCK.getBooleanValue() && packet.getSyncId() == 0)
        {
            if (InventoryUtils.isHotbarSlot(packet.getSlot()))
            {
                PlacementTweaks.onProcessRightClickPost(this.client.player, Hand.MAIN_HAND);
            }
            else if (InventoryUtils.isOffhandSlot(packet.getSlot()))
            {
                PlacementTweaks.onProcessRightClickPost(this.client.player, Hand.OFF_HAND);
            }
        }
    }

    @Inject(method = "onDeathMessage", at = @At(value = "INVOKE", // onCombatEvent
            target = "Lnet/minecraft/client/MinecraftClient;setScreen(Lnet/minecraft/client/gui/screen/Screen;)V"))
    private void onPlayerDeath(DeathMessageS2CPacket packetIn, CallbackInfo ci)
    {
        MinecraftClient mc = MinecraftClient.getInstance();

        if (FeatureToggle.TWEAK_PRINT_DEATH_COORDINATES.getBooleanValue() && mc.player != null)
        {
            MiscUtils.printDeathCoordinates(mc);
        }
    }

    @Inject(
            method = "onCommandTree",
            at = @At("RETURN")
    )
    private void onCommandTree(CallbackInfo ci)
    {
        if (FeatureToggle.TWEAK_SERVER_DATA_SYNC.getBooleanValue())
        {
            // when the player becomes OP, the server sends the command tree to the client
            ServerDataSyncer.getInstance().recheckOpStatus();
        }
    }

    @Inject(method = "onCustomPayload", at = @At("HEAD"))
    private void tweakeroo_onCustomPayload(CustomPayload payload, CallbackInfo ci)
    {
        if (payload.getId().id().equals(DataManager.CARPET_HELLO))
        {
            DataManager.getInstance().setHasCarpetServer(true);
        }
        else if (payload.getId().id().equals(DataManager.SERVUX_ENTITY_DATA))
        {
            DataManager.getInstance().setHasServuxServer(true);
        }
    }
}
