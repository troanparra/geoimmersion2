package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class SkarnAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.LAVA
				&& ((world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).getBlock() == GeoimmersionModBlocks.GRANITE.get()
						|| (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get()
						|| (world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == GeoimmersionModBlocks.GRANITE.get()
						|| (world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get()
						|| (world.getBlockState(new BlockPos(x + 1, y + 1, z + 1))).getBlock() == GeoimmersionModBlocks.MARBLE.get()
						|| (world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == GeoimmersionModBlocks.MARBLE.get())) {
			world.setBlock(new BlockPos(x, y, z), GeoimmersionModBlocks.SKARN.get().defaultBlockState(), 3);
		}
		return true;
	}
}
