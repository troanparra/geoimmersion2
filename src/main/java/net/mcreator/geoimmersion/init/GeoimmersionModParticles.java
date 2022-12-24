
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.geoimmersion.client.particle.MagmadropParticle;
import net.mcreator.geoimmersion.client.particle.Magmadrop2Particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GeoimmersionModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) GeoimmersionModParticleTypes.MAGMADROP.get(),
				MagmadropParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) GeoimmersionModParticleTypes.MAGMADROP_2.get(),
				Magmadrop2Particle::provider);
	}
}
