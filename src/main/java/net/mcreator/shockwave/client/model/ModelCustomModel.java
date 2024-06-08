package net.mcreator.shockwave.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("shockwave", "model_custom_model"), "main");
	public final ModelPart bb_main;

	public ModelCustomModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(1, 4).mirror().addBox(-12.0F, -11.0F, -0.5F, 12.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(1, 4).addBox(-12.0F, -11.0F, 0.5F, 12.0F, 11.0F, 0.0F, new CubeDeformation(0.0F))
						.texOffs(0, 13).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(0.0F, -2.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-1.0F, -3.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-2.0F, -4.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-2.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13).addBox(-3.0F, -2.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.0F, -3.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 9).addBox(-3.0F, -5.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 9)
						.addBox(-3.0F, -6.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 7).addBox(-4.0F, -7.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-5.0F, -8.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5).addBox(-6.0F, -9.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 4)
						.addBox(-7.0F, -10.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 3).addBox(-9.0F, -11.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5)
						.addBox(-6.0F, -4.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5).addBox(-7.0F, -5.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5)
						.addBox(-8.0F, -6.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5).addBox(-9.0F, -7.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5)
						.addBox(-10.0F, -8.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5).addBox(-11.0F, -9.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5)
						.addBox(-12.0F, -10.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 5).addBox(-12.0F, -11.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 13)
						.addBox(-1.0F, -2.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12).addBox(-2.0F, -3.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, 11)
						.addBox(-3.0F, -4.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 9).addBox(-4.0F, -6.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 8)
						.addBox(-5.0F, -7.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 7).addBox(-6.0F, -8.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 6)
						.addBox(-7.0F, -9.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5).addBox(-8.0F, -10.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-9.0F, -10.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5).addBox(-10.0F, -11.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-11.0F, -11.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4).addBox(-12.0F, -11.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(-12.0F, -9.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4).addBox(-11.0F, -8.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(-10.0F, -7.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4).addBox(-9.0F, -6.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(-8.0F, -5.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4).addBox(-7.0F, -4.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(-6.0F, -3.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4).addBox(-6.0F, -3.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 4)
						.addBox(-5.0F, -3.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 12).addBox(-4.0F, -2.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 13)
						.addBox(-3.0F, -1.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 13).addBox(-2.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 13)
						.addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
