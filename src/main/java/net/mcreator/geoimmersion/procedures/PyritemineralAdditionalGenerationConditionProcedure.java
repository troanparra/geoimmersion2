package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class PyritemineralAdditionalGenerationConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
				&& ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
						|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get())) {
			world.setBlock(new BlockPos(x, y + 1, z), GeoimmersionModBlocks.PYRITEMINERAL.get().defaultBlockState(), 3);
		}
	}
}
