
package net.mcreator.geoimmersion.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Holder;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

import java.util.Set;
import java.util.List;

public class Kimberlitestructure1Feature extends Feature<NoneFeatureConfiguration> {
	public static Kimberlitestructure1Feature FEATURE = null;
	public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new Kimberlitestructure1Feature();
		CONFIGURED_FEATURE = FeatureUtils.register("geoimmersion:kimberlitestructure_1", FEATURE, FeatureConfiguration.NONE);
		PLACED_FEATURE = PlacementUtils.register("geoimmersion:kimberlitestructure_1", CONFIGURED_FEATURE, List.of());
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);
	private final List<Block> base_blocks;
	private StructureTemplate template = null;

	public Kimberlitestructure1Feature() {
		super(NoneFeatureConfiguration.CODEC);
		base_blocks = List.of(GeoimmersionModBlocks.GRANITE.get(), GeoimmersionModBlocks.BASALT.get(), GeoimmersionModBlocks.DIORITE.get(),
				GeoimmersionModBlocks.ANDESITE.get(), GeoimmersionModBlocks.LIMESTONE.get(), GeoimmersionModBlocks.GRAVITY_LIMESTONE.get(),
				GeoimmersionModBlocks.METALIMESTONE.get(), GeoimmersionModBlocks.SANDSTONE.get(), GeoimmersionModBlocks.METASANDSTONE.get(),
				GeoimmersionModBlocks.GABRO.get(), GeoimmersionModBlocks.MARBLE.get(), GeoimmersionModBlocks.QUARTIZITE.get(),
				GeoimmersionModBlocks.RIOLITE.get(), GeoimmersionModBlocks.GNAISSE.get(), GeoimmersionModBlocks.BANDED_IRON_FORMATION.get(),
				GeoimmersionModBlocks.KIMBERLITE.get(), GeoimmersionModBlocks.PERIDOTITE.get(), GeoimmersionModBlocks.SLATE.get(),
				GeoimmersionModBlocks.SULFURROCK.get(), GeoimmersionModBlocks.BAUXITE.get(), GeoimmersionModBlocks.GALENA.get(),
				GeoimmersionModBlocks.SCHIST.get(), GeoimmersionModBlocks.DIABASE.get(), GeoimmersionModBlocks.QUARTIZITEWITHGOLDDUST.get(),
				GeoimmersionModBlocks.QUARTIZITEWITHGOLDNUGGETS.get(), GeoimmersionModBlocks.QUARTIZITEWITHHUGEGOLDNUGGET.get(),
				GeoimmersionModBlocks.COALONLIMESTONE.get(), GeoimmersionModBlocks.COALON_METALIMESTONE.get(),
				GeoimmersionModBlocks.NOBELS_DYNAMITE.get(), GeoimmersionModBlocks.COALON_SANDSTONE.get(), GeoimmersionModBlocks.TRAVERTINE.get(),
				GeoimmersionModBlocks.CASSETERITEON_GRANITE.get(), GeoimmersionModBlocks.COPPERIN_GABRO.get(),
				GeoimmersionModBlocks.GRAVITY_SANDSTONE.get(), GeoimmersionModBlocks.PLATINUMIN_GABRO.get(),
				GeoimmersionModBlocks.TORBENITEIN_GRANITE.get(), GeoimmersionModBlocks.TITANIUMMAGNETIREIN_GABRO.get(),
				GeoimmersionModBlocks.DIAMONDIN_KIMBERLITE.get(), GeoimmersionModBlocks.EMERALDIN_GNAISSE.get(),
				GeoimmersionModBlocks.LAPIS_LAZULIIN_MARBLE.get(), GeoimmersionModBlocks.COALIN_METASANDSTONE.get(),
				GeoimmersionModBlocks.EVAPORITE.get(), GeoimmersionModBlocks.SODIUM_NITRATE_BLOCK.get(),
				GeoimmersionModBlocks.POTASSIUM_CHLORIDE_BLOCK.get(), GeoimmersionModBlocks.GALENA_ARGENTIFERE.get(),
				GeoimmersionModBlocks.QUARTIZITEWITH_SILVER.get(), GeoimmersionModBlocks.SKARN.get(), GeoimmersionModBlocks.VOLCANO_SMOKE.get(),
				GeoimmersionModBlocks.COLUMNARBASALT.get(), Blocks.STONE, Blocks.GRANITE, Blocks.DIORITE, Blocks.ANDESITE);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		if (!generate_dimensions.contains(context.level().getLevel().dimension()))
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("geoimmersion", "kimberlite"));
		if (template == null)
			return false;
		boolean anyPlaced = false;
		if ((context.random().nextInt(1000000) + 1) <= 1000) {
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
				j = Mth.nextInt(context.random(), 8 + context.level().getMinBuildHeight(), Math.max(j, 9 + context.level().getMinBuildHeight()));
				if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
					continue;
				BlockPos spawnTo = new BlockPos(i + 0, j + -10, k + 0);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
		}
		return anyPlaced;
	}
}
