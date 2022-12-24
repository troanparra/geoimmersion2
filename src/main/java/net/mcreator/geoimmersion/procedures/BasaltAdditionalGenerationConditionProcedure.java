package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BasaltAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) >= 32
				&& world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) <= 48
				&& new ResourceLocation("geoimmersion:red_soil_plains").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return true;
		}
		return true;
	}
}
