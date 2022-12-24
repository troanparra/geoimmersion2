package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class RedSoilGrassUpdateTickProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && world.dayTime() == 6000
				&& (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()
					|| (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == GeoimmersionModBlocks.RED_SOIL.get()) {
				world.setBlock(new BlockPos(x, y, z), GeoimmersionModBlocks.RED_SOIL_GRASS.get().defaultBlockState(), 3);
			}
		}
		return true;
	}
}
