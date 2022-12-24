package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class StalactiteAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (100); index0++) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())
					&& ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 2, z), GeoimmersionModBlocks.STALACTITE.get().defaultBlockState(), 3);
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 2, z), GeoimmersionModBlocks.STALACTITE.get().defaultBlockState(), 3);
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())
					&& ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 2, z), GeoimmersionModBlocks.STALACTITE.get().defaultBlockState(), 3);
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())
					&& ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 0, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 2, z), GeoimmersionModBlocks.STALACTITE.get().defaultBlockState(), 3);
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())
					&& ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 2, z), GeoimmersionModBlocks.STALACTITE.get().defaultBlockState(), 3);
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())
					&& ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 2, z), GeoimmersionModBlocks.STALACTITE.get().defaultBlockState(), 3);
			}
		}
		return true;
	}
}
