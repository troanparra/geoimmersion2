package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MainRecipeScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		GeofurnaceBIFrecipeProcedure.execute(world, x, y, z);
	}
}
