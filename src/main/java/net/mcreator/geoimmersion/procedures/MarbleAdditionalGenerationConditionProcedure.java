package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class MarbleAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(new BlockPos(x, y, z))
				.is(TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("minecraft:has_structure/village_plains")))) {
			return false;
		}
		return false;
	}
}
