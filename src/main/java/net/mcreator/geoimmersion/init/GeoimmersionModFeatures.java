
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.geoimmersion.world.features.ores.YellowIpeLogFeature;
import net.mcreator.geoimmersion.world.features.ores.YellowIpeLeavesFeature;
import net.mcreator.geoimmersion.world.features.ores.UppermantlekimberliteFeature;
import net.mcreator.geoimmersion.world.features.ores.UppermantlediamondkimberliteFeature;
import net.mcreator.geoimmersion.world.features.ores.TravertineFeature;
import net.mcreator.geoimmersion.world.features.ores.TorbeniteinGraniteFeature;
import net.mcreator.geoimmersion.world.features.ores.TitaniummagnetireinGabroFeature;
import net.mcreator.geoimmersion.world.features.ores.SulfurrockFeature;
import net.mcreator.geoimmersion.world.features.ores.StalactiteFeature;
import net.mcreator.geoimmersion.world.features.ores.SpodumeneingraniteFeature;
import net.mcreator.geoimmersion.world.features.ores.SodiumNitrateBlockFeature;
import net.mcreator.geoimmersion.world.features.ores.SlateFeature;
import net.mcreator.geoimmersion.world.features.ores.SkarnFeature;
import net.mcreator.geoimmersion.world.features.ores.SchistFeature;
import net.mcreator.geoimmersion.world.features.ores.SandstoneSilicifiedFeature;
import net.mcreator.geoimmersion.world.features.ores.SandstoneFeature;
import net.mcreator.geoimmersion.world.features.ores.RutileinquartiziteFeature;
import net.mcreator.geoimmersion.world.features.ores.RioliteFeature;
import net.mcreator.geoimmersion.world.features.ores.RedSoilFeature;
import net.mcreator.geoimmersion.world.features.ores.QuartizitewithhugegoldnuggetFeature;
import net.mcreator.geoimmersion.world.features.ores.QuartizitewithgoldnuggetsFeature;
import net.mcreator.geoimmersion.world.features.ores.QuartizitewithgolddustFeature;
import net.mcreator.geoimmersion.world.features.ores.QuartizitewithSilverFeature;
import net.mcreator.geoimmersion.world.features.ores.QuartiziteFeature;
import net.mcreator.geoimmersion.world.features.ores.PyritemineralFeature;
import net.mcreator.geoimmersion.world.features.ores.PuppermantleperidotiteFeature;
import net.mcreator.geoimmersion.world.features.ores.PotassiumChlorideBlockFeature;
import net.mcreator.geoimmersion.world.features.ores.PorousLimestoneFeature;
import net.mcreator.geoimmersion.world.features.ores.PolishedandesitebricksFeature;
import net.mcreator.geoimmersion.world.features.ores.PlatinuminGabroFeature;
import net.mcreator.geoimmersion.world.features.ores.PeridotiteFeature;
import net.mcreator.geoimmersion.world.features.ores.MeteoriteFeature;
import net.mcreator.geoimmersion.world.features.ores.MetasandstoneFeature;
import net.mcreator.geoimmersion.world.features.ores.MetalimestoneFeature;
import net.mcreator.geoimmersion.world.features.ores.MarbleFeature;
import net.mcreator.geoimmersion.world.features.ores.LimestoneFeature;
import net.mcreator.geoimmersion.world.features.ores.LapisLazuliinMarbleFeature;
import net.mcreator.geoimmersion.world.features.ores.KimberliteFeature;
import net.mcreator.geoimmersion.world.features.ores.GravitySandstoneFeature;
import net.mcreator.geoimmersion.world.features.ores.GravityLimestoneFeature;
import net.mcreator.geoimmersion.world.features.ores.GraniteFeature;
import net.mcreator.geoimmersion.world.features.ores.GnaisseFeature;
import net.mcreator.geoimmersion.world.features.ores.GlaciericeFeature;
import net.mcreator.geoimmersion.world.features.ores.GalenaArgentifereFeature;
import net.mcreator.geoimmersion.world.features.ores.GabroFeature;
import net.mcreator.geoimmersion.world.features.ores.FluoriteingraniteFeature;
import net.mcreator.geoimmersion.world.features.ores.EvaporiteFeature;
import net.mcreator.geoimmersion.world.features.ores.EmeraldinGnaisseFeature;
import net.mcreator.geoimmersion.world.features.ores.DioritebrickswallFeature;
import net.mcreator.geoimmersion.world.features.ores.DioritebricksslabFeature;
import net.mcreator.geoimmersion.world.features.ores.DioritebricksFeature;
import net.mcreator.geoimmersion.world.features.ores.DioriteFeature;
import net.mcreator.geoimmersion.world.features.ores.DiamondinKimberliteFeature;
import net.mcreator.geoimmersion.world.features.ores.CopperinGabroFeature;
import net.mcreator.geoimmersion.world.features.ores.CoalonSandstoneFeature;
import net.mcreator.geoimmersion.world.features.ores.CoalinMetasandstoneFeature;
import net.mcreator.geoimmersion.world.features.ores.CinnabercrystalFeature;
import net.mcreator.geoimmersion.world.features.ores.CasseteriteonGraniteFeature;
import net.mcreator.geoimmersion.world.features.ores.BauxiteFeature;
import net.mcreator.geoimmersion.world.features.ores.BasaltFeature;
import net.mcreator.geoimmersion.world.features.ores.BandedIronFormationFeature;
import net.mcreator.geoimmersion.world.features.ores.ApatiteinGraniteFeature;
import net.mcreator.geoimmersion.world.features.ores.AndesitebrickswallFeature;
import net.mcreator.geoimmersion.world.features.ores.AndesitebricksslabFeature;
import net.mcreator.geoimmersion.world.features.ores.AndesiteFeature;
import net.mcreator.geoimmersion.world.features.lakes.BasalticLavaFeature;
import net.mcreator.geoimmersion.world.features.TravertinetrapFeature;
import net.mcreator.geoimmersion.world.features.SandstonelibrarybaseFeature;
import net.mcreator.geoimmersion.world.features.RiolitevolcanoFeature;
import net.mcreator.geoimmersion.world.features.PyramidFeature;
import net.mcreator.geoimmersion.world.features.PetrifiedTreeFeature;
import net.mcreator.geoimmersion.world.features.PantheomFeature;
import net.mcreator.geoimmersion.world.features.OillakeFeature;
import net.mcreator.geoimmersion.world.features.MeteoritestructureFeature;
import net.mcreator.geoimmersion.world.features.Meteoritestructure2Feature;
import net.mcreator.geoimmersion.world.features.MayanruinsFeature;
import net.mcreator.geoimmersion.world.features.Mayanportal2Feature;
import net.mcreator.geoimmersion.world.features.Mayanportal1Feature;
import net.mcreator.geoimmersion.world.features.MayanmonolithFeature;
import net.mcreator.geoimmersion.world.features.Kimberlitestructure1Feature;
import net.mcreator.geoimmersion.world.features.GreekruinsFeature;
import net.mcreator.geoimmersion.world.features.GreekmonumentFeature;
import net.mcreator.geoimmersion.world.features.GranitetowerFeature;
import net.mcreator.geoimmersion.world.features.GraniteboulderFeature;
import net.mcreator.geoimmersion.world.features.Graniteboulder5Feature;
import net.mcreator.geoimmersion.world.features.Graniteboulder4Feature;
import net.mcreator.geoimmersion.world.features.Graniteboulder2Feature;
import net.mcreator.geoimmersion.world.features.GranitebatholithFeature;
import net.mcreator.geoimmersion.world.features.Granitebatholith3Feature;
import net.mcreator.geoimmersion.world.features.Granitebatholith2Feature;
import net.mcreator.geoimmersion.world.features.GalenadiqueFeature;
import net.mcreator.geoimmersion.world.features.GabrotitaniumdiqueFeature;
import net.mcreator.geoimmersion.world.features.GabbrodiqueFeature;
import net.mcreator.geoimmersion.world.features.Gabbrodique4Feature;
import net.mcreator.geoimmersion.world.features.Gabbrodique3Feature;
import net.mcreator.geoimmersion.world.features.Gabbrodique2Feature;
import net.mcreator.geoimmersion.world.features.EsphingeFeature;
import net.mcreator.geoimmersion.world.features.EgyptlibraryFeature;
import net.mcreator.geoimmersion.world.features.DesertsmallobeliskFeature;
import net.mcreator.geoimmersion.world.features.DesertobeliskFeature;
import net.mcreator.geoimmersion.world.features.BurnedTreeFeature;
import net.mcreator.geoimmersion.world.features.BurnedTree2Feature;
import net.mcreator.geoimmersion.world.features.BasaltvolcanoFeature;
import net.mcreator.geoimmersion.world.features.Basaltvolcano2Feature;
import net.mcreator.geoimmersion.world.features.BasalttreesFeature;
import net.mcreator.geoimmersion.world.features.Basalttrees3Feature;
import net.mcreator.geoimmersion.world.features.Basalttrees2Feature;
import net.mcreator.geoimmersion.world.features.BasaltsmallvolcanosFeature;
import net.mcreator.geoimmersion.world.features.Basaltsmallvolcanos3Feature;
import net.mcreator.geoimmersion.world.features.Basaltsmallvolcanos2Feature;
import net.mcreator.geoimmersion.world.features.BasaltlakesFeature;
import net.mcreator.geoimmersion.world.features.BasaltdiqueFeature;
import net.mcreator.geoimmersion.world.features.Basaltdique2Feature;
import net.mcreator.geoimmersion.world.features.BasaltcolumnarFeature;
import net.mcreator.geoimmersion.world.features.BasaltassholeFeature;
import net.mcreator.geoimmersion.world.features.Basaltasshole2Feature;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class GeoimmersionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, GeoimmersionMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> GRANITE = register("granite", GraniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GraniteFeature.GENERATE_BIOMES, GraniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIORITE = register("diorite", DioriteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DioriteFeature.GENERATE_BIOMES, DioriteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANDESITE = register("andesite", AndesiteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AndesiteFeature.GENERATE_BIOMES, AndesiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RIOLITE = register("riolite", RioliteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RioliteFeature.GENERATE_BIOMES, RioliteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KIMBERLITE = register("kimberlite", KimberliteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, KimberliteFeature.GENERATE_BIOMES, KimberliteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GABRO = register("gabro", GabroFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GabroFeature.GENERATE_BIOMES, GabroFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PERIDOTITE = register("peridotite", PeridotiteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PeridotiteFeature.GENERATE_BIOMES, PeridotiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GNAISSE = register("gnaisse", GnaisseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GnaisseFeature.GENERATE_BIOMES, GnaisseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MARBLE = register("marble", MarbleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MarbleFeature.GENERATE_BIOMES, MarbleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> QUARTIZITE = register("quartizite", QuartiziteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, QuartiziteFeature.GENERATE_BIOMES, QuartiziteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SLATE = register("slate", SlateFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SlateFeature.GENERATE_BIOMES, SlateFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCHIST = register("schist", SchistFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SchistFeature.GENERATE_BIOMES, SchistFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BAUXITE = register("bauxite", BauxiteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BauxiteFeature.GENERATE_BIOMES, BauxiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SKARN = register("skarn", SkarnFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SkarnFeature.GENERATE_BIOMES, SkarnFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDSTONE = register("sandstone", SandstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SandstoneFeature.GENERATE_BIOMES, SandstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRAVITY_SANDSTONE = register("gravity_sandstone", GravitySandstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GravitySandstoneFeature.GENERATE_BIOMES,
					GravitySandstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> METASANDSTONE = register("metasandstone", MetasandstoneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MetasandstoneFeature.GENERATE_BIOMES, MetasandstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LIMESTONE = register("limestone", LimestoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LimestoneFeature.GENERATE_BIOMES, LimestoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRAVITY_LIMESTONE = register("gravity_limestone", GravityLimestoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GravityLimestoneFeature.GENERATE_BIOMES,
					GravityLimestoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> METALIMESTONE = register("metalimestone", MetalimestoneFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, MetalimestoneFeature.GENERATE_BIOMES, MetalimestoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> STALACTITE = register("stalactite", StalactiteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, StalactiteFeature.GENERATE_BIOMES, StalactiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EVAPORITE = register("evaporite", EvaporiteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EvaporiteFeature.GENERATE_BIOMES, EvaporiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDSTONE_SILICIFIED = register("sandstone_silicified", SandstoneSilicifiedFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SandstoneSilicifiedFeature.GENERATE_BIOMES,
					SandstoneSilicifiedFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BANDED_IRON_FORMATION = register("banded_iron_formation", BandedIronFormationFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BandedIronFormationFeature.GENERATE_BIOMES,
					BandedIronFormationFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TRAVERTINE = register("travertine", TravertineFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TravertineFeature.GENERATE_BIOMES, TravertineFeature::placedFeature));
	public static final RegistryObject<Feature<?>> FLUORITEINGRANITE = register("fluoriteingranite", FluoriteingraniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FluoriteingraniteFeature.GENERATE_BIOMES,
					FluoriteingraniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CASSETERITEON_GRANITE = register("casseteriteon_granite", CasseteriteonGraniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CasseteriteonGraniteFeature.GENERATE_BIOMES,
					CasseteriteonGraniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TORBENITEIN_GRANITE = register("torbenitein_granite", TorbeniteinGraniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TorbeniteinGraniteFeature.GENERATE_BIOMES,
					TorbeniteinGraniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SPODUMENEINGRANITE = register("spodumeneingranite", SpodumeneingraniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SpodumeneingraniteFeature.GENERATE_BIOMES,
					SpodumeneingraniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> APATITEIN_GRANITE = register("apatitein_granite", ApatiteinGraniteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ApatiteinGraniteFeature.GENERATE_BIOMES,
					ApatiteinGraniteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COPPERIN_GABRO = register("copperin_gabro", CopperinGabroFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, CopperinGabroFeature.GENERATE_BIOMES, CopperinGabroFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PLATINUMIN_GABRO = register("platinumin_gabro", PlatinuminGabroFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PlatinuminGabroFeature.GENERATE_BIOMES,
					PlatinuminGabroFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TITANIUMMAGNETIREIN_GABRO = register("titaniummagnetirein_gabro",
			TitaniummagnetireinGabroFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					TitaniummagnetireinGabroFeature.GENERATE_BIOMES, TitaniummagnetireinGabroFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIAMONDIN_KIMBERLITE = register("diamondin_kimberlite", DiamondinKimberliteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DiamondinKimberliteFeature.GENERATE_BIOMES,
					DiamondinKimberliteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GALENA_ARGENTIFERE = register("galena_argentifere", GalenaArgentifereFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GalenaArgentifereFeature.GENERATE_BIOMES,
					GalenaArgentifereFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EMERALDIN_GNAISSE = register("emeraldin_gnaisse", EmeraldinGnaisseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EmeraldinGnaisseFeature.GENERATE_BIOMES,
					EmeraldinGnaisseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> LAPIS_LAZULIIN_MARBLE = register("lapis_lazuliin_marble", LapisLazuliinMarbleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LapisLazuliinMarbleFeature.GENERATE_BIOMES,
					LapisLazuliinMarbleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> QUARTIZITEWITHGOLDDUST = register("quartizitewithgolddust", QuartizitewithgolddustFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, QuartizitewithgolddustFeature.GENERATE_BIOMES,
					QuartizitewithgolddustFeature::placedFeature));
	public static final RegistryObject<Feature<?>> QUARTIZITEWITHGOLDNUGGETS = register("quartizitewithgoldnuggets",
			QuartizitewithgoldnuggetsFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					QuartizitewithgoldnuggetsFeature.GENERATE_BIOMES, QuartizitewithgoldnuggetsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> QUARTIZITEWITHHUGEGOLDNUGGET = register("quartizitewithhugegoldnugget",
			QuartizitewithhugegoldnuggetFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					QuartizitewithhugegoldnuggetFeature.GENERATE_BIOMES, QuartizitewithhugegoldnuggetFeature::placedFeature));
	public static final RegistryObject<Feature<?>> QUARTIZITEWITH_SILVER = register("quartizitewith_silver", QuartizitewithSilverFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, QuartizitewithSilverFeature.GENERATE_BIOMES,
					QuartizitewithSilverFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RUTILEINQUARTIZITE = register("rutileinquartizite", RutileinquartiziteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RutileinquartiziteFeature.GENERATE_BIOMES,
					RutileinquartiziteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COALIN_METASANDSTONE = register("coalin_metasandstone", CoalinMetasandstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoalinMetasandstoneFeature.GENERATE_BIOMES,
					CoalinMetasandstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COALON_SANDSTONE = register("coalon_sandstone", CoalonSandstoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CoalonSandstoneFeature.GENERATE_BIOMES,
					CoalonSandstoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> METEORITE = register("meteorite", MeteoriteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, MeteoriteFeature.GENERATE_BIOMES, MeteoriteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GLACIERICE = register("glacierice", GlaciericeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GlaciericeFeature.GENERATE_BIOMES, GlaciericeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SULFURROCK = register("sulfurrock", SulfurrockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SulfurrockFeature.GENERATE_BIOMES, SulfurrockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SODIUM_NITRATE_BLOCK = register("sodium_nitrate_block", SodiumNitrateBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SodiumNitrateBlockFeature.GENERATE_BIOMES,
					SodiumNitrateBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POTASSIUM_CHLORIDE_BLOCK = register("potassium_chloride_block",
			PotassiumChlorideBlockFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					PotassiumChlorideBlockFeature.GENERATE_BIOMES, PotassiumChlorideBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RED_SOIL = register("red_soil", RedSoilFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RedSoilFeature.GENERATE_BIOMES, RedSoilFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POROUS_LIMESTONE = register("porous_limestone", PorousLimestoneFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PorousLimestoneFeature.GENERATE_BIOMES,
					PorousLimestoneFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIORITEBRICKS = register("dioritebricks", DioritebricksFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, DioritebricksFeature.GENERATE_BIOMES, DioritebricksFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIORITEBRICKSSLAB = register("dioritebricksslab", DioritebricksslabFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DioritebricksslabFeature.GENERATE_BIOMES,
					DioritebricksslabFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DIORITEBRICKSWALL = register("dioritebrickswall", DioritebrickswallFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, DioritebrickswallFeature.GENERATE_BIOMES,
					DioritebrickswallFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POLISHEDANDESITEBRICKS = register("polishedandesitebricks", PolishedandesitebricksFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PolishedandesitebricksFeature.GENERATE_BIOMES,
					PolishedandesitebricksFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANDESITEBRICKSSLAB = register("andesitebricksslab", AndesitebricksslabFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AndesitebricksslabFeature.GENERATE_BIOMES,
					AndesitebricksslabFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ANDESITEBRICKSWALL = register("andesitebrickswall", AndesitebrickswallFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, AndesitebrickswallFeature.GENERATE_BIOMES,
					AndesitebrickswallFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTIC_LAVA = register("basaltic_lava", BasalticLavaFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, BasalticLavaFeature.GENERATE_BIOMES, BasalticLavaFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_IPE_LOG = register("yellow_ipe_log", YellowIpeLogFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, YellowIpeLogFeature.GENERATE_BIOMES, YellowIpeLogFeature::placedFeature));
	public static final RegistryObject<Feature<?>> YELLOW_IPE_LEAVES = register("yellow_ipe_leaves", YellowIpeLeavesFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, YellowIpeLeavesFeature.GENERATE_BIOMES,
					YellowIpeLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PYRITEMINERAL = register("pyritemineral", PyritemineralFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, PyritemineralFeature.GENERATE_BIOMES, PyritemineralFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CINNABERCRYSTAL = register("cinnabercrystal", CinnabercrystalFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CinnabercrystalFeature.GENERATE_BIOMES,
					CinnabercrystalFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTSMALLVOLCANOS = register("basaltsmallvolcanos", BasaltsmallvolcanosFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BasaltsmallvolcanosFeature.GENERATE_BIOMES,
					BasaltsmallvolcanosFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTLAKES = register("basaltlakes", BasaltlakesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BasaltlakesFeature.GENERATE_BIOMES, BasaltlakesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTTREES = register("basalttrees", BasalttreesFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BasalttreesFeature.GENERATE_BIOMES, BasalttreesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTCOLUMNAR = register("basaltcolumnar", BasaltcolumnarFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BasaltcolumnarFeature.GENERATE_BIOMES,
					BasaltcolumnarFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTASSHOLE = register("basaltasshole", BasaltassholeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BasaltassholeFeature.GENERATE_BIOMES, BasaltassholeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> RIOLITEVOLCANO = register("riolitevolcano", RiolitevolcanoFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, RiolitevolcanoFeature.GENERATE_BIOMES,
					RiolitevolcanoFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTVOLCANO = register("basaltvolcano", BasaltvolcanoFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BasaltvolcanoFeature.GENERATE_BIOMES, BasaltvolcanoFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTVOLCANO_2 = register("basaltvolcano_2", Basaltvolcano2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Basaltvolcano2Feature.GENERATE_BIOMES,
					Basaltvolcano2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBOULDER = register("graniteboulder", GraniteboulderFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GraniteboulderFeature.GENERATE_BIOMES,
					GraniteboulderFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBOULDER_2 = register("graniteboulder_2", Graniteboulder2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Graniteboulder2Feature.GENERATE_BIOMES,
					Graniteboulder2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBOULDER_4 = register("graniteboulder_4", Graniteboulder4Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Graniteboulder4Feature.GENERATE_BIOMES,
					Graniteboulder4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBOULDER_5 = register("graniteboulder_5", Graniteboulder5Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Graniteboulder5Feature.GENERATE_BIOMES,
					Graniteboulder5Feature::placedFeature));
	public static final RegistryObject<Feature<?>> KIMBERLITESTRUCTURE_1 = register("kimberlitestructure_1", Kimberlitestructure1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Kimberlitestructure1Feature.GENERATE_BIOMES,
					Kimberlitestructure1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> METEORITESTRUCTURE = register("meteoritestructure", MeteoritestructureFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, MeteoritestructureFeature.GENERATE_BIOMES,
					MeteoritestructureFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBATHOLITH = register("granitebatholith", GranitebatholithFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GranitebatholithFeature.GENERATE_BIOMES,
					GranitebatholithFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBATHOLITH_2 = register("granitebatholith_2", Granitebatholith2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Granitebatholith2Feature.GENERATE_BIOMES,
					Granitebatholith2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTDIQUE = register("basaltdique", BasaltdiqueFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BasaltdiqueFeature.GENERATE_BIOMES, BasaltdiqueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTDIQUE_2 = register("basaltdique_2", Basaltdique2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Basaltdique2Feature.GENERATE_BIOMES, Basaltdique2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GABBRODIQUE = register("gabbrodique", GabbrodiqueFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, GabbrodiqueFeature.GENERATE_BIOMES, GabbrodiqueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GABBRODIQUE_2 = register("gabbrodique_2", Gabbrodique2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_STRUCTURES, Gabbrodique2Feature.GENERATE_BIOMES, Gabbrodique2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GABBRODIQUE_3 = register("gabbrodique_3", Gabbrodique3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Gabbrodique3Feature.GENERATE_BIOMES, Gabbrodique3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GABBRODIQUE_4 = register("gabbrodique_4", Gabbrodique4Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Gabbrodique4Feature.GENERATE_BIOMES, Gabbrodique4Feature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITEBATHOLITH_3 = register("granitebatholith_3", Granitebatholith3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Granitebatholith3Feature.GENERATE_BIOMES,
					Granitebatholith3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> METEORITESTRUCTURE_2 = register("meteoritestructure_2", Meteoritestructure2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Meteoritestructure2Feature.GENERATE_BIOMES,
					Meteoritestructure2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> OILLAKE = register("oillake", OillakeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, OillakeFeature.GENERATE_BIOMES, OillakeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> TRAVERTINETRAP = register("travertinetrap", TravertinetrapFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, TravertinetrapFeature.GENERATE_BIOMES,
					TravertinetrapFeature::placedFeature));
	public static final RegistryObject<Feature<?>> EGYPTLIBRARY = register("egyptlibrary", EgyptlibraryFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, EgyptlibraryFeature.GENERATE_BIOMES, EgyptlibraryFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SANDSTONELIBRARYBASE = register("sandstonelibrarybase", SandstonelibrarybaseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SandstonelibrarybaseFeature.GENERATE_BIOMES,
					SandstonelibrarybaseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ESPHINGE = register("esphinge", EsphingeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, EsphingeFeature.GENERATE_BIOMES, EsphingeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GALENADIQUE = register("galenadique", GalenadiqueFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, GalenadiqueFeature.GENERATE_BIOMES, GalenadiqueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PYRAMID = register("pyramid", PyramidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PyramidFeature.GENERATE_BIOMES, PyramidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PANTHEOM = register("pantheom", PantheomFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, PantheomFeature.GENERATE_BIOMES, PantheomFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEKRUINS = register("greekruins", GreekruinsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, GreekruinsFeature.GENERATE_BIOMES, GreekruinsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GREEKMONUMENT = register("greekmonument", GreekmonumentFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, GreekmonumentFeature.GENERATE_BIOMES, GreekmonumentFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAYANMONOLITH = register("mayanmonolith", MayanmonolithFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, MayanmonolithFeature.GENERATE_BIOMES, MayanmonolithFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MAYANPORTAL_1 = register("mayanportal_1", Mayanportal1Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Mayanportal1Feature.GENERATE_BIOMES, Mayanportal1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MAYANPORTAL_2 = register("mayanportal_2", Mayanportal2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Mayanportal2Feature.GENERATE_BIOMES, Mayanportal2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> MAYANRUINS = register("mayanruins", MayanruinsFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, MayanruinsFeature.GENERATE_BIOMES, MayanruinsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> PUPPERMANTLEPERIDOTITE = register("puppermantleperidotite", PuppermantleperidotiteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, PuppermantleperidotiteFeature.GENERATE_BIOMES,
					PuppermantleperidotiteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> UPPERMANTLEKIMBERLITE = register("uppermantlekimberlite", UppermantlekimberliteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, UppermantlekimberliteFeature.GENERATE_BIOMES,
					UppermantlekimberliteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> UPPERMANTLEDIAMONDKIMBERLITE = register("uppermantlediamondkimberlite",
			UppermantlediamondkimberliteFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					UppermantlediamondkimberliteFeature.GENERATE_BIOMES, UppermantlediamondkimberliteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GRANITETOWER = register("granitetower", GranitetowerFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, GranitetowerFeature.GENERATE_BIOMES, GranitetowerFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DESERTOBELISK = register("desertobelisk", DesertobeliskFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, DesertobeliskFeature.GENERATE_BIOMES, DesertobeliskFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DESERTSMALLOBELISK = register("desertsmallobelisk", DesertsmallobeliskFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DesertsmallobeliskFeature.GENERATE_BIOMES,
					DesertsmallobeliskFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GABROTITANIUMDIQUE = register("gabrotitaniumdique", GabrotitaniumdiqueFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, GabrotitaniumdiqueFeature.GENERATE_BIOMES,
					GabrotitaniumdiqueFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTSMALLVOLCANOS_2 = register("basaltsmallvolcanos_2", Basaltsmallvolcanos2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Basaltsmallvolcanos2Feature.GENERATE_BIOMES,
					Basaltsmallvolcanos2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTASSHOLE_2 = register("basaltasshole_2", Basaltasshole2Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Basaltasshole2Feature.GENERATE_BIOMES,
					Basaltasshole2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTTREES_2 = register("basalttrees_2", Basalttrees2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Basalttrees2Feature.GENERATE_BIOMES, Basalttrees2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTTREES_3 = register("basalttrees_3", Basalttrees3Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, Basalttrees3Feature.GENERATE_BIOMES, Basalttrees3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALTSMALLVOLCANOS_3 = register("basaltsmallvolcanos_3", Basaltsmallvolcanos3Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Basaltsmallvolcanos3Feature.GENERATE_BIOMES,
					Basaltsmallvolcanos3Feature::placedFeature));
	public static final RegistryObject<Feature<?>> BURNED_TREE = register("burned_tree", BurnedTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BurnedTreeFeature.GENERATE_BIOMES, BurnedTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BURNED_TREE_2 = register("burned_tree_2", BurnedTree2Feature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, BurnedTree2Feature.GENERATE_BIOMES, BurnedTree2Feature::placedFeature));
	public static final RegistryObject<Feature<?>> PETRIFIED_TREE = register("petrified_tree", PetrifiedTreeFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, PetrifiedTreeFeature.GENERATE_BIOMES, PetrifiedTreeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BASALT = register("basalt", BasaltFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, BasaltFeature.GENERATE_BIOMES, BasaltFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
