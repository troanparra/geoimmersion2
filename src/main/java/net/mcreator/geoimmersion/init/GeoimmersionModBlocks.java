
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.geoimmersion.block.YellowIpeWoodBlock;
import net.mcreator.geoimmersion.block.YellowIpePlanksBlock;
import net.mcreator.geoimmersion.block.YellowIpeLogBlock;
import net.mcreator.geoimmersion.block.YellowIpeLeavesBlock;
import net.mcreator.geoimmersion.block.VolcanoashBlock;
import net.mcreator.geoimmersion.block.VolcanoSmokeBlock;
import net.mcreator.geoimmersion.block.VolcanictuffBlock;
import net.mcreator.geoimmersion.block.VolcanicashBlock;
import net.mcreator.geoimmersion.block.UppermantlekimberliteBlock;
import net.mcreator.geoimmersion.block.UppermantlediamondkimberliteBlock;
import net.mcreator.geoimmersion.block.UpperMantlePortalBlock;
import net.mcreator.geoimmersion.block.TravertinewallBlock;
import net.mcreator.geoimmersion.block.TravertinestairsBlock;
import net.mcreator.geoimmersion.block.TravertineslabBlock;
import net.mcreator.geoimmersion.block.TravertineBlock;
import net.mcreator.geoimmersion.block.TorbeniteinGraniteBlock;
import net.mcreator.geoimmersion.block.TitaniummagnetireinGabroBlock;
import net.mcreator.geoimmersion.block.SulfurrockBlock;
import net.mcreator.geoimmersion.block.SteelblockBlock;
import net.mcreator.geoimmersion.block.StalactiteBlock;
import net.mcreator.geoimmersion.block.StairschistbricksBlock;
import net.mcreator.geoimmersion.block.SpodumeneingraniteBlock;
import net.mcreator.geoimmersion.block.SoftsnowBlock;
import net.mcreator.geoimmersion.block.SodiumNitrateBlockBlock;
import net.mcreator.geoimmersion.block.SlatewallBlock;
import net.mcreator.geoimmersion.block.SlateTileWallBlock;
import net.mcreator.geoimmersion.block.SlateTileStairsBlock;
import net.mcreator.geoimmersion.block.SlateTileSlabBlock;
import net.mcreator.geoimmersion.block.SlateTileBlock;
import net.mcreator.geoimmersion.block.SlateStairsBlock;
import net.mcreator.geoimmersion.block.SlateSlabBlock;
import net.mcreator.geoimmersion.block.SlateBlock;
import net.mcreator.geoimmersion.block.SkarnBlock;
import net.mcreator.geoimmersion.block.Simplecarvedsandstone1Block;
import net.mcreator.geoimmersion.block.SchostslabBlock;
import net.mcreator.geoimmersion.block.SchistwallBlock;
import net.mcreator.geoimmersion.block.SchiststairsBlock;
import net.mcreator.geoimmersion.block.SchistslabbricksBlock;
import net.mcreator.geoimmersion.block.SchistslabBlock;
import net.mcreator.geoimmersion.block.SchistbricksBlock;
import net.mcreator.geoimmersion.block.SchistBrickWallBlock;
import net.mcreator.geoimmersion.block.SchistBlock;
import net.mcreator.geoimmersion.block.SandstonewallBlock;
import net.mcreator.geoimmersion.block.SandstonestairsBlock;
import net.mcreator.geoimmersion.block.SandstonestairbricksBlock;
import net.mcreator.geoimmersion.block.SandstoneslabBlock;
import net.mcreator.geoimmersion.block.SandstonebrickswallBlock;
import net.mcreator.geoimmersion.block.SandstonebricksslabBlock;
import net.mcreator.geoimmersion.block.SandstoneSilicifiedBlock;
import net.mcreator.geoimmersion.block.SandstoneBlock;
import net.mcreator.geoimmersion.block.RutileinquartiziteBlock;
import net.mcreator.geoimmersion.block.RiolitewallBlock;
import net.mcreator.geoimmersion.block.RiolitestairsBlock;
import net.mcreator.geoimmersion.block.RioliteslabBlock;
import net.mcreator.geoimmersion.block.RioliteBlock;
import net.mcreator.geoimmersion.block.RedSoilGrassBlock;
import net.mcreator.geoimmersion.block.RedSoilBlock;
import net.mcreator.geoimmersion.block.QuartizitewithhugegoldnuggetBlock;
import net.mcreator.geoimmersion.block.QuartizitewithgoldnuggetsBlock;
import net.mcreator.geoimmersion.block.QuartizitewithgolddustBlock;
import net.mcreator.geoimmersion.block.QuartizitewithSilverBlock;
import net.mcreator.geoimmersion.block.QuartiziteBlock;
import net.mcreator.geoimmersion.block.PyritemineralBlock;
import net.mcreator.geoimmersion.block.PuppermantleperidotiteBlock;
import net.mcreator.geoimmersion.block.PotassiumChlorideBlockBlock;
import net.mcreator.geoimmersion.block.PorousLimestoneBlock;
import net.mcreator.geoimmersion.block.PolishedtravertineBlock;
import net.mcreator.geoimmersion.block.PolishedslatestairsBlock;
import net.mcreator.geoimmersion.block.PolishedslateslabBlock;
import net.mcreator.geoimmersion.block.PolishedschistBlock;
import net.mcreator.geoimmersion.block.PolishedsandstonewallBlock;
import net.mcreator.geoimmersion.block.PolishedsandstonestairsBlock;
import net.mcreator.geoimmersion.block.PolishedsandstoneslabBlock;
import net.mcreator.geoimmersion.block.PolishedsandstonebricksBlock;
import net.mcreator.geoimmersion.block.PolishedsandstoneBlock;
import net.mcreator.geoimmersion.block.PolishedrioliteBlock;
import net.mcreator.geoimmersion.block.PolishedperidotiteslabBlock;
import net.mcreator.geoimmersion.block.PolishedperidotiteBlock;
import net.mcreator.geoimmersion.block.PolishedmarblewallBlock;
import net.mcreator.geoimmersion.block.PolishedmarblestairsBlock;
import net.mcreator.geoimmersion.block.PolishedmarbleslabBlock;
import net.mcreator.geoimmersion.block.PolishedlimestoneBlock;
import net.mcreator.geoimmersion.block.PolishedgranitewallBlock;
import net.mcreator.geoimmersion.block.PolishedgraniteBlock;
import net.mcreator.geoimmersion.block.PolishedgnaissBlock;
import net.mcreator.geoimmersion.block.PolishedgabbroslabBlock;
import net.mcreator.geoimmersion.block.PolisheddioritewallBlock;
import net.mcreator.geoimmersion.block.PolisheddioritestairsBlock;
import net.mcreator.geoimmersion.block.PolisheddioriteslabBlock;
import net.mcreator.geoimmersion.block.PolisheddiabasewallBlock;
import net.mcreator.geoimmersion.block.PolisheddiabaseBlock;
import net.mcreator.geoimmersion.block.PolishedbasaltwallBlock;
import net.mcreator.geoimmersion.block.PolishedbasaltstairsBlock;
import net.mcreator.geoimmersion.block.PolishedbasaltslabsBlock;
import net.mcreator.geoimmersion.block.PolishedbasaltBlock;
import net.mcreator.geoimmersion.block.PolishedandesitewallBlock;
import net.mcreator.geoimmersion.block.PolishedandesitestairsBlock;
import net.mcreator.geoimmersion.block.PolishedandesiteslabsBlock;
import net.mcreator.geoimmersion.block.PolishedandesitebricksBlock;
import net.mcreator.geoimmersion.block.PolishedandesiteBlock;
import net.mcreator.geoimmersion.block.PolishedWallGabbroBlock;
import net.mcreator.geoimmersion.block.PolishedSlatewallBlock;
import net.mcreator.geoimmersion.block.PolishedSlateBlock;
import net.mcreator.geoimmersion.block.PolishedSchistWallBlock;
import net.mcreator.geoimmersion.block.PolishedSchistStairsBlock;
import net.mcreator.geoimmersion.block.PolishedRioliteStairsBlock;
import net.mcreator.geoimmersion.block.PolishedRhyoliteWallBlock;
import net.mcreator.geoimmersion.block.PolishedRhyoliteSlabBlock;
import net.mcreator.geoimmersion.block.PolishedPerioditeStairsBlock;
import net.mcreator.geoimmersion.block.PolishedPeridotiteWallBlock;
import net.mcreator.geoimmersion.block.PolishedMarbleBlock;
import net.mcreator.geoimmersion.block.PolishedLimestonewallBlock;
import net.mcreator.geoimmersion.block.PolishedLimestoneStairsBlock;
import net.mcreator.geoimmersion.block.PolishedLimestoneSlabBlock;
import net.mcreator.geoimmersion.block.PolishedKimberliteWallBlock;
import net.mcreator.geoimmersion.block.PolishedKimberliteStairsBlock;
import net.mcreator.geoimmersion.block.PolishedKimberliteSlabBlock;
import net.mcreator.geoimmersion.block.PolishedKimberliteBlock;
import net.mcreator.geoimmersion.block.PolishedGranitestairsBlock;
import net.mcreator.geoimmersion.block.PolishedGraniteSlabBlock;
import net.mcreator.geoimmersion.block.PolishedGneissWallBlock;
import net.mcreator.geoimmersion.block.PolishedGneissStairsBlock;
import net.mcreator.geoimmersion.block.PolishedGneissSlabBlock;
import net.mcreator.geoimmersion.block.PolishedGabbroStairsBlock;
import net.mcreator.geoimmersion.block.PolishedGabbroBlock;
import net.mcreator.geoimmersion.block.PolishedDioriteBlock;
import net.mcreator.geoimmersion.block.PolishedDiabaseStairsBlock;
import net.mcreator.geoimmersion.block.PolishedDiabaseSlabBlock;
import net.mcreator.geoimmersion.block.PlatinuminGabroBlock;
import net.mcreator.geoimmersion.block.PetrifiedwoodBlock;
import net.mcreator.geoimmersion.block.PeridotitewallBlock;
import net.mcreator.geoimmersion.block.PeridotitestairsBlock;
import net.mcreator.geoimmersion.block.PeridotiteslabBlock;
import net.mcreator.geoimmersion.block.PeridotitebricksstairsrecipeBlock;
import net.mcreator.geoimmersion.block.PeridotitebricksslabBlock;
import net.mcreator.geoimmersion.block.PeridotitebricksBlock;
import net.mcreator.geoimmersion.block.PeridotiteBlock;
import net.mcreator.geoimmersion.block.PeridotiebrickswallBlock;
import net.mcreator.geoimmersion.block.OldchestBlock;
import net.mcreator.geoimmersion.block.OilBlock;
import net.mcreator.geoimmersion.block.NobelsDynamiteBlock;
import net.mcreator.geoimmersion.block.MineraltableBlock;
import net.mcreator.geoimmersion.block.MineralcentrifugueBlock;
import net.mcreator.geoimmersion.block.MineralCentrigugueOFFBlock;
import net.mcreator.geoimmersion.block.MeteoritedroppedBlock;
import net.mcreator.geoimmersion.block.MeteoriteBlock;
import net.mcreator.geoimmersion.block.MetasandstoneBlock;
import net.mcreator.geoimmersion.block.MetalimestoneBlock;
import net.mcreator.geoimmersion.block.MarblewallBlock;
import net.mcreator.geoimmersion.block.MarblestairsBlock;
import net.mcreator.geoimmersion.block.MarbleslabBlock;
import net.mcreator.geoimmersion.block.MarblepillartopBlock;
import net.mcreator.geoimmersion.block.MarblepillarbaseBlock;
import net.mcreator.geoimmersion.block.MarblepillarBlock;
import net.mcreator.geoimmersion.block.MarblebrickswallBlock;
import net.mcreator.geoimmersion.block.MarblebricksstairsBlock;
import net.mcreator.geoimmersion.block.MarblebricksstairBlock;
import net.mcreator.geoimmersion.block.MarblebricksslabBlock;
import net.mcreator.geoimmersion.block.MarblebricksBlock;
import net.mcreator.geoimmersion.block.MarbleBlock;
import net.mcreator.geoimmersion.block.MagmadropsBlock;
import net.mcreator.geoimmersion.block.LimestonewallBlock;
import net.mcreator.geoimmersion.block.LimestonestairsBlock;
import net.mcreator.geoimmersion.block.LimestoneslabBlock;
import net.mcreator.geoimmersion.block.LimestonebrickswallBlock;
import net.mcreator.geoimmersion.block.LimestonebricksstairsBlock;
import net.mcreator.geoimmersion.block.LimestonebricksslabBlock;
import net.mcreator.geoimmersion.block.LimestonebricksBlock;
import net.mcreator.geoimmersion.block.LimestoneBlock;
import net.mcreator.geoimmersion.block.LightBlock;
import net.mcreator.geoimmersion.block.LapisLazuliinMarbleBlock;
import net.mcreator.geoimmersion.block.KimberlitewallBlock;
import net.mcreator.geoimmersion.block.KimberlitestairsBlock;
import net.mcreator.geoimmersion.block.KimberliteslabBlock;
import net.mcreator.geoimmersion.block.KimberlitebrickswallBlock;
import net.mcreator.geoimmersion.block.KimberlitebricksstairsBlock;
import net.mcreator.geoimmersion.block.KimberlitebricksslabBlock;
import net.mcreator.geoimmersion.block.KimberliteBlock;
import net.mcreator.geoimmersion.block.KImberlitebricksBlock;
import net.mcreator.geoimmersion.block.GravitySandstoneBlock;
import net.mcreator.geoimmersion.block.GravityLimestoneBlock;
import net.mcreator.geoimmersion.block.GranitewallBlock;
import net.mcreator.geoimmersion.block.GranitestairsBlock;
import net.mcreator.geoimmersion.block.GraniteslabBlock;
import net.mcreator.geoimmersion.block.GranitebrickswallsBlock;
import net.mcreator.geoimmersion.block.GranitebricksstairBlock;
import net.mcreator.geoimmersion.block.GranitebricksslabBlock;
import net.mcreator.geoimmersion.block.GranitebricksBlock;
import net.mcreator.geoimmersion.block.GraniteBlock;
import net.mcreator.geoimmersion.block.GneissBricksWallBlock;
import net.mcreator.geoimmersion.block.GneissBricksStairsBlock;
import net.mcreator.geoimmersion.block.GnaisswallBlock;
import net.mcreator.geoimmersion.block.GnaissstairsBlock;
import net.mcreator.geoimmersion.block.GnaissslabBlock;
import net.mcreator.geoimmersion.block.GnaisseBlock;
import net.mcreator.geoimmersion.block.GnaissbricksslabBlock;
import net.mcreator.geoimmersion.block.GnaissbricksBlock;
import net.mcreator.geoimmersion.block.GlaciericestairsBlock;
import net.mcreator.geoimmersion.block.GlaciericeslabBlock;
import net.mcreator.geoimmersion.block.GlaciericebrickswallBlock;
import net.mcreator.geoimmersion.block.GlaciericebricksstairsBlock;
import net.mcreator.geoimmersion.block.GlaciericebricksslabBlock;
import net.mcreator.geoimmersion.block.GlaciericebricksBlock;
import net.mcreator.geoimmersion.block.GlaciericeBlock;
import net.mcreator.geoimmersion.block.GeofurnaceoffBlock;
import net.mcreator.geoimmersion.block.GeofurnaceBlock;
import net.mcreator.geoimmersion.block.GalenaBlock;
import net.mcreator.geoimmersion.block.GalenaArgentifereBlock;
import net.mcreator.geoimmersion.block.GabroBlock;
import net.mcreator.geoimmersion.block.GabbrowallBlock;
import net.mcreator.geoimmersion.block.GabbrostairsBlock;
import net.mcreator.geoimmersion.block.GabbrobrickswallBlock;
import net.mcreator.geoimmersion.block.GabbrobricksstairsBlock;
import net.mcreator.geoimmersion.block.GabbrobricksslabBlock;
import net.mcreator.geoimmersion.block.GabbrobricksBlock;
import net.mcreator.geoimmersion.block.GabbroSlabBlock;
import net.mcreator.geoimmersion.block.GLaciericewallBlock;
import net.mcreator.geoimmersion.block.FluoriteingraniteBlock;
import net.mcreator.geoimmersion.block.EvaporiteBlock;
import net.mcreator.geoimmersion.block.EmeraldinGnaisseBlock;
import net.mcreator.geoimmersion.block.DioritewallBlock;
import net.mcreator.geoimmersion.block.DioritestairsBlock;
import net.mcreator.geoimmersion.block.DioriteslabBlock;
import net.mcreator.geoimmersion.block.DioritebrickswallBlock;
import net.mcreator.geoimmersion.block.DioritebricksstairsBlock;
import net.mcreator.geoimmersion.block.DioritebricksslabBlock;
import net.mcreator.geoimmersion.block.DioritebricksBlock;
import net.mcreator.geoimmersion.block.DioriteBlock;
import net.mcreator.geoimmersion.block.DiamondinKimberliteBlock;
import net.mcreator.geoimmersion.block.DiabasewallBlock;
import net.mcreator.geoimmersion.block.DiabasestairsBlock;
import net.mcreator.geoimmersion.block.DiabaseslabBlock;
import net.mcreator.geoimmersion.block.DiabasebrickswallBlock;
import net.mcreator.geoimmersion.block.DiabasebricksstairsBlock;
import net.mcreator.geoimmersion.block.DiabasebricksslabBlock;
import net.mcreator.geoimmersion.block.DiabasebricksBlock;
import net.mcreator.geoimmersion.block.DiabaseBlock;
import net.mcreator.geoimmersion.block.CopperinGabroBlock;
import net.mcreator.geoimmersion.block.ContaminateddirtBlock;
import net.mcreator.geoimmersion.block.ColumnarbasaltBlock;
import net.mcreator.geoimmersion.block.CoalonlimestoneBlock;
import net.mcreator.geoimmersion.block.CoalonSandstoneBlock;
import net.mcreator.geoimmersion.block.CoalonMetalimestoneBlock;
import net.mcreator.geoimmersion.block.CoalinMetasandstoneBlock;
import net.mcreator.geoimmersion.block.CinnabercrystalBlock;
import net.mcreator.geoimmersion.block.Caverdmarble2Block;
import net.mcreator.geoimmersion.block.CasseteriteonGraniteBlock;
import net.mcreator.geoimmersion.block.Carvedsandstone6Block;
import net.mcreator.geoimmersion.block.Carvedsandstone5Block;
import net.mcreator.geoimmersion.block.Carvedsandstone4Block;
import net.mcreator.geoimmersion.block.Carvedsandstone3Block;
import net.mcreator.geoimmersion.block.Carvedsandstone2Block;
import net.mcreator.geoimmersion.block.Carvedsandstone1Block;
import net.mcreator.geoimmersion.block.Carvedmarble4Block;
import net.mcreator.geoimmersion.block.Carvedmarble3Block;
import net.mcreator.geoimmersion.block.Carvedmarble1Block;
import net.mcreator.geoimmersion.block.Carvedlimestone4Block;
import net.mcreator.geoimmersion.block.Carvedlimestone3Block;
import net.mcreator.geoimmersion.block.Carvedlimestone2Block;
import net.mcreator.geoimmersion.block.Carvedlimestone1Block;
import net.mcreator.geoimmersion.block.Carvedbasalt3Block;
import net.mcreator.geoimmersion.block.Carvedbasalt2Block;
import net.mcreator.geoimmersion.block.Carvedbasalt1Block;
import net.mcreator.geoimmersion.block.CarvedMarble5Block;
import net.mcreator.geoimmersion.block.CarvedGabbroVIIBlock;
import net.mcreator.geoimmersion.block.CarvedGabbro6Block;
import net.mcreator.geoimmersion.block.CarvedGabbro5Block;
import net.mcreator.geoimmersion.block.CarvedGabbro4Block;
import net.mcreator.geoimmersion.block.CarvedGabbro3Block;
import net.mcreator.geoimmersion.block.CarvedGabbro2Block;
import net.mcreator.geoimmersion.block.CarvedGabbro1Block;
import net.mcreator.geoimmersion.block.BurnedwoodBlock;
import net.mcreator.geoimmersion.block.BauxiteBlock;
import net.mcreator.geoimmersion.block.BasaltwallBlock;
import net.mcreator.geoimmersion.block.BasaltstairsBlock;
import net.mcreator.geoimmersion.block.BasaltslabBlock;
import net.mcreator.geoimmersion.block.BasalticLavaBlock;
import net.mcreator.geoimmersion.block.BasaltbrickswallBlock;
import net.mcreator.geoimmersion.block.BasaltbricksstairsBlock;
import net.mcreator.geoimmersion.block.BasaltbricksslabBlock;
import net.mcreator.geoimmersion.block.BasaltbricksBlock;
import net.mcreator.geoimmersion.block.BasaltBlock;
import net.mcreator.geoimmersion.block.BandedIronFormationBlock;
import net.mcreator.geoimmersion.block.ApatiteinGraniteBlock;
import net.mcreator.geoimmersion.block.AndesitewallBlock;
import net.mcreator.geoimmersion.block.AndesitebrickswallBlock;
import net.mcreator.geoimmersion.block.AndesitebricksstairsBlock;
import net.mcreator.geoimmersion.block.AndesitebricksslabBlock;
import net.mcreator.geoimmersion.block.AndesiteStairsBlock;
import net.mcreator.geoimmersion.block.AndesiteSlabBlock;
import net.mcreator.geoimmersion.block.AndesiteBlock;
import net.mcreator.geoimmersion.block.AmethistgeogeBlock;
import net.mcreator.geoimmersion.block.AmbarFossilBlock;
import net.mcreator.geoimmersion.GeoimmersionMod;

