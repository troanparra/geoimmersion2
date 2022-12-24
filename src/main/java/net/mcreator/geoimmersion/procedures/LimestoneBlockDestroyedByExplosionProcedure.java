package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class LimestoneBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), GeoimmersionModBlocks.GRAVITY_LIMESTONE.get().defaultBlockState(), 3);
	}
}
