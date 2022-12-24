
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
import net.minecraft.world.level.block.Blocks;
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

public class BandedIronFormationFeature extends OreFeature {
	public static BandedIronFormationFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new BandedIronFormationFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("geoimmersion:banded_iron_formation", FEATURE, new OreConfiguration(
				BandedIronFormationFeatureRuleTest.INSTANCE, GeoimmersionModBlocks.BANDED_IRON_FORMATION.get().defaultBlockState(), 64));
		PLACED_FEATURE = PlacementUtils.register("geoimmersion:banded_iron_formation", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(4), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(1), VerticalAnchor.absolute(96)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public BandedIronFormationFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class BandedIronFormationFeatureRuleTest extends RuleTest {
		static final BandedIronFormationFeatureRuleTest INSTANCE = new BandedIronFormationFeatureRuleTest();
		private static final com.mojang.serialization.Codec<BandedIronFormationFeatureRuleTest> CODEC = com.mojang.serialization.Codec
				.unit(() -> INSTANCE);
		private static final RuleTestType<BandedIronFormationFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("geoimmersion:banded_iron_formation_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(GeoimmersionModBlocks.SANDSTONE.get(), GeoimmersionModBlocks.METASANDSTONE.get(), Blocks.SANDSTONE,
						Blocks.RED_SANDSTONE, GeoimmersionModBlocks.LIMESTONE.get(), GeoimmersionModBlocks.GRAVITY_LIMESTONE.get(),
						GeoimmersionModBlocks.METALIMESTONE.get(), GeoimmersionModBlocks.GRAVITY_SANDSTONE.get());
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
