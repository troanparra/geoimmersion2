
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.geoimmersion.world.inventory.WolframiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.WolframiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.VanadiniteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.VanadiniteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.TravertineEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.TravertineEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.TourmalineEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.TourmalineEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.TorbeniteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.TorbeniteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SulfurEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SulfurEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SpodumeneEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SpodumeneEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SphaleriteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SphaleriteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SlateEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SlateEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SkarnEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SkarnEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SchistEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SchistEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.SandstoneEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.SandstoneEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.RutileEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.RutileEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.RockEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.RockEncyclopedia3Menu;
import net.mcreator.geoimmersion.world.inventory.RockEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.RioliteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.RioliteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.QuartziteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.QuartziteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.QuartzEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.QuartzEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.PyriteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.PyriteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.PeridotiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.PeridotiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.OsmiumTetroxiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.OlivineEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.OlivineEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.OldchestguiMenu;
import net.mcreator.geoimmersion.world.inventory.MineralEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.MineralEncyclopedia3Menu;
import net.mcreator.geoimmersion.world.inventory.MineralEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.MineracentrifugeGUIMenu;
import net.mcreator.geoimmersion.world.inventory.MetasandstoneEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.MetasandstoneEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.MetalimestoneEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.MetalimestoneEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.MarbleEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.MarbleEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.MagnetiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.MagnetiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.LimestoneEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.LimestoneEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.KimberliteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.KimberliteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.HornblendeEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.HornblendeEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.GraniteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.GraniteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.GneissEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.GneissEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.GeologistpackslotMenu;
import net.mcreator.geoimmersion.world.inventory.GeologistpackguiMenu;
import net.mcreator.geoimmersion.world.inventory.GeoimmersionEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.GarnetEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.GarnetEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.GalenaEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.GalenaEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.GabbroEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.GabbroEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.ForgeguiMenu;
import net.mcreator.geoimmersion.world.inventory.FluoriteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.FluoriteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.FeldsparEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.FeldsparEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.EvaporiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.EvaporiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.DioriteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.DioriteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.DiabaseEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.DiabaseEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.CinnaberEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.CinnaberEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.CasseteriteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.CasseteriteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.CalciteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.CalciteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.BiotiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.BiotiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.BauxiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.BauxiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.BasaltEncylopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.BasaltEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.BasaltEncyclopedia3Menu;
import net.mcreator.geoimmersion.world.inventory.BIFEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.BIFEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.ApatiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.ApatiteEncyclopedia2Menu;
import net.mcreator.geoimmersion.world.inventory.AndesiteEncyclopediaMenu;
import net.mcreator.geoimmersion.world.inventory.AndesiteEncyclopedia2Menu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeoimmersionModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<OldchestguiMenu> OLDCHESTGUI = register("oldchestgui",
			(id, inv, extraData) -> new OldchestguiMenu(id, inv, extraData));
	public static final MenuType<GeologistpackguiMenu> GEOLOGISTPACKGUI = register("geologistpackgui",
			(id, inv, extraData) -> new GeologistpackguiMenu(id, inv, extraData));
	public static final MenuType<MineracentrifugeGUIMenu> MINERACENTRIFUGE_GUI = register("mineracentrifuge_gui",
			(id, inv, extraData) -> new MineracentrifugeGUIMenu(id, inv, extraData));
	public static final MenuType<GeoimmersionEncyclopediaMenu> GEOIMMERSION_ENCYCLOPEDIA = register("geoimmersion_encyclopedia",
			(id, inv, extraData) -> new GeoimmersionEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GraniteEncyclopediaMenu> GRANITE_ENCYCLOPEDIA = register("granite_encyclopedia",
			(id, inv, extraData) -> new GraniteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GeologistpackslotMenu> GEOLOGISTPACKSLOT = register("geologistpackslot",
			(id, inv, extraData) -> new GeologistpackslotMenu(id, inv, extraData));
	public static final MenuType<ForgeguiMenu> FORGEGUI = register("forgegui", (id, inv, extraData) -> new ForgeguiMenu(id, inv, extraData));
	public static final MenuType<RockEncyclopedia2Menu> ROCK_ENCYCLOPEDIA_2 = register("rock_encyclopedia_2",
			(id, inv, extraData) -> new RockEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<RockEncyclopediaMenu> ROCK_ENCYCLOPEDIA = register("rock_encyclopedia",
			(id, inv, extraData) -> new RockEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<RockEncyclopedia3Menu> ROCK_ENCYCLOPEDIA_3 = register("rock_encyclopedia_3",
			(id, inv, extraData) -> new RockEncyclopedia3Menu(id, inv, extraData));
	public static final MenuType<MineralEncyclopediaMenu> MINERAL_ENCYCLOPEDIA = register("mineral_encyclopedia",
			(id, inv, extraData) -> new MineralEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<DioriteEncyclopediaMenu> DIORITE_ENCYCLOPEDIA = register("diorite_encyclopedia",
			(id, inv, extraData) -> new DioriteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<AndesiteEncyclopediaMenu> ANDESITE_ENCYCLOPEDIA = register("andesite_encyclopedia",
			(id, inv, extraData) -> new AndesiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<BasaltEncyclopediaMenu> BASALT_ENCYCLOPEDIA = register("basalt_encyclopedia",
			(id, inv, extraData) -> new BasaltEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GabbroEncyclopediaMenu> GABBRO_ENCYCLOPEDIA = register("gabbro_encyclopedia",
			(id, inv, extraData) -> new GabbroEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<RioliteEncyclopediaMenu> RIOLITE_ENCYCLOPEDIA = register("riolite_encyclopedia",
			(id, inv, extraData) -> new RioliteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<PeridotiteEncyclopediaMenu> PERIDOTITE_ENCYCLOPEDIA = register("peridotite_encyclopedia",
			(id, inv, extraData) -> new PeridotiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<DiabaseEncyclopediaMenu> DIABASE_ENCYCLOPEDIA = register("diabase_encyclopedia",
			(id, inv, extraData) -> new DiabaseEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<KimberliteEncyclopediaMenu> KIMBERLITE_ENCYCLOPEDIA = register("kimberlite_encyclopedia",
			(id, inv, extraData) -> new KimberliteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<MarbleEncyclopediaMenu> MARBLE_ENCYCLOPEDIA = register("marble_encyclopedia",
			(id, inv, extraData) -> new MarbleEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GneissEncyclopediaMenu> GNEISS_ENCYCLOPEDIA = register("gneiss_encyclopedia",
			(id, inv, extraData) -> new GneissEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SchistEncyclopediaMenu> SCHIST_ENCYCLOPEDIA = register("schist_encyclopedia",
			(id, inv, extraData) -> new SchistEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SkarnEncyclopediaMenu> SKARN_ENCYCLOPEDIA = register("skarn_encyclopedia",
			(id, inv, extraData) -> new SkarnEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SlateEncyclopediaMenu> SLATE_ENCYCLOPEDIA = register("slate_encyclopedia",
			(id, inv, extraData) -> new SlateEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<BauxiteEncyclopediaMenu> BAUXITE_ENCYCLOPEDIA = register("bauxite_encyclopedia",
			(id, inv, extraData) -> new BauxiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<QuartziteEncyclopediaMenu> QUARTZITE_ENCYCLOPEDIA = register("quartzite_encyclopedia",
			(id, inv, extraData) -> new QuartziteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<LimestoneEncyclopediaMenu> LIMESTONE_ENCYCLOPEDIA = register("limestone_encyclopedia",
			(id, inv, extraData) -> new LimestoneEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SandstoneEncyclopediaMenu> SANDSTONE_ENCYCLOPEDIA = register("sandstone_encyclopedia",
			(id, inv, extraData) -> new SandstoneEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<MetalimestoneEncyclopediaMenu> METALIMESTONE_ENCYCLOPEDIA = register("metalimestone_encyclopedia",
			(id, inv, extraData) -> new MetalimestoneEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<MetasandstoneEncyclopediaMenu> METASANDSTONE_ENCYCLOPEDIA = register("metasandstone_encyclopedia",
			(id, inv, extraData) -> new MetasandstoneEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<EvaporiteEncyclopediaMenu> EVAPORITE_ENCYCLOPEDIA = register("evaporite_encyclopedia",
			(id, inv, extraData) -> new EvaporiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<TravertineEncyclopediaMenu> TRAVERTINE_ENCYCLOPEDIA = register("travertine_encyclopedia",
			(id, inv, extraData) -> new TravertineEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<BIFEncyclopediaMenu> BIF_ENCYCLOPEDIA = register("bif_encyclopedia",
			(id, inv, extraData) -> new BIFEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<MineralEncyclopedia2Menu> MINERAL_ENCYCLOPEDIA_2 = register("mineral_encyclopedia_2",
			(id, inv, extraData) -> new MineralEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<MineralEncyclopedia3Menu> MINERAL_ENCYCLOPEDIA_3 = register("mineral_encyclopedia_3",
			(id, inv, extraData) -> new MineralEncyclopedia3Menu(id, inv, extraData));
	public static final MenuType<QuartzEncyclopediaMenu> QUARTZ_ENCYCLOPEDIA = register("quartz_encyclopedia",
			(id, inv, extraData) -> new QuartzEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GarnetEncyclopediaMenu> GARNET_ENCYCLOPEDIA = register("garnet_encyclopedia",
			(id, inv, extraData) -> new GarnetEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<ApatiteEncyclopediaMenu> APATITE_ENCYCLOPEDIA = register("apatite_encyclopedia",
			(id, inv, extraData) -> new ApatiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<OlivineEncyclopediaMenu> OLIVINE_ENCYCLOPEDIA = register("olivine_encyclopedia",
			(id, inv, extraData) -> new OlivineEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SulfurEncyclopediaMenu> SULFUR_ENCYCLOPEDIA = register("sulfur_encyclopedia",
			(id, inv, extraData) -> new SulfurEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<FeldsparEncyclopediaMenu> FELDSPAR_ENCYCLOPEDIA = register("feldspar_encyclopedia",
			(id, inv, extraData) -> new FeldsparEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<BiotiteEncyclopediaMenu> BIOTITE_ENCYCLOPEDIA = register("biotite_encyclopedia",
			(id, inv, extraData) -> new BiotiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<RutileEncyclopediaMenu> RUTILE_ENCYCLOPEDIA = register("rutile_encyclopedia",
			(id, inv, extraData) -> new RutileEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<HornblendeEncyclopediaMenu> HORNBLENDE_ENCYCLOPEDIA = register("hornblende_encyclopedia",
			(id, inv, extraData) -> new HornblendeEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<TourmalineEncyclopediaMenu> TOURMALINE_ENCYCLOPEDIA = register("tourmaline_encyclopedia",
			(id, inv, extraData) -> new TourmalineEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<CinnaberEncyclopediaMenu> CINNABER_ENCYCLOPEDIA = register("cinnaber_encyclopedia",
			(id, inv, extraData) -> new CinnaberEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<VanadiniteEncyclopediaMenu> VANADINITE_ENCYCLOPEDIA = register("vanadinite_encyclopedia",
			(id, inv, extraData) -> new VanadiniteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<TorbeniteEncyclopediaMenu> TORBENITE_ENCYCLOPEDIA = register("torbenite_encyclopedia",
			(id, inv, extraData) -> new TorbeniteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<FluoriteEncyclopediaMenu> FLUORITE_ENCYCLOPEDIA = register("fluorite_encyclopedia",
			(id, inv, extraData) -> new FluoriteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<CasseteriteEncyclopediaMenu> CASSETERITE_ENCYCLOPEDIA = register("casseterite_encyclopedia",
			(id, inv, extraData) -> new CasseteriteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<PyriteEncyclopediaMenu> PYRITE_ENCYCLOPEDIA = register("pyrite_encyclopedia",
			(id, inv, extraData) -> new PyriteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<MagnetiteEncyclopediaMenu> MAGNETITE_ENCYCLOPEDIA = register("magnetite_encyclopedia",
			(id, inv, extraData) -> new MagnetiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<CalciteEncyclopediaMenu> CALCITE_ENCYCLOPEDIA = register("calcite_encyclopedia",
			(id, inv, extraData) -> new CalciteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SpodumeneEncyclopediaMenu> SPODUMENE_ENCYCLOPEDIA = register("spodumene_encyclopedia",
			(id, inv, extraData) -> new SpodumeneEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<OsmiumTetroxiteEncyclopediaMenu> OSMIUM_TETROXITE_ENCYCLOPEDIA = register("osmium_tetroxite_encyclopedia",
			(id, inv, extraData) -> new OsmiumTetroxiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GalenaEncyclopediaMenu> GALENA_ENCYCLOPEDIA = register("galena_encyclopedia",
			(id, inv, extraData) -> new GalenaEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<SphaleriteEncyclopediaMenu> SPHALERITE_ENCYCLOPEDIA = register("sphalerite_encyclopedia",
			(id, inv, extraData) -> new SphaleriteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<WolframiteEncyclopediaMenu> WOLFRAMITE_ENCYCLOPEDIA = register("wolframite_encyclopedia",
			(id, inv, extraData) -> new WolframiteEncyclopediaMenu(id, inv, extraData));
	public static final MenuType<GraniteEncyclopedia2Menu> GRANITE_ENCYCLOPEDIA_2 = register("granite_encyclopedia_2",
			(id, inv, extraData) -> new GraniteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<DioriteEncyclopedia2Menu> DIORITE_ENCYCLOPEDIA_2 = register("diorite_encyclopedia_2",
			(id, inv, extraData) -> new DioriteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<AndesiteEncyclopedia2Menu> ANDESITE_ENCYCLOPEDIA_2 = register("andesite_encyclopedia_2",
			(id, inv, extraData) -> new AndesiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<BasaltEncylopedia2Menu> BASALT_ENCYLOPEDIA_2 = register("basalt_encylopedia_2",
			(id, inv, extraData) -> new BasaltEncylopedia2Menu(id, inv, extraData));
	public static final MenuType<BasaltEncyclopedia3Menu> BASALT_ENCYCLOPEDIA_3 = register("basalt_encyclopedia_3",
			(id, inv, extraData) -> new BasaltEncyclopedia3Menu(id, inv, extraData));
	public static final MenuType<GabbroEncyclopedia2Menu> GABBRO_ENCYCLOPEDIA_2 = register("gabbro_encyclopedia_2",
			(id, inv, extraData) -> new GabbroEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<RioliteEncyclopedia2Menu> RIOLITE_ENCYCLOPEDIA_2 = register("riolite_encyclopedia_2",
			(id, inv, extraData) -> new RioliteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<PeridotiteEncyclopedia2Menu> PERIDOTITE_ENCYCLOPEDIA_2 = register("peridotite_encyclopedia_2",
			(id, inv, extraData) -> new PeridotiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<DiabaseEncyclopedia2Menu> DIABASE_ENCYCLOPEDIA_2 = register("diabase_encyclopedia_2",
			(id, inv, extraData) -> new DiabaseEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<KimberliteEncyclopedia2Menu> KIMBERLITE_ENCYCLOPEDIA_2 = register("kimberlite_encyclopedia_2",
			(id, inv, extraData) -> new KimberliteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<MarbleEncyclopedia2Menu> MARBLE_ENCYCLOPEDIA_2 = register("marble_encyclopedia_2",
			(id, inv, extraData) -> new MarbleEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<GneissEncyclopedia2Menu> GNEISS_ENCYCLOPEDIA_2 = register("gneiss_encyclopedia_2",
			(id, inv, extraData) -> new GneissEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SchistEncyclopedia2Menu> SCHIST_ENCYCLOPEDIA_2 = register("schist_encyclopedia_2",
			(id, inv, extraData) -> new SchistEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SkarnEncyclopedia2Menu> SKARN_ENCYCLOPEDIA_2 = register("skarn_encyclopedia_2",
			(id, inv, extraData) -> new SkarnEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SlateEncyclopedia2Menu> SLATE_ENCYCLOPEDIA_2 = register("slate_encyclopedia_2",
			(id, inv, extraData) -> new SlateEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<BauxiteEncyclopedia2Menu> BAUXITE_ENCYCLOPEDIA_2 = register("bauxite_encyclopedia_2",
			(id, inv, extraData) -> new BauxiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<QuartziteEncyclopedia2Menu> QUARTZITE_ENCYCLOPEDIA_2 = register("quartzite_encyclopedia_2",
			(id, inv, extraData) -> new QuartziteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<LimestoneEncyclopedia2Menu> LIMESTONE_ENCYCLOPEDIA_2 = register("limestone_encyclopedia_2",
			(id, inv, extraData) -> new LimestoneEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SandstoneEncyclopedia2Menu> SANDSTONE_ENCYCLOPEDIA_2 = register("sandstone_encyclopedia_2",
			(id, inv, extraData) -> new SandstoneEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<MetalimestoneEncyclopedia2Menu> METALIMESTONE_ENCYCLOPEDIA_2 = register("metalimestone_encyclopedia_2",
			(id, inv, extraData) -> new MetalimestoneEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<MetasandstoneEncyclopedia2Menu> METASANDSTONE_ENCYCLOPEDIA_2 = register("metasandstone_encyclopedia_2",
			(id, inv, extraData) -> new MetasandstoneEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<EvaporiteEncyclopedia2Menu> EVAPORITE_ENCYCLOPEDIA_2 = register("evaporite_encyclopedia_2",
			(id, inv, extraData) -> new EvaporiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<TravertineEncyclopedia2Menu> TRAVERTINE_ENCYCLOPEDIA_2 = register("travertine_encyclopedia_2",
			(id, inv, extraData) -> new TravertineEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<BIFEncyclopedia2Menu> BIF_ENCYCLOPEDIA_2 = register("bif_encyclopedia_2",
			(id, inv, extraData) -> new BIFEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<QuartzEncyclopedia2Menu> QUARTZ_ENCYCLOPEDIA_2 = register("quartz_encyclopedia_2",
			(id, inv, extraData) -> new QuartzEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<GarnetEncyclopedia2Menu> GARNET_ENCYCLOPEDIA_2 = register("garnet_encyclopedia_2",
			(id, inv, extraData) -> new GarnetEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<ApatiteEncyclopedia2Menu> APATITE_ENCYCLOPEDIA_2 = register("apatite_encyclopedia_2",
			(id, inv, extraData) -> new ApatiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<OlivineEncyclopedia2Menu> OLIVINE_ENCYCLOPEDIA_2 = register("olivine_encyclopedia_2",
			(id, inv, extraData) -> new OlivineEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SulfurEncyclopedia2Menu> SULFUR_ENCYCLOPEDIA_2 = register("sulfur_encyclopedia_2",
			(id, inv, extraData) -> new SulfurEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<FeldsparEncyclopedia2Menu> FELDSPAR_ENCYCLOPEDIA_2 = register("feldspar_encyclopedia_2",
			(id, inv, extraData) -> new FeldsparEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<BiotiteEncyclopedia2Menu> BIOTITE_ENCYCLOPEDIA_2 = register("biotite_encyclopedia_2",
			(id, inv, extraData) -> new BiotiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<RutileEncyclopedia2Menu> RUTILE_ENCYCLOPEDIA_2 = register("rutile_encyclopedia_2",
			(id, inv, extraData) -> new RutileEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<HornblendeEncyclopedia2Menu> HORNBLENDE_ENCYCLOPEDIA_2 = register("hornblende_encyclopedia_2",
			(id, inv, extraData) -> new HornblendeEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<TourmalineEncyclopedia2Menu> TOURMALINE_ENCYCLOPEDIA_2 = register("tourmaline_encyclopedia_2",
			(id, inv, extraData) -> new TourmalineEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<CinnaberEncyclopedia2Menu> CINNABER_ENCYCLOPEDIA_2 = register("cinnaber_encyclopedia_2",
			(id, inv, extraData) -> new CinnaberEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<VanadiniteEncyclopedia2Menu> VANADINITE_ENCYCLOPEDIA_2 = register("vanadinite_encyclopedia_2",
			(id, inv, extraData) -> new VanadiniteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<TorbeniteEncyclopedia2Menu> TORBENITE_ENCYCLOPEDIA_2 = register("torbenite_encyclopedia_2",
			(id, inv, extraData) -> new TorbeniteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<FluoriteEncyclopedia2Menu> FLUORITE_ENCYCLOPEDIA_2 = register("fluorite_encyclopedia_2",
			(id, inv, extraData) -> new FluoriteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<CasseteriteEncyclopedia2Menu> CASSETERITE_ENCYCLOPEDIA_2 = register("casseterite_encyclopedia_2",
			(id, inv, extraData) -> new CasseteriteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<PyriteEncyclopedia2Menu> PYRITE_ENCYCLOPEDIA_2 = register("pyrite_encyclopedia_2",
			(id, inv, extraData) -> new PyriteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<MagnetiteEncyclopedia2Menu> MAGNETITE_ENCYCLOPEDIA_2 = register("magnetite_encyclopedia_2",
			(id, inv, extraData) -> new MagnetiteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<CalciteEncyclopedia2Menu> CALCITE_ENCYCLOPEDIA_2 = register("calcite_encyclopedia_2",
			(id, inv, extraData) -> new CalciteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SpodumeneEncyclopedia2Menu> SPODUMENE_ENCYCLOPEDIA_2 = register("spodumene_encyclopedia_2",
			(id, inv, extraData) -> new SpodumeneEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<GalenaEncyclopedia2Menu> GALENA_ENCYCLOPEDIA_2 = register("galena_encyclopedia_2",
			(id, inv, extraData) -> new GalenaEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<SphaleriteEncyclopedia2Menu> SPHALERITE_ENCYCLOPEDIA_2 = register("sphalerite_encyclopedia_2",
			(id, inv, extraData) -> new SphaleriteEncyclopedia2Menu(id, inv, extraData));
	public static final MenuType<WolframiteEncyclopedia2Menu> WOLFRAMITE_ENCYCLOPEDIA_2 = register("wolframite_encyclopedia_2",
			(id, inv, extraData) -> new WolframiteEncyclopedia2Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
