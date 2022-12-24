package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TravertineEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(new BlockPos(x, y, z), false);
	}
}
