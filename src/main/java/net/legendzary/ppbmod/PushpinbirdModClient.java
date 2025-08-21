package net.legendzary.ppbmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.legendzary.ppbmod.entity.ModEntities;
import net.legendzary.ppbmod.entity.client.PushpinProjectileModel;
import net.legendzary.ppbmod.entity.client.PushpinProjectileRenderer;

public class PushpinbirdModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(PushpinProjectileModel.PUSHPIN, PushpinProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.PUSHPIN, PushpinProjectileRenderer::new);
    }
}
