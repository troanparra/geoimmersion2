
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GeoimmersionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(GeoimmersionModEntities.NOBELSTHROWABLEDYNAMITE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GeoimmersionModEntities.HAND_TNT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GeoimmersionModEntities.ALUMINUM_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(GeoimmersionModEntities.PISTOL.get(), ThrownItemRenderer::new);
	}
}
