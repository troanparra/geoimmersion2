
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

import net.mcreator.geoimmersion.procedures.KimberliteAdditionalGenerationConditionProcedure;
import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

import java.util.Set;
import java.util.Random;
import java.util.List;

public class KimberliteFeature extends OreFeature {
	public static KimberliteFeature FEATURE = null;
	public static Holder<ConfiguredFeature<OreConfiguration, ?>> CONFIGURED_FEATURE = null;
	public static Holder<PlacedFeature> PLACED_FEATURE = null;

	public static Feature<?> feature() {
		FEATURE = new KimberliteFeature();
		CONFIGURED_FEATURE = FeatureUtils.register("geoimmersion:kimberlite", FEATURE,
				new OreConfiguration(KimberliteFeatureRuleTest.INSTANCE, GeoimmersionModBlocks.KIMBERLITE.get().defaultBlockState(), 64));
		PLACED_FEATURE = PlacementUtils.register("geoimmersion:kimberlite", CONFIGURED_FEATURE,
				List.of(CountPlacement.of(256), InSquarePlacement.spread(),
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-32)), BiomeFilter.biome()));
		return FEATURE;
	}

	public static Holder<PlacedFeature> placedFeature() {
		return PLACED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;
	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(Level.OVERWORLD);

	public KimberliteFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;
		int x = context.origin().getX();
		int y = context.origin().getY();
		int z = context.origin().getZ();
		if (!KimberliteAdditionalGenerationConditionProcedure.execute())
			return false;
		return super.place(context);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class KimberliteFeatureRuleTest extends RuleTest {
		static final KimberliteFeatureRuleTest INSTANCE = new KimberliteFeatureRuleTest();
		private static final com.mojang.serialization.Codec<KimberliteFeatureRuleTest> CODEC = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		private static final RuleTestType<KimberliteFeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("geoimmersion:kimberlite_match"), CUSTOM_MATCH);
		}

		private List<Block> base_blocks = null;

		public boolean test(BlockState blockAt, Random random) {
			if (base_blocks == null) {
				base_blocks = List.of(Blocks.STONE, Blocks.GRANITE, Blocks.ANDESITE, Blocks.DIORITE, Blocks.COAL_ORE, Blocks.IRON_ORE,
						Blocks.REDSTONE_ORE, Blocks.REDSTONE_ORE, Blocks.GOLD_ORE, Blocks.LAPIS_ORE, Blocks.DIAMOND_ORE, Blocks.EMERALD_ORE,
						Blocks.COPPER_ORE, Blocks.DEEPSLATE_COAL_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.DEEPSLATE_REDSTONE_ORE,
						Blocks.DEEPSLATE_GOLD_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DEEPSLATE_EMERALD_ORE,
						Blocks.DEEPSLATE_COPPER_ORE, Blocks.NETHER_QUARTZ_ORE, Blocks.NETHER_GOLD_ORE, Blocks.DEEPSLATE);
			}
			return base_blocks.contains(blockAt.getBlock());
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
