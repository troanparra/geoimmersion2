package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class NobelsDynamiteBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 9, Explosion.BlockInteraction.BREAK);
		world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 9, 9, 9);
	}
}
