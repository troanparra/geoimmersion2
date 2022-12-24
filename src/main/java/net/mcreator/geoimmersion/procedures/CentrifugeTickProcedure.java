package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;

public class CentrifugeTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double previousRecipe = 0;
		CentrifugueRecipeProcedureProcedure.execute(world, x, y, z);
	}
}
