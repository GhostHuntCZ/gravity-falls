
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gravityfalls.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.gravityfalls.client.renderer.GirlRenderer;
import net.mcreator.gravityfalls.client.renderer.BoyRenderer;
import net.mcreator.gravityfalls.client.renderer.AlienRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GravityFallsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GravityFallsModEntities.KL_90.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GravityFallsModEntities.ALIEN.get(), AlienRenderer::new);
		event.registerEntityRenderer(GravityFallsModEntities.GIRL.get(), GirlRenderer::new);
		event.registerEntityRenderer(GravityFallsModEntities.BOY.get(), BoyRenderer::new);
	}
}
