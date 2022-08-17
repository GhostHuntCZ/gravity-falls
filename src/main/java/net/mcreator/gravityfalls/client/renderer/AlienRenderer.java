
package net.mcreator.gravityfalls.client.renderer;

public class AlienRenderer extends HumanoidMobRenderer<AlienEntity, HumanoidModel<AlienEntity>> {

	public AlienRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));

	}

	@Override
	public ResourceLocation getTextureLocation(AlienEntity entity) {
		return new ResourceLocation("gravity_falls:textures/entities/char_3.png");
	}

}
