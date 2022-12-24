
package net.mcreator.geoimmersion.world.features.ores;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class GlaciericeFeature extends OreFeature {
	public static GlaciericeFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new GlaciericeFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("geoimmersion:glacierice", FEATURE,
				new OreConfiguration(GlaciericeFeatureRuleTest.INSTANCE, GeoimmersionModBlocks.GLACIERICE.get().defaultBlockState(), 64));
		PLACED_FEATURE = PlacementUtils.register("geoimmersion:glacierice", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(256), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(60), VerticalAnchor.absolute(128)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("geoimmersion:glacier"));
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public GlaciericeFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class GlaciericeFeatureRuleTest extends RuleTest {
		static final GlaciericeFeatureRuleTest INSTANCE = new GlaciericeFeatureRuleTest();
		private static final com.mojang.serialization.Codec<GlaciericeFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<GlaciericeFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("geoimmersion:glacierice_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(GeoimmersionModBlocks.GRANITE.get(), GeoimmersionModBlocks.BASALT.get(), GeoimmersionModBlocks.ANDESITE.get(),
						GeoimmersionModBlocks.LIMESTONE.get(), GeoimmersionModBlocks.GRAVITY_LIMESTONE.get(),
						GeoimmersionModBlocks.METALIMESTONE.get(), GeoimmersionModBlocks.SANDSTONE.get(), GeoimmersionModBlocks.METASANDSTONE.get(),
						GeoimmersionModBlocks.GABRO.get(), GeoimmersionModBlocks.MARBLE.get(), GeoimmersionModBlocks.QUARTIZITE.get(),
						GeoimmersionModBlocks.RIOLITE.get(), GeoimmersionModBlocks.GNAISSE.get(), GeoimmersionModBlocks.BANDED_IRON_FORMATION.get(),
						GeoimmersionModBlocks.KIMBERLITE.get(), GeoimmersionModBlocks.PERIDOTITE.get(), GeoimmersionModBlocks.SLATE.get(),
						GeoimmersionModBlocks.SULFURROCK.get(), GeoimmersionModBlocks.BAUXITE.get(), GeoimmersionModBlocks.GALENA.get(),
						GeoimmersionModBlocks.SCHIST.get(), GeoimmersionModBlocks.DIABASE.get(), GeoimmersionModBlocks.QUARTIZITEWITHGOLDDUST.get(),
						GeoimmersionModBlocks.QUARTIZITEWITHGOLDNUGGETS.get(), GeoimmersionModBlocks.QUARTIZITEWITHHUGEGOLDNUGGET.get(),
						GeoimmersionModBlocks.COALONLIMESTONE.get(), GeoimmersionModBlocks.COALON_METALIMESTONE.get(),
						GeoimmersionModBlocks.NOBELS_DYNAMITE.get(), GeoimmersionModBlocks.COALON_SANDSTONE.get(),
						GeoimmersionModBlocks.TRAVERTINE.get(), GeoimmersionModBlocks.CASSETERITEON_GRANITE.get(),
						GeoimmersionModBlocks.COPPERIN_GABRO.get(), GeoimmersionModBlocks.GRAVITY_SANDSTONE.get(),
						GeoimmersionModBlocks.PLATINUMIN_GABRO.get(), GeoimmersionModBlocks.TORBENITEIN_GRANITE.get(),
						GeoimmersionModBlocks.TITANIUMMAGNETIREIN_GABRO.get(), GeoimmersionModBlocks.DIAMONDIN_KIMBERLITE.get(),
						GeoimmersionModBlocks.EMERALDIN_GNAISSE.get(), GeoimmersionModBlocks.LAPIS_LAZULIIN_MARBLE.get(),
						GeoimmersionModBlocks.COALIN_METASANDSTONE.get(), GeoimmersionModBlocks.EVAPORITE.get(),
						GeoimmersionModBlocks.SODIUM_NITRATE_BLOCK.get(), GeoimmersionModBlocks.POTASSIUM_CHLORIDE_BLOCK.get(),
						GeoimmersionModBlocks.GALENA_ARGENTIFERE.get(), GeoimmersionModBlocks.QUARTIZITEWITH_SILVER.get(),
						GeoimmersionModBlocks.SKARN.get());
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
