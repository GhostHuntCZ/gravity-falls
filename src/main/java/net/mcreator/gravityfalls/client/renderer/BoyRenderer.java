
package net.mcreator.gravityfalls.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.gravityfalls.entity.BoyEntity;

public class BoyRenderer extends HumanoidMobRenderer<BoyEntity, HumanoidModel<BoyEntity>> {
	public BoyRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
		this.addLayer(new EyesLayer<BoyEntity, HumanoidModel<BoyEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("gravity_falls:textures/entities/char_1.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BoyEntity entity) {
		return new ResourceLocation("gravity_falls:textures/entities/char_1.png");
	}
}
