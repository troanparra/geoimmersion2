
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.WorldGenSettings;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import net.mcreator.geoimmersion.world.biome.VolcanicterrainBiome;
import net.mcreator.geoimmersion.world.biome.UppermantlebiomeBiome;
import net.mcreator.geoimmersion.world.biome.SandstoneBiomeBiome;
import net.mcreator.geoimmersion.world.biome.RioliticterrainBiome;
import net.mcreator.geoimmersion.world.biome.RedSoilPlainsBiome;
import net.mcreator.geoimmersion.world.biome.LimestoneBiomeBiome;
import net.mcreator.geoimmersion.world.biome.GlacierBiome;
import net.mcreator.geoimmersion.world.biome.CordilleraBiome;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

@Mod.EventBusSubscriber
public class GeoimmersionModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, GeoimmersionMod.MODID);
	public static final RegistryObject<Biome> LIMESTONE_BIOME = REGISTRY.register("limestone_biome", () -> LimestoneBiomeBiome.createBiome());
	public static final RegistryObject<Biome> SANDSTONE_BIOME = REGISTRY.register("sandstone_biome", () -> SandstoneBiomeBiome.createBiome());
	public static final RegistryObject<Biome> VOLCANICTERRAIN = REGISTRY.register("volcanicterrain", () -> VolcanicterrainBiome.createBiome());
	public static final RegistryObject<Biome> RIOLITICTERRAIN = REGISTRY.register("rioliticterrain", () -> RioliticterrainBiome.createBiome());
	public static final RegistryObject<Biome> CORDILLERA = REGISTRY.register("cordillera", () -> CordilleraBiome.createBiome());
	public static final RegistryObject<Biome> UPPERMANTLEBIOME = REGISTRY.register("uppermantlebiome", () -> UppermantlebiomeBiome.createBiome());
	public static final RegistryObject<Biome> GLACIER = REGISTRY.register("glacier", () -> GlacierBiome.createBiome());
	public static final RegistryObject<Biome> RED_SOIL_PLAINS = REGISTRY.register("red_soil_plains", () -> RedSoilPlainsBiome.createBiome());

	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registry.DIMENSION_TYPE_REGISTRY);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registry.BIOME_REGISTRY);
		WorldGenSettings worldGenSettings = server.getWorldData().worldGenSettings();
		for (Map.Entry<ResourceKey<LevelStem>, LevelStem> entry : worldGenSettings.dimensions().entrySet()) {
			DimensionType dimensionType = entry.getValue().typeHolder().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(DimensionType.OVERWORLD_LOCATION)) {
				ChunkGenerator chunkGenerator = entry.getValue().generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters.values());
					parameters.add(new Pair<>(LimestoneBiomeBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, LIMESTONE_BIOME.getId()))));
					parameters.add(new Pair<>(SandstoneBiomeBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, SANDSTONE_BIOME.getId()))));
					parameters.add(new Pair<>(VolcanicterrainBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, VOLCANICTERRAIN.getId()))));
					parameters.add(new Pair<>(RioliticterrainBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, RIOLITICTERRAIN.getId()))));
					parameters.add(new Pair<>(CordilleraBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, CORDILLERA.getId()))));
					parameters.add(new Pair<>(GlacierBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, GLACIER.getId()))));
					parameters.add(new Pair<>(RedSoilPlainsBiome.PARAMETER_POINT,
							biomeRegistry.getOrCreateHolder(ResourceKey.create(Registry.BIOME_REGISTRY, RED_SOIL_PLAINS.getId()))));

					MultiNoiseBiomeSource moddedNoiseSource = new MultiNoiseBiomeSource(new Climate.ParameterList<>(parameters), noiseSource.preset);
					chunkGenerator.biomeSource = moddedNoiseSource;
					chunkGenerator.runtimeBiomeSource = moddedNoiseSource;
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, LIMESTONE_BIOME.getId()),
								Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, SANDSTONE_BIOME.getId()),
								Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, VOLCANICTERRAIN.getId()),
								GeoimmersionModBlocks.BASALT.get().defaultBlockState(), GeoimmersionModBlocks.BASALT.get().defaultBlockState(),
								GeoimmersionModBlocks.BASALT.get().defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, RIOLITICTERRAIN.getId()),
										GeoimmersionModBlocks.VOLCANICASH.get().defaultBlockState(),
										GeoimmersionModBlocks.VOLCANICTUFF.get().defaultBlockState(),
										GeoimmersionModBlocks.VOLCANICTUFF.get().defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, CORDILLERA.getId()),
										GeoimmersionModBlocks.SOFTSNOW.get().defaultBlockState(), Blocks.SNOW_BLOCK.defaultBlockState(),
										Blocks.SNOW_BLOCK.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, GLACIER.getId()),
										GeoimmersionModBlocks.SOFTSNOW.get().defaultBlockState(), Blocks.ICE.defaultBlockState(),
										Blocks.ICE.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registry.BIOME_REGISTRY, RED_SOIL_PLAINS.getId()),
								GeoimmersionModBlocks.RED_SOIL_GRASS.get().defaultBlockState(),
								GeoimmersionModBlocks.RED_SOIL.get().defaultBlockState(), GeoimmersionModBlocks.RED_SOIL.get().defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(),
								noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(), noiseGeneratorSettings.noiseRouter(),
								SurfaceRules.sequence(surfaceRules.toArray(i -> new SurfaceRules.RuleSource[i])), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(),
								noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct(moddedNoiseGeneratorSettings);
					}
				}
			}

		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock,
			BlockState underwaterBlock) {
		return SurfaceRules
				.ifTrue(SurfaceRules.isBiome(biomeKey),
						SurfaceRules
								.ifTrue(SurfaceRules.abovePreliminarySurface(),
										SurfaceRules.sequence(
												SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
														SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0),
																SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
												SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR),
														SurfaceRules.state(undergroundBlock)))));
	}
}
