package fi.dy.masa.tweakeroo.mixin;

import fi.dy.masa.tweakeroo.config.FeatureToggle;
import net.minecraft.client.render.Frustum;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Frustum.class)
public class MixinFrustum {
    @Inject(method = "isVisible(DDDDDD)Z", at = @At("HEAD"), cancellable = true)
    private void shouldBuild(CallbackInfoReturnable<Boolean> cir)
    {
        if (FeatureToggle.TWEAK_RENDER_EDGE_CHUNKS.getBooleanValue())
        {
            cir.setReturnValue(true);
        }
    }
}
