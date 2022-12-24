package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GraniteAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (new ResourceLocation("geoimmersion:cordillera").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("geoimmersion:glacier").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("geoimmersion:limestone_biome").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("geoimmersion:cordillera").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("geoimmersion:rioliticterrain").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("geoimmersion:sandstone_biome").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("swamp").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("plains").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("desert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("geoimmersion:volcanicterrain").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("desert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("desert").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("river").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("swamp").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("windswept_hills").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("deep_ocean").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("warm_ocean").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		if (new ResourceLocation("sunflower_plains").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName())) {
			return false;
		}
		return true;
	}
}
