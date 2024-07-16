package fi.dy.masa.tweakeroo.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import fi.dy.masa.tweakeroo.util.IItemStackLimit;

@Mixin(ItemStack.class)
public abstract class MixinItemStack
{
    @Shadow
    public abstract Item getItem();

    @Shadow public abstract ComponentMap getComponents();

    @Shadow public abstract RegistryEntry<Item> getRegistryEntry();

    @Inject(method = "getMaxCount", at = @At("RETURN"), cancellable = true)
    public void getMaxStackSizeStackSensitive(CallbackInfoReturnable<Integer> cir)
    {
        int component = this.getComponents().getOrDefault(DataComponentTypes.MAX_STACK_SIZE, 1);
        int tweakeroo = ((IItemStackLimit) this.getItem()).getMaxStackSize((ItemStack) (Object) this);

        if (component <= this.getRegistryEntry().value().getMaxCount() &&
            tweakeroo != 64)
        {
            cir.setReturnValue(component);
        }
        else
        {
            cir.setReturnValue(Math.max(component, tweakeroo));
        }
    }
}