public class GeoimmersionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GeoimmersionMod.MODID);
	public static final RegistryObject<Block> GRANITE = REGISTRY.register("granite", () -> new GraniteBlock());
	public static final RegistryObject<Block> DIORITE = REGISTRY.register("diorite", () -> new DioriteBlock());
	public static final RegistryObject<Block> ANDESITE = REGISTRY.register("andesite", () -> new AndesiteBlock());
	public static final RegistryObject<Block> COLUMNARBASALT = REGISTRY.register("columnarbasalt", () -> new ColumnarbasaltBlock());
	public static final RegistryObject<Block> DIABASE = REGISTRY.register("diabase", () -> new DiabaseBlock());
	public static final RegistryObject<Block> RIOLITE = REGISTRY.register("riolite", () -> new RioliteBlock());
	public static final RegistryObject<Block> KIMBERLITE = REGISTRY.register("kimberlite", () -> new KimberliteBlock());
	public static final RegistryObject<Block> GABRO = REGISTRY.register("gabro", () -> new GabroBlock());
	public static final RegistryObject<Block> PERIDOTITE = REGISTRY.register("peridotite", () -> new PeridotiteBlock());
	public static final RegistryObject<Block> GNAISSE = REGISTRY.register("gnaisse", () -> new GnaisseBlock());
	public static final RegistryObject<Block> MARBLE = REGISTRY.register("marble", () -> new MarbleBlock());
	public static final RegistryObject<Block> QUARTIZITE = REGISTRY.register("quartizite", () -> new QuartiziteBlock());
	public static final RegistryObject<Block> SLATE = REGISTRY.register("slate", () -> new SlateBlock());
	public static final RegistryObject<Block> SCHIST = REGISTRY.register("schist", () -> new SchistBlock());
	public static final RegistryObject<Block> BAUXITE = REGISTRY.register("bauxite", () -> new BauxiteBlock());
	public static final RegistryObject<Block> SKARN = REGISTRY.register("skarn", () -> new SkarnBlock());
	public static final RegistryObject<Block> SANDSTONE = REGISTRY.register("sandstone", () -> new SandstoneBlock());
	public static final RegistryObject<Block> GRAVITY_SANDSTONE = REGISTRY.register("gravity_sandstone", () -> new GravitySandstoneBlock());
	public static final RegistryObject<Block> METASANDSTONE = REGISTRY.register("metasandstone", () -> new MetasandstoneBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> GRAVITY_LIMESTONE = REGISTRY.register("gravity_limestone", () -> new GravityLimestoneBlock());
	public static final RegistryObject<Block> METALIMESTONE = REGISTRY.register("metalimestone", () -> new MetalimestoneBlock());
	public static final RegistryObject<Block> STALACTITE = REGISTRY.register("stalactite", () -> new StalactiteBlock());
	public static final RegistryObject<Block> EVAPORITE = REGISTRY.register("evaporite", () -> new EvaporiteBlock());
	public static final RegistryObject<Block> SANDSTONE_SILICIFIED = REGISTRY.register("sandstone_silicified", () -> new SandstoneSilicifiedBlock());
	public static final RegistryObject<Block> BANDED_IRON_FORMATION = REGISTRY.register("banded_iron_formation",
			() -> new BandedIronFormationBlock());
	public static final RegistryObject<Block> TRAVERTINE = REGISTRY.register("travertine", () -> new TravertineBlock());
	public static final RegistryObject<Block> FLUORITEINGRANITE = REGISTRY.register("fluoriteingranite", () -> new FluoriteingraniteBlock());
	public static final RegistryObject<Block> CASSETERITEON_GRANITE = REGISTRY.register("casseteriteon_granite",
			() -> new CasseteriteonGraniteBlock());
	public static final RegistryObject<Block> TORBENITEIN_GRANITE = REGISTRY.register("torbenitein_granite", () -> new TorbeniteinGraniteBlock());
	public static final RegistryObject<Block> SPODUMENEINGRANITE = REGISTRY.register("spodumeneingranite", () -> new SpodumeneingraniteBlock());
	public static final RegistryObject<Block> APATITEIN_GRANITE = REGISTRY.register("apatitein_granite", () -> new ApatiteinGraniteBlock());
	public static final RegistryObject<Block> COPPERIN_GABRO = REGISTRY.register("copperin_gabro", () -> new CopperinGabroBlock());
	public static final RegistryObject<Block> PLATINUMIN_GABRO = REGISTRY.register("platinumin_gabro", () -> new PlatinuminGabroBlock());
	public static final RegistryObject<Block> TITANIUMMAGNETIREIN_GABRO = REGISTRY.register("titaniummagnetirein_gabro",
			() -> new TitaniummagnetireinGabroBlock());
	public static final RegistryObject<Block> DIAMONDIN_KIMBERLITE = REGISTRY.register("diamondin_kimberlite", () -> new DiamondinKimberliteBlock());
	public static final RegistryObject<Block> GALENA = REGISTRY.register("galena", () -> new GalenaBlock());
	public static final RegistryObject<Block> GALENA_ARGENTIFERE = REGISTRY.register("galena_argentifere", () -> new GalenaArgentifereBlock());
	public static final RegistryObject<Block> EMERALDIN_GNAISSE = REGISTRY.register("emeraldin_gnaisse", () -> new EmeraldinGnaisseBlock());
	public static final RegistryObject<Block> LAPIS_LAZULIIN_MARBLE = REGISTRY.register("lapis_lazuliin_marble",
			() -> new LapisLazuliinMarbleBlock());
	public static final RegistryObject<Block> QUARTIZITEWITHGOLDDUST = REGISTRY.register("quartizitewithgolddust",
			() -> new QuartizitewithgolddustBlock());
	public static final RegistryObject<Block> QUARTIZITEWITHGOLDNUGGETS = REGISTRY.register("quartizitewithgoldnuggets",
			() -> new QuartizitewithgoldnuggetsBlock());
	public static final RegistryObject<Block> QUARTIZITEWITHHUGEGOLDNUGGET = REGISTRY.register("quartizitewithhugegoldnugget",
			() -> new QuartizitewithhugegoldnuggetBlock());
	public static final RegistryObject<Block> QUARTIZITEWITH_SILVER = REGISTRY.register("quartizitewith_silver",
			() -> new QuartizitewithSilverBlock());
	public static final RegistryObject<Block> RUTILEINQUARTIZITE = REGISTRY.register("rutileinquartizite", () -> new RutileinquartiziteBlock());
	public static final RegistryObject<Block> COALONLIMESTONE = REGISTRY.register("coalonlimestone", () -> new CoalonlimestoneBlock());
	public static final RegistryObject<Block> COALON_METALIMESTONE = REGISTRY.register("coalon_metalimestone", () -> new CoalonMetalimestoneBlock());
	public static final RegistryObject<Block> COALIN_METASANDSTONE = REGISTRY.register("coalin_metasandstone", () -> new CoalinMetasandstoneBlock());
	public static final RegistryObject<Block> COALON_SANDSTONE = REGISTRY.register("coalon_sandstone", () -> new CoalonSandstoneBlock());
	public static final RegistryObject<Block> METEORITE = REGISTRY.register("meteorite", () -> new MeteoriteBlock());
	public static final RegistryObject<Block> METEORITEDROPPED = REGISTRY.register("meteoritedropped", () -> new MeteoritedroppedBlock());
	public static final RegistryObject<Block> GLACIERICE = REGISTRY.register("glacierice", () -> new GlaciericeBlock());
	public static final RegistryObject<Block> SULFURROCK = REGISTRY.register("sulfurrock", () -> new SulfurrockBlock());
	public static final RegistryObject<Block> SODIUM_NITRATE_BLOCK = REGISTRY.register("sodium_nitrate_block", () -> new SodiumNitrateBlockBlock());
	public static final RegistryObject<Block> POTASSIUM_CHLORIDE_BLOCK = REGISTRY.register("potassium_chloride_block",
			() -> new PotassiumChlorideBlockBlock());
	public static final RegistryObject<Block> VOLCANICASH = REGISTRY.register("volcanicash", () -> new VolcanicashBlock());
	public static final RegistryObject<Block> VOLCANICTUFF = REGISTRY.register("volcanictuff", () -> new VolcanictuffBlock());
	public static final RegistryObject<Block> SOFTSNOW = REGISTRY.register("softsnow", () -> new SoftsnowBlock());
	public static final RegistryObject<Block> RED_SOIL = REGISTRY.register("red_soil", () -> new RedSoilBlock());
	public static final RegistryObject<Block> POROUS_LIMESTONE = REGISTRY.register("porous_limestone", () -> new PorousLimestoneBlock());
	public static final RegistryObject<Block> CONTAMINATEDDIRT = REGISTRY.register("contaminateddirt", () -> new ContaminateddirtBlock());
	public static final RegistryObject<Block> GRANITESLAB = REGISTRY.register("graniteslab", () -> new GraniteslabBlock());
	public static final RegistryObject<Block> GRANITESTAIRS = REGISTRY.register("granitestairs", () -> new GranitestairsBlock());
	public static final RegistryObject<Block> GRANITEWALL = REGISTRY.register("granitewall", () -> new GranitewallBlock());
	public static final RegistryObject<Block> POLISHEDGRANITE = REGISTRY.register("polishedgranite", () -> new PolishedgraniteBlock());
	public static final RegistryObject<Block> POLISHED_GRANITE_SLAB = REGISTRY.register("polished_granite_slab",
			() -> new PolishedGraniteSlabBlock());
	public static final RegistryObject<Block> POLISHED_GRANITESTAIRS = REGISTRY.register("polished_granitestairs",
			() -> new PolishedGranitestairsBlock());
	public static final RegistryObject<Block> POLISHEDGRANITEWALL = REGISTRY.register("polishedgranitewall", () -> new PolishedgranitewallBlock());
	public static final RegistryObject<Block> GRANITEBRICKS = REGISTRY.register("granitebricks", () -> new GranitebricksBlock());
	public static final RegistryObject<Block> GRANITEBRICKSSLAB = REGISTRY.register("granitebricksslab", () -> new GranitebricksslabBlock());
	public static final RegistryObject<Block> GRANITEBRICKSSTAIR = REGISTRY.register("granitebricksstair", () -> new GranitebricksstairBlock());
	public static final RegistryObject<Block> GRANITEBRICKSWALLS = REGISTRY.register("granitebrickswalls", () -> new GranitebrickswallsBlock());
	public static final RegistryObject<Block> DIORITESLAB = REGISTRY.register("dioriteslab", () -> new DioriteslabBlock());
	public static final RegistryObject<Block> DIORITESTAIRS = REGISTRY.register("dioritestairs", () -> new DioritestairsBlock());
	public static final RegistryObject<Block> DIORITEWALL = REGISTRY.register("dioritewall", () -> new DioritewallBlock());
	public static final RegistryObject<Block> POLISHED_DIORITE = REGISTRY.register("polished_diorite", () -> new PolishedDioriteBlock());
	public static final RegistryObject<Block> POLISHEDDIORITESLAB = REGISTRY.register("polisheddioriteslab", () -> new PolisheddioriteslabBlock());
	public static final RegistryObject<Block> POLISHEDDIORITESTAIRS = REGISTRY.register("polisheddioritestairs",
			() -> new PolisheddioritestairsBlock());
	public static final RegistryObject<Block> POLISHEDDIORITEWALL = REGISTRY.register("polisheddioritewall", () -> new PolisheddioritewallBlock());
	public static final RegistryObject<Block> DIORITEBRICKS = REGISTRY.register("dioritebricks", () -> new DioritebricksBlock());
	public static final RegistryObject<Block> DIORITEBRICKSSLAB = REGISTRY.register("dioritebricksslab", () -> new DioritebricksslabBlock());
	public static final RegistryObject<Block> DIORITEBRICKSSTAIRS = REGISTRY.register("dioritebricksstairs", () -> new DioritebricksstairsBlock());
	public static final RegistryObject<Block> DIORITEBRICKSWALL = REGISTRY.register("dioritebrickswall", () -> new DioritebrickswallBlock());
	public static final RegistryObject<Block> ANDESITE_SLAB = REGISTRY.register("andesite_slab", () -> new AndesiteSlabBlock());
	public static final RegistryObject<Block> ANDESITE_STAIRS = REGISTRY.register("andesite_stairs", () -> new AndesiteStairsBlock());
	public static final RegistryObject<Block> ANDESITEWALL = REGISTRY.register("andesitewall", () -> new AndesitewallBlock());
	public static final RegistryObject<Block> POLISHEDANDESITE = REGISTRY.register("polishedandesite", () -> new PolishedandesiteBlock());
	public static final RegistryObject<Block> POLISHEDANDESITESLABS = REGISTRY.register("polishedandesiteslabs",
			() -> new PolishedandesiteslabsBlock());
	public static final RegistryObject<Block> POLISHEDANDESITESTAIRS = REGISTRY.register("polishedandesitestairs",
			() -> new PolishedandesitestairsBlock());
	public static final RegistryObject<Block> POLISHEDANDESITEWALL = REGISTRY.register("polishedandesitewall", () -> new PolishedandesitewallBlock());
	public static final RegistryObject<Block> POLISHEDANDESITEBRICKS = REGISTRY.register("polishedandesitebricks",
			() -> new PolishedandesitebricksBlock());
	public static final RegistryObject<Block> ANDESITEBRICKSSLAB = REGISTRY.register("andesitebricksslab", () -> new AndesitebricksslabBlock());
	public static final RegistryObject<Block> ANDESITEBRICKSSTAIRS = REGISTRY.register("andesitebricksstairs", () -> new AndesitebricksstairsBlock());
	public static final RegistryObject<Block> ANDESITEBRICKSWALL = REGISTRY.register("andesitebrickswall", () -> new AndesitebrickswallBlock());
	public static final RegistryObject<Block> BASALTSLAB = REGISTRY.register("basaltslab", () -> new BasaltslabBlock());
	public static final RegistryObject<Block> BASALTSTAIRS = REGISTRY.register("basaltstairs", () -> new BasaltstairsBlock());
	public static final RegistryObject<Block> BASALTWALL = REGISTRY.register("basaltwall", () -> new BasaltwallBlock());
	public static final RegistryObject<Block> POLISHEDBASALT = REGISTRY.register("polishedbasalt", () -> new PolishedbasaltBlock());
	public static final RegistryObject<Block> POLISHEDBASALTSLABS = REGISTRY.register("polishedbasaltslabs", () -> new PolishedbasaltslabsBlock());
	public static final RegistryObject<Block> POLISHEDBASALTSTAIRS = REGISTRY.register("polishedbasaltstairs", () -> new PolishedbasaltstairsBlock());
	public static final RegistryObject<Block> POLISHEDBASALTWALL = REGISTRY.register("polishedbasaltwall", () -> new PolishedbasaltwallBlock());
	public static final RegistryObject<Block> BASALTBRICKS = REGISTRY.register("basaltbricks", () -> new BasaltbricksBlock());
	public static final RegistryObject<Block> BASALTBRICKSSLAB = REGISTRY.register("basaltbricksslab", () -> new BasaltbricksslabBlock());
	public static final RegistryObject<Block> BASALTBRICKSSTAIRS = REGISTRY.register("basaltbricksstairs", () -> new BasaltbricksstairsBlock());
	public static final RegistryObject<Block> BASALTBRICKSWALL = REGISTRY.register("basaltbrickswall", () -> new BasaltbrickswallBlock());
	public static final RegistryObject<Block> DIABASESLAB = REGISTRY.register("diabaseslab", () -> new DiabaseslabBlock());
	public static final RegistryObject<Block> DIABASESTAIRS = REGISTRY.register("diabasestairs", () -> new DiabasestairsBlock());
	public static final RegistryObject<Block> DIABASEWALL = REGISTRY.register("diabasewall", () -> new DiabasewallBlock());
	public static final RegistryObject<Block> POLISHEDDIABASE = REGISTRY.register("polisheddiabase", () -> new PolisheddiabaseBlock());
	public static final RegistryObject<Block> POLISHED_DIABASE_SLAB = REGISTRY.register("polished_diabase_slab",
			() -> new PolishedDiabaseSlabBlock());
	public static final RegistryObject<Block> POLISHED_DIABASE_STAIRS = REGISTRY.register("polished_diabase_stairs",
			() -> new PolishedDiabaseStairsBlock());
	public static final RegistryObject<Block> POLISHEDDIABASEWALL = REGISTRY.register("polisheddiabasewall", () -> new PolisheddiabasewallBlock());
	public static final RegistryObject<Block> DIABASEBRICKS = REGISTRY.register("diabasebricks", () -> new DiabasebricksBlock());
	public static final RegistryObject<Block> DIABASEBRICKSSLAB = REGISTRY.register("diabasebricksslab", () -> new DiabasebricksslabBlock());
	public static final RegistryObject<Block> DIABASEBRICKSSTAIRS = REGISTRY.register("diabasebricksstairs", () -> new DiabasebricksstairsBlock());
	public static final RegistryObject<Block> DIABASEBRICKSWALL = REGISTRY.register("diabasebrickswall", () -> new DiabasebrickswallBlock());
	public static final RegistryObject<Block> RIOLITESLAB = REGISTRY.register("rioliteslab", () -> new RioliteslabBlock());
	public static final RegistryObject<Block> RIOLITESTAIRS = REGISTRY.register("riolitestairs", () -> new RiolitestairsBlock());
	public static final RegistryObject<Block> RIOLITEWALL = REGISTRY.register("riolitewall", () -> new RiolitewallBlock());
	public static final RegistryObject<Block> POLISHEDRIOLITE = REGISTRY.register("polishedriolite", () -> new PolishedrioliteBlock());
	public static final RegistryObject<Block> POLISHED_RHYOLITE_SLAB = REGISTRY.register("polished_rhyolite_slab",
			() -> new PolishedRhyoliteSlabBlock());
	public static final RegistryObject<Block> POLISHED_RIOLITE_STAIRS = REGISTRY.register("polished_riolite_stairs",
			() -> new PolishedRioliteStairsBlock());
	public static final RegistryObject<Block> POLISHED_RHYOLITE_WALL = REGISTRY.register("polished_rhyolite_wall",
			() -> new PolishedRhyoliteWallBlock());
	public static final RegistryObject<Block> KIMBERLITESLAB = REGISTRY.register("kimberliteslab", () -> new KimberliteslabBlock());
	public static final RegistryObject<Block> KIMBERLITESTAIRS = REGISTRY.register("kimberlitestairs", () -> new KimberlitestairsBlock());
	public static final RegistryObject<Block> KIMBERLITEWALL = REGISTRY.register("kimberlitewall", () -> new KimberlitewallBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE = REGISTRY.register("polished_kimberlite", () -> new PolishedKimberliteBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_SLAB = REGISTRY.register("polished_kimberlite_slab",
			() -> new PolishedKimberliteSlabBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_STAIRS = REGISTRY.register("polished_kimberlite_stairs",
			() -> new PolishedKimberliteStairsBlock());
	public static final RegistryObject<Block> POLISHED_KIMBERLITE_WALL = REGISTRY.register("polished_kimberlite_wall",
			() -> new PolishedKimberliteWallBlock());
	public static final RegistryObject<Block> K_IMBERLITEBRICKS = REGISTRY.register("k_imberlitebricks", () -> new KImberlitebricksBlock());
	public static final RegistryObject<Block> KIMBERLITEBRICKSSLAB = REGISTRY.register("kimberlitebricksslab", () -> new KimberlitebricksslabBlock());
	public static final RegistryObject<Block> KIMBERLITEBRICKSSTAIRS = REGISTRY.register("kimberlitebricksstairs",
			() -> new KimberlitebricksstairsBlock());
	public static final RegistryObject<Block> KIMBERLITEBRICKSWALL = REGISTRY.register("kimberlitebrickswall", () -> new KimberlitebrickswallBlock());
	public static final RegistryObject<Block> GABBRO_SLAB = REGISTRY.register("gabbro_slab", () -> new GabbroSlabBlock());
	public static final RegistryObject<Block> GABBROSTAIRS = REGISTRY.register("gabbrostairs", () -> new GabbrostairsBlock());
	public static final RegistryObject<Block> GABBROWALL = REGISTRY.register("gabbrowall", () -> new GabbrowallBlock());
	public static final RegistryObject<Block> POLISHED_GABBRO = REGISTRY.register("polished_gabbro", () -> new PolishedGabbroBlock());
	public static final RegistryObject<Block> POLISHEDGABBROSLAB = REGISTRY.register("polishedgabbroslab", () -> new PolishedgabbroslabBlock());
	public static final RegistryObject<Block> POLISHED_GABBRO_STAIRS = REGISTRY.register("polished_gabbro_stairs",
			() -> new PolishedGabbroStairsBlock());
	public static final RegistryObject<Block> POLISHED_WALL_GABBRO = REGISTRY.register("polished_wall_gabbro", () -> new PolishedWallGabbroBlock());
	public static final RegistryObject<Block> GABBROBRICKS = REGISTRY.register("gabbrobricks", () -> new GabbrobricksBlock());
	public static final RegistryObject<Block> GABBROBRICKSSLAB = REGISTRY.register("gabbrobricksslab", () -> new GabbrobricksslabBlock());
	public static final RegistryObject<Block> GABBROBRICKSSTAIRS = REGISTRY.register("gabbrobricksstairs", () -> new GabbrobricksstairsBlock());
	public static final RegistryObject<Block> GABBROBRICKSWALL = REGISTRY.register("gabbrobrickswall", () -> new GabbrobrickswallBlock());
	public static final RegistryObject<Block> PERIDOTITESLAB = REGISTRY.register("peridotiteslab", () -> new PeridotiteslabBlock());
	public static final RegistryObject<Block> PERIDOTITESTAIRS = REGISTRY.register("peridotitestairs", () -> new PeridotitestairsBlock());
	public static final RegistryObject<Block> PERIDOTITEWALL = REGISTRY.register("peridotitewall", () -> new PeridotitewallBlock());
	public static final RegistryObject<Block> POLISHEDPERIDOTITE = REGISTRY.register("polishedperidotite", () -> new PolishedperidotiteBlock());
	public static final RegistryObject<Block> POLISHEDPERIDOTITESLAB = REGISTRY.register("polishedperidotiteslab",
			() -> new PolishedperidotiteslabBlock());
	public static final RegistryObject<Block> POLISHED_PERIODITE_STAIRS = REGISTRY.register("polished_periodite_stairs",
			() -> new PolishedPerioditeStairsBlock());
	public static final RegistryObject<Block> POLISHED_PERIDOTITE_WALL = REGISTRY.register("polished_peridotite_wall",
			() -> new PolishedPeridotiteWallBlock());
	public static final RegistryObject<Block> PERIDOTITEBRICKS = REGISTRY.register("peridotitebricks", () -> new PeridotitebricksBlock());
	public static final RegistryObject<Block> PERIDOTITEBRICKSSLAB = REGISTRY.register("peridotitebricksslab", () -> new PeridotitebricksslabBlock());
	public static final RegistryObject<Block> PERIDOTITEBRICKSSTAIRSRECIPE = REGISTRY.register("peridotitebricksstairsrecipe",
			() -> new PeridotitebricksstairsrecipeBlock());
	public static final RegistryObject<Block> PERIDOTIEBRICKSWALL = REGISTRY.register("peridotiebrickswall", () -> new PeridotiebrickswallBlock());
	public static final RegistryObject<Block> GNAISSSLAB = REGISTRY.register("gnaissslab", () -> new GnaissslabBlock());
	public static final RegistryObject<Block> GNAISSSTAIRS = REGISTRY.register("gnaissstairs", () -> new GnaissstairsBlock());
	public static final RegistryObject<Block> GNAISSWALL = REGISTRY.register("gnaisswall", () -> new GnaisswallBlock());
	public static final RegistryObject<Block> POLISHEDGNAISS = REGISTRY.register("polishedgnaiss", () -> new PolishedgnaissBlock());
	public static final RegistryObject<Block> POLISHED_GNEISS_SLAB = REGISTRY.register("polished_gneiss_slab", () -> new PolishedGneissSlabBlock());
	public static final RegistryObject<Block> POLISHED_GNEISS_STAIRS = REGISTRY.register("polished_gneiss_stairs",
			() -> new PolishedGneissStairsBlock());
	public static final RegistryObject<Block> POLISHED_GNEISS_WALL = REGISTRY.register("polished_gneiss_wall", () -> new PolishedGneissWallBlock());
	public static final RegistryObject<Block> GNAISSBRICKS = REGISTRY.register("gnaissbricks", () -> new GnaissbricksBlock());
	public static final RegistryObject<Block> GNAISSBRICKSSLAB = REGISTRY.register("gnaissbricksslab", () -> new GnaissbricksslabBlock());
	public static final RegistryObject<Block> GNEISS_BRICKS_STAIRS = REGISTRY.register("gneiss_bricks_stairs", () -> new GneissBricksStairsBlock());
	public static final RegistryObject<Block> GNEISS_BRICKS_WALL = REGISTRY.register("gneiss_bricks_wall", () -> new GneissBricksWallBlock());
	public static final RegistryObject<Block> MARBLESLAB = REGISTRY.register("marbleslab", () -> new MarbleslabBlock());
	public static final RegistryObject<Block> MARBLESTAIRS = REGISTRY.register("marblestairs", () -> new MarblestairsBlock());
	public static final RegistryObject<Block> MARBLEWALL = REGISTRY.register("marblewall", () -> new MarblewallBlock());
	public static final RegistryObject<Block> POLISHED_MARBLE = REGISTRY.register("polished_marble", () -> new PolishedMarbleBlock());
	public static final RegistryObject<Block> POLISHEDMARBLESLAB = REGISTRY.register("polishedmarbleslab", () -> new PolishedmarbleslabBlock());
	public static final RegistryObject<Block> POLISHEDMARBLESTAIRS = REGISTRY.register("polishedmarblestairs", () -> new PolishedmarblestairsBlock());
	public static final RegistryObject<Block> POLISHEDMARBLEWALL = REGISTRY.register("polishedmarblewall", () -> new PolishedmarblewallBlock());
	public static final RegistryObject<Block> MARBLEBRICKS = REGISTRY.register("marblebricks", () -> new MarblebricksBlock());
	public static final RegistryObject<Block> MARBLEBRICKSSLAB = REGISTRY.register("marblebricksslab", () -> new MarblebricksslabBlock());
	public static final RegistryObject<Block> MARBLEBRICKSSTAIR = REGISTRY.register("marblebricksstair", () -> new MarblebricksstairBlock());
	public static final RegistryObject<Block> MARBLEBRICKSWALL = REGISTRY.register("marblebrickswall", () -> new MarblebrickswallBlock());
	public static final RegistryObject<Block> SLATE_SLAB = REGISTRY.register("slate_slab", () -> new SlateSlabBlock());
	public static final RegistryObject<Block> SLATE_STAIRS = REGISTRY.register("slate_stairs", () -> new SlateStairsBlock());
	public static final RegistryObject<Block> SLATEWALL = REGISTRY.register("slatewall", () -> new SlatewallBlock());
	public static final RegistryObject<Block> POLISHED_SLATE = REGISTRY.register("polished_slate", () -> new PolishedSlateBlock());
	public static final RegistryObject<Block> POLISHEDSLATESLAB = REGISTRY.register("polishedslateslab", () -> new PolishedslateslabBlock());
	public static final RegistryObject<Block> POLISHEDSLATESTAIRS = REGISTRY.register("polishedslatestairs", () -> new PolishedslatestairsBlock());
	public static final RegistryObject<Block> POLISHED_SLATEWALL = REGISTRY.register("polished_slatewall", () -> new PolishedSlatewallBlock());
	public static final RegistryObject<Block> SLATE_TILE = REGISTRY.register("slate_tile", () -> new SlateTileBlock());
	public static final RegistryObject<Block> SLATE_TILE_SLAB = REGISTRY.register("slate_tile_slab", () -> new SlateTileSlabBlock());
	public static final RegistryObject<Block> SLATE_TILE_STAIRS = REGISTRY.register("slate_tile_stairs", () -> new SlateTileStairsBlock());
	public static final RegistryObject<Block> SLATE_TILE_WALL = REGISTRY.register("slate_tile_wall", () -> new SlateTileWallBlock());
	public static final RegistryObject<Block> SCHISTSLAB = REGISTRY.register("schistslab", () -> new SchistslabBlock());
	public static final RegistryObject<Block> SCHISTSTAIRS = REGISTRY.register("schiststairs", () -> new SchiststairsBlock());
	public static final RegistryObject<Block> SCHISTWALL = REGISTRY.register("schistwall", () -> new SchistwallBlock());
	public static final RegistryObject<Block> POLISHEDSCHIST = REGISTRY.register("polishedschist", () -> new PolishedschistBlock());
	public static final RegistryObject<Block> SCHOSTSLAB = REGISTRY.register("schostslab", () -> new SchostslabBlock());
	public static final RegistryObject<Block> POLISHED_SCHIST_STAIRS = REGISTRY.register("polished_schist_stairs",
			() -> new PolishedSchistStairsBlock());
	public static final RegistryObject<Block> POLISHED_SCHIST_WALL = REGISTRY.register("polished_schist_wall", () -> new PolishedSchistWallBlock());
	public static final RegistryObject<Block> SCHISTBRICKS = REGISTRY.register("schistbricks", () -> new SchistbricksBlock());
	public static final RegistryObject<Block> SCHISTSLABBRICKS = REGISTRY.register("schistslabbricks", () -> new SchistslabbricksBlock());
	public static final RegistryObject<Block> STAIRSCHISTBRICKS = REGISTRY.register("stairschistbricks", () -> new StairschistbricksBlock());
	public static final RegistryObject<Block> SCHIST_BRICK_WALL = REGISTRY.register("schist_brick_wall", () -> new SchistBrickWallBlock());
	public static final RegistryObject<Block> SANDSTONESLAB = REGISTRY.register("sandstoneslab", () -> new SandstoneslabBlock());
	public static final RegistryObject<Block> SANDSTONESTAIRS = REGISTRY.register("sandstonestairs", () -> new SandstonestairsBlock());
	public static final RegistryObject<Block> SANDSTONEWALL = REGISTRY.register("sandstonewall", () -> new SandstonewallBlock());
	public static final RegistryObject<Block> POLISHEDSANDSTONE = REGISTRY.register("polishedsandstone", () -> new PolishedsandstoneBlock());
	public static final RegistryObject<Block> POLISHEDSANDSTONESLAB = REGISTRY.register("polishedsandstoneslab",
			() -> new PolishedsandstoneslabBlock());
	public static final RegistryObject<Block> POLISHEDSANDSTONESTAIRS = REGISTRY.register("polishedsandstonestairs",
			() -> new PolishedsandstonestairsBlock());
	public static final RegistryObject<Block> POLISHEDSANDSTONEWALL = REGISTRY.register("polishedsandstonewall",
			() -> new PolishedsandstonewallBlock());
	public static final RegistryObject<Block> POLISHEDSANDSTONEBRICKS = REGISTRY.register("polishedsandstonebricks",
			() -> new PolishedsandstonebricksBlock());
	public static final RegistryObject<Block> SANDSTONEBRICKSSLAB = REGISTRY.register("sandstonebricksslab", () -> new SandstonebricksslabBlock());
	public static final RegistryObject<Block> SANDSTONESTAIRBRICKS = REGISTRY.register("sandstonestairbricks", () -> new SandstonestairbricksBlock());
	public static final RegistryObject<Block> SANDSTONEBRICKSWALL = REGISTRY.register("sandstonebrickswall", () -> new SandstonebrickswallBlock());
	public static final RegistryObject<Block> LIMESTONESLAB = REGISTRY.register("limestoneslab", () -> new LimestoneslabBlock());
	public static final RegistryObject<Block> LIMESTONESTAIRS = REGISTRY.register("limestonestairs", () -> new LimestonestairsBlock());
	public static final RegistryObject<Block> LIMESTONEWALL = REGISTRY.register("limestonewall", () -> new LimestonewallBlock());
	public static final RegistryObject<Block> POLISHEDLIMESTONE = REGISTRY.register("polishedlimestone", () -> new PolishedlimestoneBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_SLAB = REGISTRY.register("polished_limestone_slab",
			() -> new PolishedLimestoneSlabBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONE_STAIRS = REGISTRY.register("polished_limestone_stairs",
			() -> new PolishedLimestoneStairsBlock());
	public static final RegistryObject<Block> POLISHED_LIMESTONEWALL = REGISTRY.register("polished_limestonewall",
			() -> new PolishedLimestonewallBlock());
	public static final RegistryObject<Block> LIMESTONEBRICKS = REGISTRY.register("limestonebricks", () -> new LimestonebricksBlock());
	public static final RegistryObject<Block> LIMESTONEBRICKSSLAB = REGISTRY.register("limestonebricksslab", () -> new LimestonebricksslabBlock());
	public static final RegistryObject<Block> LIMESTONEBRICKSSTAIRS = REGISTRY.register("limestonebricksstairs",
			() -> new LimestonebricksstairsBlock());
	public static final RegistryObject<Block> LIMESTONEBRICKSWALL = REGISTRY.register("limestonebrickswall", () -> new LimestonebrickswallBlock());
	public static final RegistryObject<Block> POLISHEDTRAVERTINE = REGISTRY.register("polishedtravertine", () -> new PolishedtravertineBlock());
	public static final RegistryObject<Block> TRAVERTINESLAB = REGISTRY.register("travertineslab", () -> new TravertineslabBlock());
	public static final RegistryObject<Block> TRAVERTINESTAIRS = REGISTRY.register("travertinestairs", () -> new TravertinestairsBlock());
	public static final RegistryObject<Block> TRAVERTINEWALL = REGISTRY.register("travertinewall", () -> new TravertinewallBlock());
	public static final RegistryObject<Block> GLACIERICESLAB = REGISTRY.register("glaciericeslab", () -> new GlaciericeslabBlock());
	public static final RegistryObject<Block> GLACIERICESTAIRS = REGISTRY.register("glaciericestairs", () -> new GlaciericestairsBlock());
	public static final RegistryObject<Block> G_LACIERICEWALL = REGISTRY.register("g_laciericewall", () -> new GLaciericewallBlock());
	public static final RegistryObject<Block> GLACIERICEBRICKS = REGISTRY.register("glaciericebricks", () -> new GlaciericebricksBlock());
	public static final RegistryObject<Block> GLACIERICEBRICKSSLAB = REGISTRY.register("glaciericebricksslab", () -> new GlaciericebricksslabBlock());
	public static final RegistryObject<Block> GLACIERICEBRICKSSTAIRS = REGISTRY.register("glaciericebricksstairs",
			() -> new GlaciericebricksstairsBlock());
	public static final RegistryObject<Block> GLACIERICEBRICKSWALL = REGISTRY.register("glaciericebrickswall", () -> new GlaciericebrickswallBlock());
	public static final RegistryObject<Block> CARVEDBASALT_1 = REGISTRY.register("carvedbasalt_1", () -> new Carvedbasalt1Block());
	public static final RegistryObject<Block> CARVEDBASALT_2 = REGISTRY.register("carvedbasalt_2", () -> new Carvedbasalt2Block());
	public static final RegistryObject<Block> CARVEDBASALT_3 = REGISTRY.register("carvedbasalt_3", () -> new Carvedbasalt3Block());
	public static final RegistryObject<Block> CARVED_GABBRO_1 = REGISTRY.register("carved_gabbro_1", () -> new CarvedGabbro1Block());
	public static final RegistryObject<Block> CARVED_GABBRO_2 = REGISTRY.register("carved_gabbro_2", () -> new CarvedGabbro2Block());
	public static final RegistryObject<Block> CARVED_GABBRO_3 = REGISTRY.register("carved_gabbro_3", () -> new CarvedGabbro3Block());
	public static final RegistryObject<Block> CARVED_GABBRO_4 = REGISTRY.register("carved_gabbro_4", () -> new CarvedGabbro4Block());
	public static final RegistryObject<Block> CARVED_GABBRO_5 = REGISTRY.register("carved_gabbro_5", () -> new CarvedGabbro5Block());
	public static final RegistryObject<Block> CARVED_GABBRO_6 = REGISTRY.register("carved_gabbro_6", () -> new CarvedGabbro6Block());
	public static final RegistryObject<Block> CARVED_GABBRO_VII = REGISTRY.register("carved_gabbro_vii", () -> new CarvedGabbroVIIBlock());
	public static final RegistryObject<Block> MARBLEPILLAR = REGISTRY.register("marblepillar", () -> new MarblepillarBlock());
	public static final RegistryObject<Block> MARBLEPILLARBASE = REGISTRY.register("marblepillarbase", () -> new MarblepillarbaseBlock());
	public static final RegistryObject<Block> MARBLEPILLARTOP = REGISTRY.register("marblepillartop", () -> new MarblepillartopBlock());
	public static final RegistryObject<Block> CARVEDMARBLE_1 = REGISTRY.register("carvedmarble_1", () -> new Carvedmarble1Block());
	public static final RegistryObject<Block> CAVERDMARBLE_2 = REGISTRY.register("caverdmarble_2", () -> new Caverdmarble2Block());
	public static final RegistryObject<Block> CARVEDMARBLE_3 = REGISTRY.register("carvedmarble_3", () -> new Carvedmarble3Block());
	public static final RegistryObject<Block> CARVEDMARBLE_4 = REGISTRY.register("carvedmarble_4", () -> new Carvedmarble4Block());
	public static final RegistryObject<Block> CARVED_MARBLE_5 = REGISTRY.register("carved_marble_5", () -> new CarvedMarble5Block());
	public static final RegistryObject<Block> SIMPLECARVEDSANDSTONE_1 = REGISTRY.register("simplecarvedsandstone_1",
			() -> new Simplecarvedsandstone1Block());
	public static final RegistryObject<Block> CARVEDSANDSTONE_1 = REGISTRY.register("carvedsandstone_1", () -> new Carvedsandstone1Block());
	public static final RegistryObject<Block> CARVEDSANDSTONE_2 = REGISTRY.register("carvedsandstone_2", () -> new Carvedsandstone2Block());
	public static final RegistryObject<Block> CARVEDSANDSTONE_3 = REGISTRY.register("carvedsandstone_3", () -> new Carvedsandstone3Block());
	public static final RegistryObject<Block> CARVEDSANDSTONE_4 = REGISTRY.register("carvedsandstone_4", () -> new Carvedsandstone4Block());
	public static final RegistryObject<Block> CARVEDSANDSTONE_5 = REGISTRY.register("carvedsandstone_5", () -> new Carvedsandstone5Block());
	public static final RegistryObject<Block> CARVEDSANDSTONE_6 = REGISTRY.register("carvedsandstone_6", () -> new Carvedsandstone6Block());
	public static final RegistryObject<Block> CARVEDLIMESTONE_1 = REGISTRY.register("carvedlimestone_1", () -> new Carvedlimestone1Block());
	public static final RegistryObject<Block> CARVEDLIMESTONE_2 = REGISTRY.register("carvedlimestone_2", () -> new Carvedlimestone2Block());
	public static final RegistryObject<Block> CARVEDLIMESTONE_3 = REGISTRY.register("carvedlimestone_3", () -> new Carvedlimestone3Block());
	public static final RegistryObject<Block> CARVEDLIMESTONE_4 = REGISTRY.register("carvedlimestone_4", () -> new Carvedlimestone4Block());
	public static final RegistryObject<Block> MARBLEBRICKSSTAIRS = REGISTRY.register("marblebricksstairs", () -> new MarblebricksstairsBlock());
	public static final RegistryObject<Block> BURNEDWOOD = REGISTRY.register("burnedwood", () -> new BurnedwoodBlock());
	public static final RegistryObject<Block> NOBELS_DYNAMITE = REGISTRY.register("nobels_dynamite", () -> new NobelsDynamiteBlock());
	public static final RegistryObject<Block> STEELBLOCK = REGISTRY.register("steelblock", () -> new SteelblockBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> MINERALTABLE = REGISTRY.register("mineraltable", () -> new MineraltableBlock());
	public static final RegistryObject<Block> BASALTIC_LAVA = REGISTRY.register("basaltic_lava", () -> new BasalticLavaBlock());
	public static final RegistryObject<Block> PETRIFIEDWOOD = REGISTRY.register("petrifiedwood", () -> new PetrifiedwoodBlock());
	public static final RegistryObject<Block> RED_SOIL_GRASS = REGISTRY.register("red_soil_grass", () -> new RedSoilGrassBlock());
	public static final RegistryObject<Block> YELLOW_IPE_LOG = REGISTRY.register("yellow_ipe_log", () -> new YellowIpeLogBlock());
	public static final RegistryObject<Block> YELLOW_IPE_LEAVES = REGISTRY.register("yellow_ipe_leaves", () -> new YellowIpeLeavesBlock());
	public static final RegistryObject<Block> YELLOW_IPE_WOOD = REGISTRY.register("yellow_ipe_wood", () -> new YellowIpeWoodBlock());
	public static final RegistryObject<Block> YELLOW_IPE_PLANKS = REGISTRY.register("yellow_ipe_planks", () -> new YellowIpePlanksBlock());
	public static final RegistryObject<Block> AMBAR_FOSSIL = REGISTRY.register("ambar_fossil", () -> new AmbarFossilBlock());
	public static final RegistryObject<Block> PYRITEMINERAL = REGISTRY.register("pyritemineral", () -> new PyritemineralBlock());
	public static final RegistryObject<Block> CINNABERCRYSTAL = REGISTRY.register("cinnabercrystal", () -> new CinnabercrystalBlock());
	public static final RegistryObject<Block> VOLCANO_SMOKE = REGISTRY.register("volcano_smoke", () -> new VolcanoSmokeBlock());
	public static final RegistryObject<Block> AMETHISTGEOGE = REGISTRY.register("amethistgeoge", () -> new AmethistgeogeBlock());
	public static final RegistryObject<Block> MAGMADROPS = REGISTRY.register("magmadrops", () -> new MagmadropsBlock());
	public static final RegistryObject<Block> OLDCHEST = REGISTRY.register("oldchest", () -> new OldchestBlock());
	public static final RegistryObject<Block> MINERALCENTRIFUGUE = REGISTRY.register("mineralcentrifugue", () -> new MineralcentrifugueBlock());
	public static final RegistryObject<Block> UPPER_MANTLE_PORTAL = REGISTRY.register("upper_mantle_portal", () -> new UpperMantlePortalBlock());
	public static final RegistryObject<Block> PUPPERMANTLEPERIDOTITE = REGISTRY.register("puppermantleperidotite",
			() -> new PuppermantleperidotiteBlock());
	public static final RegistryObject<Block> UPPERMANTLEKIMBERLITE = REGISTRY.register("uppermantlekimberlite",
			() -> new UppermantlekimberliteBlock());
	public static final RegistryObject<Block> UPPERMANTLEDIAMONDKIMBERLITE = REGISTRY.register("uppermantlediamondkimberlite",
			() -> new UppermantlediamondkimberliteBlock());
	public static final RegistryObject<Block> LIGHT = REGISTRY.register("light", () -> new LightBlock());
	public static final RegistryObject<Block> VOLCANOASH = REGISTRY.register("volcanoash", () -> new VolcanoashBlock());
	public static final RegistryObject<Block> MINERAL_CENTRIGUGUE_OFF = REGISTRY.register("mineral_centrigugue_off",
			() -> new MineralCentrigugueOFFBlock());
	public static final RegistryObject<Block> BASALT = REGISTRY.register("basalt", () -> new BasaltBlock());
	public static final RegistryObject<Block> GEOFURNACE = REGISTRY.register("geofurnace", () -> new GeofurnaceBlock());
	public static final RegistryObject<Block> GEOFURNACEOFF = REGISTRY.register("geofurnaceoff", () -> new GeofurnaceoffBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ColumnarbasaltBlock.registerRenderLayer();
			StalactiteBlock.registerRenderLayer();
			GlaciericeBlock.registerRenderLayer();
			PolisheddioritewallBlock.registerRenderLayer();
			AndesitewallBlock.registerRenderLayer();
			PolishedWallGabbroBlock.registerRenderLayer();
			GabbrobrickswallBlock.registerRenderLayer();
			PolishedPeridotiteWallBlock.registerRenderLayer();
			GneissBricksWallBlock.registerRenderLayer();
			SchistBrickWallBlock.registerRenderLayer();
			SandstonewallBlock.registerRenderLayer();
			GlaciericeslabBlock.registerRenderLayer();
			GlaciericestairsBlock.registerRenderLayer();
			GLaciericewallBlock.registerRenderLayer();
			GlaciericebricksBlock.registerRenderLayer();
			GlaciericebricksslabBlock.registerRenderLayer();
			GlaciericebricksstairsBlock.registerRenderLayer();
			GlaciericebrickswallBlock.registerRenderLayer();
			MineraltableBlock.registerRenderLayer();
			RedSoilGrassBlock.registerRenderLayer();
			YellowIpeLeavesBlock.registerRenderLayer();
			AmbarFossilBlock.registerRenderLayer();
			PyritemineralBlock.registerRenderLayer();
			CinnabercrystalBlock.registerRenderLayer();
			VolcanoSmokeBlock.registerRenderLayer();
			AmethistgeogeBlock.registerRenderLayer();
			MagmadropsBlock.registerRenderLayer();
			UpperMantlePortalBlock.registerRenderLayer();
			LightBlock.registerRenderLayer();
			GeofurnaceBlock.registerRenderLayer();
			GeofurnaceoffBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			RedSoilGrassBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			RedSoilGrassBlock.itemColorLoad(event);
		}
	}
}
