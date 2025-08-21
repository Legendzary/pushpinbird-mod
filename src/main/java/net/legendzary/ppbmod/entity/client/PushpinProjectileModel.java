package net.legendzary.ppbmod.entity.client;

import net.legendzary.ppbmod.PushpinbirdMod;
import net.legendzary.ppbmod.entity.custom.PushpinProjectileEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class PushpinProjectileModel extends EntityModel<PushpinProjectileEntity> {
    public static final EntityModelLayer PUSHPIN = new EntityModelLayer(Identifier.of(PushpinbirdMod.MOD_ID, "pushpin"), "main");
    private final ModelPart handle;
    private final ModelPart bb_main;

    public PushpinProjectileModel(ModelPart root) {
        this.handle = root.getChild("handle");
        this.bb_main = root.getChild("bb_main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData handle = modelPartData.addChild("handle", ModelPartBuilder.create().uv(0, 0).cuboid(-6.3F, -1.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 5).cuboid(-6.3F, -7.0F, -2.0F, 4.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(0, 22).cuboid(-2.3F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(6, 22).cuboid(-7.3F, -7.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(12, 22).cuboid(-5.3F, -7.0F, 2.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 0).cuboid(-5.3F, -7.0F, -3.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 15).cuboid(-5.3F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(20, 9).cuboid(-5.3F, -6.0F, -2.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 15).cuboid(-5.3F, -6.0F, 1.0F, 2.0F, 5.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 15).cuboid(-3.3F, -6.0F, -1.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(14, 15).cuboid(-6.3F, -6.0F, -1.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
                .uv(16, 5).cuboid(-6.3F, -1.0F, 2.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 7).cuboid(-6.3F, -1.0F, -3.0F, 4.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 10).cuboid(-7.3F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
                .uv(10, 10).cuboid(-2.3F, -1.0F, -2.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(4.3F, 18.0F, 0.0F));

        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData pointy_r1 = bb_main.addChild("pointy_r1", ModelPartBuilder.create().uv(20, 21).cuboid(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.7F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(PushpinProjectileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        handle.render(matrices, vertexConsumer, light, overlay, color);
        bb_main.render(matrices, vertexConsumer, light, overlay, color);
    }
}