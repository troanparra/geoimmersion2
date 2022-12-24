package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class VolcanoSmokeParticleSpawningConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.SMOKE, x, y, z, 5, 64, 5);
	}
}
