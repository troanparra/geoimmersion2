
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.geoimmersion.GeoimmersionMod;

public class GeoimmersionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, GeoimmersionMod.MODID);
	public static final RegistryObject<ParticleType<?>> MAGMADROP = REGISTRY.register("magmadrop", () -> new SimpleParticleType(true));
	public static final RegistryObject<ParticleType<?>> MAGMADROP_2 = REGISTRY.register("magmadrop_2", () -> new SimpleParticleType(true));
}
