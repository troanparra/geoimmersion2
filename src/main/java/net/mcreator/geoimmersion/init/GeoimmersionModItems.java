
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.geoimmersion.item.ZincItem;
import net.mcreator.geoimmersion.item.WoodenGeologistHammerItem;
import net.mcreator.geoimmersion.item.WolframiteItem;
import net.mcreator.geoimmersion.item.VolcanoashItem;
import net.mcreator.geoimmersion.item.VanadiumingotItem;
import net.mcreator.geoimmersion.item.VanadiumItem;
import net.mcreator.geoimmersion.item.VanadiumCatalyzerItem;
import net.mcreator.geoimmersion.item.VanadiniteItem;
import net.mcreator.geoimmersion.item.UraniumnuggetItem;
import net.mcreator.geoimmersion.item.UraniumingotItem;
import net.mcreator.geoimmersion.item.UpperMantleItem;
import net.mcreator.geoimmersion.item.TungsteningotItem;
import net.mcreator.geoimmersion.item.TrinitrotolueneItem;
import net.mcreator.geoimmersion.item.TrilobiteItem;
import net.mcreator.geoimmersion.item.TourmalineItem;
import net.mcreator.geoimmersion.item.TorbeniteItem;
import net.mcreator.geoimmersion.item.TitaniumnuggetItem;
import net.mcreator.geoimmersion.item.TitaniumgeologisthammerItem;
import net.mcreator.geoimmersion.item.TitaniumSwordItem;
import net.mcreator.geoimmersion.item.TitaniumShovelItem;
import net.mcreator.geoimmersion.item.TitaniumPickaxeItem;
import net.mcreator.geoimmersion.item.TitaniumIngotItem;
import net.mcreator.geoimmersion.item.TitaniumHoeItem;
import net.mcreator.geoimmersion.item.TitaniumAxeItem;
import net.mcreator.geoimmersion.item.TitaniumArmorItem;
import net.mcreator.geoimmersion.item.TiningotItem;
import net.mcreator.geoimmersion.item.TinSwordItem;
import net.mcreator.geoimmersion.item.TinShovelItem;
import net.mcreator.geoimmersion.item.TinPickaxeItem;
import net.mcreator.geoimmersion.item.TinHoeItem;
import net.mcreator.geoimmersion.item.TinGeologisthammerItem;
import net.mcreator.geoimmersion.item.TinAxeItem;
import net.mcreator.geoimmersion.item.TinArmorItem;
import net.mcreator.geoimmersion.item.TablelegItem;
import net.mcreator.geoimmersion.item.SulfuricAcidErlenmeyerItem;
import net.mcreator.geoimmersion.item.SulfurItem;
import net.mcreator.geoimmersion.item.StoneGeologistHammerItem;
import net.mcreator.geoimmersion.item.StitchedleatherItem;
import net.mcreator.geoimmersion.item.SteelalloyItem;
import net.mcreator.geoimmersion.item.SteelItem;
import net.mcreator.geoimmersion.item.SpodumeneItem;
import net.mcreator.geoimmersion.item.SphaleriteItem;
import net.mcreator.geoimmersion.item.SodiumnitratesolutionItem;
import net.mcreator.geoimmersion.item.SodiumNitrateItem;
import net.mcreator.geoimmersion.item.SlagItem;
import net.mcreator.geoimmersion.item.SisterTheiaItem;
import net.mcreator.geoimmersion.item.SilvergeologisthammerItem;
import net.mcreator.geoimmersion.item.SilverSwordItem;
import net.mcreator.geoimmersion.item.SilverShovelItem;
import net.mcreator.geoimmersion.item.SilverPickaxeItem;
import net.mcreator.geoimmersion.item.SilverIngotItem;
import net.mcreator.geoimmersion.item.SilverHoeItem;
import net.mcreator.geoimmersion.item.SilverAxeItem;
import net.mcreator.geoimmersion.item.RutileItem;
import net.mcreator.geoimmersion.item.QuartzsandpaperItem;
import net.mcreator.geoimmersion.item.QuartzItem;
import net.mcreator.geoimmersion.item.PyriteItem;
import net.mcreator.geoimmersion.item.PotassiumnitratesolutionItem;
import net.mcreator.geoimmersion.item.PotassiumnitrateItem;
import net.mcreator.geoimmersion.item.PotassiumchloridesolutionItem;
import net.mcreator.geoimmersion.item.PotassiumChlorideItem;
import net.mcreator.geoimmersion.item.PlatinumIngotItem;
import net.mcreator.geoimmersion.item.PlatinumCatalyzerItem;
import net.mcreator.geoimmersion.item.PistonpinItem;
import net.mcreator.geoimmersion.item.PistonheadItem;
import net.mcreator.geoimmersion.item.PistonItem;
import net.mcreator.geoimmersion.item.PistolhammerItem;
import net.mcreator.geoimmersion.item.PistolbarrelItem;
import net.mcreator.geoimmersion.item.PistolItem;
import net.mcreator.geoimmersion.item.PetroleumItem;
import net.mcreator.geoimmersion.item.OsmiumnuggetItem;
import net.mcreator.geoimmersion.item.OsmiumItem;
import net.mcreator.geoimmersion.item.OsmiumIngotItem;
import net.mcreator.geoimmersion.item.OlivineItem;
import net.mcreator.geoimmersion.item.OilbarrelItem;
import net.mcreator.geoimmersion.item.OilItem;
import net.mcreator.geoimmersion.item.ObsidianSwordItem;
import net.mcreator.geoimmersion.item.ObsidianAxeItem;
import net.mcreator.geoimmersion.item.NobelsthrowabledynamiteItem;
import net.mcreator.geoimmersion.item.NitroglicerineItem;
import net.mcreator.geoimmersion.item.NitricacidItem;
import net.mcreator.geoimmersion.item.NickelnuggetItem;
import net.mcreator.geoimmersion.item.NickelingotItem;
import net.mcreator.geoimmersion.item.MinerHelmetItem;
import net.mcreator.geoimmersion.item.MemyfelfandmyenemyLostFishesNegribeatsItem;
import net.mcreator.geoimmersion.item.MagnetiteItem;
import net.mcreator.geoimmersion.item.LithiumnuggetItem;
import net.mcreator.geoimmersion.item.LithiumingotItem;
import net.mcreator.geoimmersion.item.LeadnuggetItem;
import net.mcreator.geoimmersion.item.LeadSwordItem;
import net.mcreator.geoimmersion.item.LeadShovelItem;
import net.mcreator.geoimmersion.item.LeadPickaxeItem;
import net.mcreator.geoimmersion.item.LeadIngotItem;
import net.mcreator.geoimmersion.item.LeadHoeItem;
import net.mcreator.geoimmersion.item.LeadAxeItem;
import net.mcreator.geoimmersion.item.LeadArmorItem;
import net.mcreator.geoimmersion.item.IronGeologistHammerItem;
import net.mcreator.geoimmersion.item.HornblendeItem;
import net.mcreator.geoimmersion.item.HandsawItem;
import net.mcreator.geoimmersion.item.HandgripItem;
import net.mcreator.geoimmersion.item.HandTNTItem;
import net.mcreator.geoimmersion.item.GoldGeologistHammerItem;
import net.mcreator.geoimmersion.item.GlicerolItem;
import net.mcreator.geoimmersion.item.GeologistpackItem;
import net.mcreator.geoimmersion.item.GarnetsandpaperItem;
import net.mcreator.geoimmersion.item.GarnetItem;
import net.mcreator.geoimmersion.item.FluoriteItem;
import net.mcreator.geoimmersion.item.FilledoilbarrelItem;
import net.mcreator.geoimmersion.item.FertilizerItem;
import net.mcreator.geoimmersion.item.FeldsparsandpaperItem;
import net.mcreator.geoimmersion.item.FeldsparItem;
import net.mcreator.geoimmersion.item.ErlenmeyerwithwaterItem;
import net.mcreator.geoimmersion.item.ErlenmeyerItem;
import net.mcreator.geoimmersion.item.EngineblockItem;
import net.mcreator.geoimmersion.item.EmptyMinerHelmetItem;
import net.mcreator.geoimmersion.item.EmeraldsandpaperItem;
import net.mcreator.geoimmersion.item.DiamondsandpaperItem;
import net.mcreator.geoimmersion.item.DiamondGeologistHammerItem;
import net.mcreator.geoimmersion.item.CylinderItem;
import net.mcreator.geoimmersion.item.CopperSwordItem;
import net.mcreator.geoimmersion.item.CopperShovelItem;
import net.mcreator.geoimmersion.item.CopperPickaxeItem;
import net.mcreator.geoimmersion.item.CopperIngotItem;
import net.mcreator.geoimmersion.item.CopperHoeItem;
import net.mcreator.geoimmersion.item.CopperGeologistHammerItem;
import net.mcreator.geoimmersion.item.CopperAxeItem;
import net.mcreator.geoimmersion.item.CopperArmorItem;
import net.mcreator.geoimmersion.item.CinnaberItem;
import net.mcreator.geoimmersion.item.CasseteriteItem;
import net.mcreator.geoimmersion.item.CarbideItem;
import net.mcreator.geoimmersion.item.CalciteItem;
import net.mcreator.geoimmersion.item.BulletItem;
import net.mcreator.geoimmersion.item.BiotiteItem;
import net.mcreator.geoimmersion.item.BasalticLavaItem;
import net.mcreator.geoimmersion.item.Asbestos_suitArmorItem;
import net.mcreator.geoimmersion.item.ApatiteItem;
import net.mcreator.geoimmersion.item.AmmoniumnitrateItem;
import net.mcreator.geoimmersion.item.AmmoniteItem;
import net.mcreator.geoimmersion.item.AmmoniaItem;
import net.mcreator.geoimmersion.item.AmethistItem;
import net.mcreator.geoimmersion.item.AmbarItem;
import net.mcreator.geoimmersion.item.AluminumprospectorpanItem;
import net.mcreator.geoimmersion.item.AluminumarrowItem;
import net.mcreator.geoimmersion.item.AluminumBowItem;
import net.mcreator.geoimmersion.item.AluminiumItem;
import net.mcreator.geoimmersion.item.AftermathofthebeginningItem;
import net.mcreator.geoimmersion.item.AMmoniumnitratesolutionItem;
import net.mcreator.geoimmersion.GeoimmersionMod;

public class GeoimmersionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GeoimmersionMod.MODID);
	public static final RegistryObject<Item> GRANITE = block(GeoimmersionModBlocks.GRANITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> DIORITE = block(GeoimmersionModBlocks.DIORITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> ANDESITE = block(GeoimmersionModBlocks.ANDESITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> COLUMNARBASALT = block(GeoimmersionModBlocks.COLUMNARBASALT, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> DIABASE = block(GeoimmersionModBlocks.DIABASE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> RIOLITE = block(GeoimmersionModBlocks.RIOLITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> KIMBERLITE = block(GeoimmersionModBlocks.KIMBERLITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GABRO = block(GeoimmersionModBlocks.GABRO, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> PERIDOTITE = block(GeoimmersionModBlocks.PERIDOTITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GNAISSE = block(GeoimmersionModBlocks.GNAISSE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> MARBLE = block(GeoimmersionModBlocks.MARBLE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> QUARTIZITE = block(GeoimmersionModBlocks.QUARTIZITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SLATE = block(GeoimmersionModBlocks.SLATE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SCHIST = block(GeoimmersionModBlocks.SCHIST, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> BAUXITE = block(GeoimmersionModBlocks.BAUXITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SKARN = block(GeoimmersionModBlocks.SKARN, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SANDSTONE = block(GeoimmersionModBlocks.SANDSTONE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GRAVITY_SANDSTONE = block(GeoimmersionModBlocks.GRAVITY_SANDSTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> METASANDSTONE = block(GeoimmersionModBlocks.METASANDSTONE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> LIMESTONE = block(GeoimmersionModBlocks.LIMESTONE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GRAVITY_LIMESTONE = block(GeoimmersionModBlocks.GRAVITY_LIMESTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> METALIMESTONE = block(GeoimmersionModBlocks.METALIMESTONE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> STALACTITE = block(GeoimmersionModBlocks.STALACTITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> EVAPORITE = block(GeoimmersionModBlocks.EVAPORITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SANDSTONE_SILICIFIED = block(GeoimmersionModBlocks.SANDSTONE_SILICIFIED,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> BANDED_IRON_FORMATION = block(GeoimmersionModBlocks.BANDED_IRON_FORMATION,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> TRAVERTINE = block(GeoimmersionModBlocks.TRAVERTINE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> FLUORITEINGRANITE = block(GeoimmersionModBlocks.FLUORITEINGRANITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> CASSETERITEON_GRANITE = block(GeoimmersionModBlocks.CASSETERITEON_GRANITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> TORBENITEIN_GRANITE = block(GeoimmersionModBlocks.TORBENITEIN_GRANITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SPODUMENEINGRANITE = block(GeoimmersionModBlocks.SPODUMENEINGRANITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> APATITEIN_GRANITE = block(GeoimmersionModBlocks.APATITEIN_GRANITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> COPPERIN_GABRO = block(GeoimmersionModBlocks.COPPERIN_GABRO, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> PLATINUMIN_GABRO = block(GeoimmersionModBlocks.PLATINUMIN_GABRO,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> TITANIUMMAGNETIREIN_GABRO = block(GeoimmersionModBlocks.TITANIUMMAGNETIREIN_GABRO,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> DIAMONDIN_KIMBERLITE = block(GeoimmersionModBlocks.DIAMONDIN_KIMBERLITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GALENA = block(GeoimmersionModBlocks.GALENA, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GALENA_ARGENTIFERE = block(GeoimmersionModBlocks.GALENA_ARGENTIFERE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> EMERALDIN_GNAISSE = block(GeoimmersionModBlocks.EMERALDIN_GNAISSE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> LAPIS_LAZULIIN_MARBLE = block(GeoimmersionModBlocks.LAPIS_LAZULIIN_MARBLE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> QUARTIZITEWITHGOLDDUST = block(GeoimmersionModBlocks.QUARTIZITEWITHGOLDDUST,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> QUARTIZITEWITHGOLDNUGGETS = block(GeoimmersionModBlocks.QUARTIZITEWITHGOLDNUGGETS,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> QUARTIZITEWITHHUGEGOLDNUGGET = block(GeoimmersionModBlocks.QUARTIZITEWITHHUGEGOLDNUGGET,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> QUARTIZITEWITH_SILVER = block(GeoimmersionModBlocks.QUARTIZITEWITH_SILVER,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> RUTILEINQUARTIZITE = block(GeoimmersionModBlocks.RUTILEINQUARTIZITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> COALONLIMESTONE = block(GeoimmersionModBlocks.COALONLIMESTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> COALON_METALIMESTONE = block(GeoimmersionModBlocks.COALON_METALIMESTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> COALIN_METASANDSTONE = block(GeoimmersionModBlocks.COALIN_METASANDSTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> COALON_SANDSTONE = block(GeoimmersionModBlocks.COALON_SANDSTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> METEORITE = block(GeoimmersionModBlocks.METEORITE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> METEORITEDROPPED = block(GeoimmersionModBlocks.METEORITEDROPPED,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GLACIERICE = block(GeoimmersionModBlocks.GLACIERICE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SULFURROCK = block(GeoimmersionModBlocks.SULFURROCK, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SODIUM_NITRATE_BLOCK = block(GeoimmersionModBlocks.SODIUM_NITRATE_BLOCK,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> POTASSIUM_CHLORIDE_BLOCK = block(GeoimmersionModBlocks.POTASSIUM_CHLORIDE_BLOCK,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> VOLCANICASH = block(GeoimmersionModBlocks.VOLCANICASH, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> VOLCANICTUFF = block(GeoimmersionModBlocks.VOLCANICTUFF, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> SOFTSNOW = block(GeoimmersionModBlocks.SOFTSNOW, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> RED_SOIL = block(GeoimmersionModBlocks.RED_SOIL, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> POROUS_LIMESTONE = block(GeoimmersionModBlocks.POROUS_LIMESTONE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> CONTAMINATEDDIRT = block(GeoimmersionModBlocks.CONTAMINATEDDIRT,
			GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GRANITESLAB = block(GeoimmersionModBlocks.GRANITESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GRANITESTAIRS = block(GeoimmersionModBlocks.GRANITESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GRANITEWALL = block(GeoimmersionModBlocks.GRANITEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDGRANITE = block(GeoimmersionModBlocks.POLISHEDGRANITE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GRANITE_SLAB = block(GeoimmersionModBlocks.POLISHED_GRANITE_SLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GRANITESTAIRS = block(GeoimmersionModBlocks.POLISHED_GRANITESTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDGRANITEWALL = block(GeoimmersionModBlocks.POLISHEDGRANITEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GRANITEBRICKS = block(GeoimmersionModBlocks.GRANITEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GRANITEBRICKSSLAB = block(GeoimmersionModBlocks.GRANITEBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GRANITEBRICKSSTAIR = block(GeoimmersionModBlocks.GRANITEBRICKSSTAIR,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GRANITEBRICKSWALLS = block(GeoimmersionModBlocks.GRANITEBRICKSWALLS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITESLAB = block(GeoimmersionModBlocks.DIORITESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITESTAIRS = block(GeoimmersionModBlocks.DIORITESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITEWALL = block(GeoimmersionModBlocks.DIORITEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_DIORITE = block(GeoimmersionModBlocks.POLISHED_DIORITE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDDIORITESLAB = block(GeoimmersionModBlocks.POLISHEDDIORITESLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDDIORITESTAIRS = block(GeoimmersionModBlocks.POLISHEDDIORITESTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDDIORITEWALL = block(GeoimmersionModBlocks.POLISHEDDIORITEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITEBRICKS = block(GeoimmersionModBlocks.DIORITEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITEBRICKSSLAB = block(GeoimmersionModBlocks.DIORITEBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITEBRICKSSTAIRS = block(GeoimmersionModBlocks.DIORITEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIORITEBRICKSWALL = block(GeoimmersionModBlocks.DIORITEBRICKSWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> ANDESITE_SLAB = block(GeoimmersionModBlocks.ANDESITE_SLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> ANDESITE_STAIRS = block(GeoimmersionModBlocks.ANDESITE_STAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> ANDESITEWALL = block(GeoimmersionModBlocks.ANDESITEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDANDESITE = block(GeoimmersionModBlocks.POLISHEDANDESITE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDANDESITESLABS = block(GeoimmersionModBlocks.POLISHEDANDESITESLABS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDANDESITESTAIRS = block(GeoimmersionModBlocks.POLISHEDANDESITESTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDANDESITEWALL = block(GeoimmersionModBlocks.POLISHEDANDESITEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDANDESITEBRICKS = block(GeoimmersionModBlocks.POLISHEDANDESITEBRICKS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> ANDESITEBRICKSSLAB = block(GeoimmersionModBlocks.ANDESITEBRICKSSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> ANDESITEBRICKSSTAIRS = block(GeoimmersionModBlocks.ANDESITEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> ANDESITEBRICKSWALL = block(GeoimmersionModBlocks.ANDESITEBRICKSWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTSLAB = block(GeoimmersionModBlocks.BASALTSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTSTAIRS = block(GeoimmersionModBlocks.BASALTSTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTWALL = block(GeoimmersionModBlocks.BASALTWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDBASALT = block(GeoimmersionModBlocks.POLISHEDBASALT, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDBASALTSLABS = block(GeoimmersionModBlocks.POLISHEDBASALTSLABS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDBASALTSTAIRS = block(GeoimmersionModBlocks.POLISHEDBASALTSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDBASALTWALL = block(GeoimmersionModBlocks.POLISHEDBASALTWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTBRICKS = block(GeoimmersionModBlocks.BASALTBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTBRICKSSLAB = block(GeoimmersionModBlocks.BASALTBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTBRICKSSTAIRS = block(GeoimmersionModBlocks.BASALTBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BASALTBRICKSWALL = block(GeoimmersionModBlocks.BASALTBRICKSWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASESLAB = block(GeoimmersionModBlocks.DIABASESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASESTAIRS = block(GeoimmersionModBlocks.DIABASESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASEWALL = block(GeoimmersionModBlocks.DIABASEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDDIABASE = block(GeoimmersionModBlocks.POLISHEDDIABASE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_DIABASE_SLAB = block(GeoimmersionModBlocks.POLISHED_DIABASE_SLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_DIABASE_STAIRS = block(GeoimmersionModBlocks.POLISHED_DIABASE_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDDIABASEWALL = block(GeoimmersionModBlocks.POLISHEDDIABASEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASEBRICKS = block(GeoimmersionModBlocks.DIABASEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASEBRICKSSLAB = block(GeoimmersionModBlocks.DIABASEBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASEBRICKSSTAIRS = block(GeoimmersionModBlocks.DIABASEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> DIABASEBRICKSWALL = block(GeoimmersionModBlocks.DIABASEBRICKSWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> RIOLITESLAB = block(GeoimmersionModBlocks.RIOLITESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> RIOLITESTAIRS = block(GeoimmersionModBlocks.RIOLITESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> RIOLITEWALL = block(GeoimmersionModBlocks.RIOLITEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDRIOLITE = block(GeoimmersionModBlocks.POLISHEDRIOLITE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_RHYOLITE_SLAB = block(GeoimmersionModBlocks.POLISHED_RHYOLITE_SLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_RIOLITE_STAIRS = block(GeoimmersionModBlocks.POLISHED_RIOLITE_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_RHYOLITE_WALL = block(GeoimmersionModBlocks.POLISHED_RHYOLITE_WALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> KIMBERLITESLAB = block(GeoimmersionModBlocks.KIMBERLITESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> KIMBERLITESTAIRS = block(GeoimmersionModBlocks.KIMBERLITESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> KIMBERLITEWALL = block(GeoimmersionModBlocks.KIMBERLITEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_KIMBERLITE = block(GeoimmersionModBlocks.POLISHED_KIMBERLITE,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_KIMBERLITE_SLAB = block(GeoimmersionModBlocks.POLISHED_KIMBERLITE_SLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_KIMBERLITE_STAIRS = block(GeoimmersionModBlocks.POLISHED_KIMBERLITE_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_KIMBERLITE_WALL = block(GeoimmersionModBlocks.POLISHED_KIMBERLITE_WALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> K_IMBERLITEBRICKS = block(GeoimmersionModBlocks.K_IMBERLITEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> KIMBERLITEBRICKSSLAB = block(GeoimmersionModBlocks.KIMBERLITEBRICKSSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> KIMBERLITEBRICKSSTAIRS = block(GeoimmersionModBlocks.KIMBERLITEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> KIMBERLITEBRICKSWALL = block(GeoimmersionModBlocks.KIMBERLITEBRICKSWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBRO_SLAB = block(GeoimmersionModBlocks.GABBRO_SLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBROSTAIRS = block(GeoimmersionModBlocks.GABBROSTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBROWALL = block(GeoimmersionModBlocks.GABBROWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GABBRO = block(GeoimmersionModBlocks.POLISHED_GABBRO, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDGABBROSLAB = block(GeoimmersionModBlocks.POLISHEDGABBROSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GABBRO_STAIRS = block(GeoimmersionModBlocks.POLISHED_GABBRO_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_WALL_GABBRO = block(GeoimmersionModBlocks.POLISHED_WALL_GABBRO,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBROBRICKS = block(GeoimmersionModBlocks.GABBROBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBROBRICKSSLAB = block(GeoimmersionModBlocks.GABBROBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBROBRICKSSTAIRS = block(GeoimmersionModBlocks.GABBROBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GABBROBRICKSWALL = block(GeoimmersionModBlocks.GABBROBRICKSWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTITESLAB = block(GeoimmersionModBlocks.PERIDOTITESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTITESTAIRS = block(GeoimmersionModBlocks.PERIDOTITESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTITEWALL = block(GeoimmersionModBlocks.PERIDOTITEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDPERIDOTITE = block(GeoimmersionModBlocks.POLISHEDPERIDOTITE,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDPERIDOTITESLAB = block(GeoimmersionModBlocks.POLISHEDPERIDOTITESLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_PERIODITE_STAIRS = block(GeoimmersionModBlocks.POLISHED_PERIODITE_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_PERIDOTITE_WALL = block(GeoimmersionModBlocks.POLISHED_PERIDOTITE_WALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTITEBRICKS = block(GeoimmersionModBlocks.PERIDOTITEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTITEBRICKSSLAB = block(GeoimmersionModBlocks.PERIDOTITEBRICKSSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTITEBRICKSSTAIRSRECIPE = block(GeoimmersionModBlocks.PERIDOTITEBRICKSSTAIRSRECIPE,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> PERIDOTIEBRICKSWALL = block(GeoimmersionModBlocks.PERIDOTIEBRICKSWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNAISSSLAB = block(GeoimmersionModBlocks.GNAISSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNAISSSTAIRS = block(GeoimmersionModBlocks.GNAISSSTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNAISSWALL = block(GeoimmersionModBlocks.GNAISSWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDGNAISS = block(GeoimmersionModBlocks.POLISHEDGNAISS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GNEISS_SLAB = block(GeoimmersionModBlocks.POLISHED_GNEISS_SLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GNEISS_STAIRS = block(GeoimmersionModBlocks.POLISHED_GNEISS_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_GNEISS_WALL = block(GeoimmersionModBlocks.POLISHED_GNEISS_WALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNAISSBRICKS = block(GeoimmersionModBlocks.GNAISSBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNAISSBRICKSSLAB = block(GeoimmersionModBlocks.GNAISSBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNEISS_BRICKS_STAIRS = block(GeoimmersionModBlocks.GNEISS_BRICKS_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GNEISS_BRICKS_WALL = block(GeoimmersionModBlocks.GNEISS_BRICKS_WALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLESLAB = block(GeoimmersionModBlocks.MARBLESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLESTAIRS = block(GeoimmersionModBlocks.MARBLESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEWALL = block(GeoimmersionModBlocks.MARBLEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_MARBLE = block(GeoimmersionModBlocks.POLISHED_MARBLE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDMARBLESLAB = block(GeoimmersionModBlocks.POLISHEDMARBLESLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDMARBLESTAIRS = block(GeoimmersionModBlocks.POLISHEDMARBLESTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDMARBLEWALL = block(GeoimmersionModBlocks.POLISHEDMARBLEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEBRICKS = block(GeoimmersionModBlocks.MARBLEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEBRICKSSLAB = block(GeoimmersionModBlocks.MARBLEBRICKSSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEBRICKSSTAIR = block(GeoimmersionModBlocks.MARBLEBRICKSSTAIR, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEBRICKSWALL = block(GeoimmersionModBlocks.MARBLEBRICKSWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATE_SLAB = block(GeoimmersionModBlocks.SLATE_SLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATE_STAIRS = block(GeoimmersionModBlocks.SLATE_STAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATEWALL = block(GeoimmersionModBlocks.SLATEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_SLATE = block(GeoimmersionModBlocks.POLISHED_SLATE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSLATESLAB = block(GeoimmersionModBlocks.POLISHEDSLATESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSLATESTAIRS = block(GeoimmersionModBlocks.POLISHEDSLATESTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_SLATEWALL = block(GeoimmersionModBlocks.POLISHED_SLATEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATE_TILE = block(GeoimmersionModBlocks.SLATE_TILE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATE_TILE_SLAB = block(GeoimmersionModBlocks.SLATE_TILE_SLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATE_TILE_STAIRS = block(GeoimmersionModBlocks.SLATE_TILE_STAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SLATE_TILE_WALL = block(GeoimmersionModBlocks.SLATE_TILE_WALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHISTSLAB = block(GeoimmersionModBlocks.SCHISTSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHISTSTAIRS = block(GeoimmersionModBlocks.SCHISTSTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHISTWALL = block(GeoimmersionModBlocks.SCHISTWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSCHIST = block(GeoimmersionModBlocks.POLISHEDSCHIST, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHOSTSLAB = block(GeoimmersionModBlocks.SCHOSTSLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_SCHIST_STAIRS = block(GeoimmersionModBlocks.POLISHED_SCHIST_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_SCHIST_WALL = block(GeoimmersionModBlocks.POLISHED_SCHIST_WALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHISTBRICKS = block(GeoimmersionModBlocks.SCHISTBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHISTSLABBRICKS = block(GeoimmersionModBlocks.SCHISTSLABBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> STAIRSCHISTBRICKS = block(GeoimmersionModBlocks.STAIRSCHISTBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SCHIST_BRICK_WALL = block(GeoimmersionModBlocks.SCHIST_BRICK_WALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SANDSTONESLAB = block(GeoimmersionModBlocks.SANDSTONESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SANDSTONESTAIRS = block(GeoimmersionModBlocks.SANDSTONESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SANDSTONEWALL = block(GeoimmersionModBlocks.SANDSTONEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSANDSTONE = block(GeoimmersionModBlocks.POLISHEDSANDSTONE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSANDSTONESLAB = block(GeoimmersionModBlocks.POLISHEDSANDSTONESLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSANDSTONESTAIRS = block(GeoimmersionModBlocks.POLISHEDSANDSTONESTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSANDSTONEWALL = block(GeoimmersionModBlocks.POLISHEDSANDSTONEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDSANDSTONEBRICKS = block(GeoimmersionModBlocks.POLISHEDSANDSTONEBRICKS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SANDSTONEBRICKSSLAB = block(GeoimmersionModBlocks.SANDSTONEBRICKSSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SANDSTONESTAIRBRICKS = block(GeoimmersionModBlocks.SANDSTONESTAIRBRICKS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SANDSTONEBRICKSWALL = block(GeoimmersionModBlocks.SANDSTONEBRICKSWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONESLAB = block(GeoimmersionModBlocks.LIMESTONESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONESTAIRS = block(GeoimmersionModBlocks.LIMESTONESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONEWALL = block(GeoimmersionModBlocks.LIMESTONEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDLIMESTONE = block(GeoimmersionModBlocks.POLISHEDLIMESTONE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_LIMESTONE_SLAB = block(GeoimmersionModBlocks.POLISHED_LIMESTONE_SLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_LIMESTONE_STAIRS = block(GeoimmersionModBlocks.POLISHED_LIMESTONE_STAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHED_LIMESTONEWALL = block(GeoimmersionModBlocks.POLISHED_LIMESTONEWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONEBRICKS = block(GeoimmersionModBlocks.LIMESTONEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONEBRICKSSLAB = block(GeoimmersionModBlocks.LIMESTONEBRICKSSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONEBRICKSSTAIRS = block(GeoimmersionModBlocks.LIMESTONEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> LIMESTONEBRICKSWALL = block(GeoimmersionModBlocks.LIMESTONEBRICKSWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> POLISHEDTRAVERTINE = block(GeoimmersionModBlocks.POLISHEDTRAVERTINE,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> TRAVERTINESLAB = block(GeoimmersionModBlocks.TRAVERTINESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> TRAVERTINESTAIRS = block(GeoimmersionModBlocks.TRAVERTINESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> TRAVERTINEWALL = block(GeoimmersionModBlocks.TRAVERTINEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GLACIERICESLAB = block(GeoimmersionModBlocks.GLACIERICESLAB, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GLACIERICESTAIRS = block(GeoimmersionModBlocks.GLACIERICESTAIRS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> G_LACIERICEWALL = block(GeoimmersionModBlocks.G_LACIERICEWALL, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GLACIERICEBRICKS = block(GeoimmersionModBlocks.GLACIERICEBRICKS, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GLACIERICEBRICKSSLAB = block(GeoimmersionModBlocks.GLACIERICEBRICKSSLAB,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GLACIERICEBRICKSSTAIRS = block(GeoimmersionModBlocks.GLACIERICEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> GLACIERICEBRICKSWALL = block(GeoimmersionModBlocks.GLACIERICEBRICKSWALL,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDBASALT_1 = block(GeoimmersionModBlocks.CARVEDBASALT_1, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDBASALT_2 = block(GeoimmersionModBlocks.CARVEDBASALT_2, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDBASALT_3 = block(GeoimmersionModBlocks.CARVEDBASALT_3, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_1 = block(GeoimmersionModBlocks.CARVED_GABBRO_1, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_2 = block(GeoimmersionModBlocks.CARVED_GABBRO_2, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_3 = block(GeoimmersionModBlocks.CARVED_GABBRO_3, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_4 = block(GeoimmersionModBlocks.CARVED_GABBRO_4, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_5 = block(GeoimmersionModBlocks.CARVED_GABBRO_5, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_6 = block(GeoimmersionModBlocks.CARVED_GABBRO_6, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_GABBRO_VII = block(GeoimmersionModBlocks.CARVED_GABBRO_VII, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEPILLAR = block(GeoimmersionModBlocks.MARBLEPILLAR, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEPILLARBASE = block(GeoimmersionModBlocks.MARBLEPILLARBASE, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEPILLARTOP = block(GeoimmersionModBlocks.MARBLEPILLARTOP, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDMARBLE_1 = block(GeoimmersionModBlocks.CARVEDMARBLE_1, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CAVERDMARBLE_2 = block(GeoimmersionModBlocks.CAVERDMARBLE_2, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDMARBLE_3 = block(GeoimmersionModBlocks.CARVEDMARBLE_3, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDMARBLE_4 = block(GeoimmersionModBlocks.CARVEDMARBLE_4, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVED_MARBLE_5 = block(GeoimmersionModBlocks.CARVED_MARBLE_5, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> SIMPLECARVEDSANDSTONE_1 = block(GeoimmersionModBlocks.SIMPLECARVEDSANDSTONE_1,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDSANDSTONE_1 = block(GeoimmersionModBlocks.CARVEDSANDSTONE_1, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDSANDSTONE_2 = block(GeoimmersionModBlocks.CARVEDSANDSTONE_2, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDSANDSTONE_3 = block(GeoimmersionModBlocks.CARVEDSANDSTONE_3, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDSANDSTONE_4 = block(GeoimmersionModBlocks.CARVEDSANDSTONE_4, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDSANDSTONE_5 = block(GeoimmersionModBlocks.CARVEDSANDSTONE_5, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDSANDSTONE_6 = block(GeoimmersionModBlocks.CARVEDSANDSTONE_6, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDLIMESTONE_1 = block(GeoimmersionModBlocks.CARVEDLIMESTONE_1, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDLIMESTONE_2 = block(GeoimmersionModBlocks.CARVEDLIMESTONE_2, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDLIMESTONE_3 = block(GeoimmersionModBlocks.CARVEDLIMESTONE_3, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> CARVEDLIMESTONE_4 = block(GeoimmersionModBlocks.CARVEDLIMESTONE_4, GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> MARBLEBRICKSSTAIRS = block(GeoimmersionModBlocks.MARBLEBRICKSSTAIRS,
			GeoimmersionModTabs.TAB_CARVED_ROCKS);
	public static final RegistryObject<Item> BURNEDWOOD = block(GeoimmersionModBlocks.BURNEDWOOD, GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> NOBELS_DYNAMITE = block(GeoimmersionModBlocks.NOBELS_DYNAMITE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> STEEL = REGISTRY.register("steel", () -> new SteelItem());
	public static final RegistryObject<Item> CYLINDER = REGISTRY.register("cylinder", () -> new CylinderItem());
	public static final RegistryObject<Item> ENGINEBLOCK = REGISTRY.register("engineblock", () -> new EngineblockItem());
	public static final RegistryObject<Item> STEELBLOCK = block(GeoimmersionModBlocks.STEELBLOCK, GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> PISTONPIN = REGISTRY.register("pistonpin", () -> new PistonpinItem());
	public static final RegistryObject<Item> PISTONHEAD = REGISTRY.register("pistonhead", () -> new PistonheadItem());
	public static final RegistryObject<Item> PISTON = REGISTRY.register("piston", () -> new PistonItem());
	public static final RegistryObject<Item> OIL_BUCKET = REGISTRY.register("oil_bucket", () -> new OilItem());
	public static final RegistryObject<Item> STITCHEDLEATHER = REGISTRY.register("stitchedleather", () -> new StitchedleatherItem());
	public static final RegistryObject<Item> FILLEDOILBARREL = REGISTRY.register("filledoilbarrel", () -> new FilledoilbarrelItem());
	public static final RegistryObject<Item> OILBARREL = REGISTRY.register("oilbarrel", () -> new OilbarrelItem());
	public static final RegistryObject<Item> GEOLOGISTPACK = REGISTRY.register("geologistpack", () -> new GeologistpackItem());
	public static final RegistryObject<Item> FELDSPARSANDPAPER = REGISTRY.register("feldsparsandpaper", () -> new FeldsparsandpaperItem());
	public static final RegistryObject<Item> QUARTZSANDPAPER = REGISTRY.register("quartzsandpaper", () -> new QuartzsandpaperItem());
	public static final RegistryObject<Item> GARNETSANDPAPER = REGISTRY.register("garnetsandpaper", () -> new GarnetsandpaperItem());
	public static final RegistryObject<Item> EMERALDSANDPAPER = REGISTRY.register("emeraldsandpaper", () -> new EmeraldsandpaperItem());
	public static final RegistryObject<Item> DIAMONDSANDPAPER = REGISTRY.register("diamondsandpaper", () -> new DiamondsandpaperItem());
	public static final RegistryObject<Item> MINERALTABLE = block(GeoimmersionModBlocks.MINERALTABLE,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> TABLELEG = REGISTRY.register("tableleg", () -> new TablelegItem());
	public static final RegistryObject<Item> NOBELSTHROWABLEDYNAMITE = REGISTRY.register("nobelsthrowabledynamite",
			() -> new NobelsthrowabledynamiteItem());
	public static final RegistryObject<Item> HAND_TNT = REGISTRY.register("hand_tnt", () -> new HandTNTItem());
	public static final RegistryObject<Item> TRILOBITE = REGISTRY.register("trilobite", () -> new TrilobiteItem());
	public static final RegistryObject<Item> AFTERMATHOFTHEBEGINNING = REGISTRY.register("aftermathofthebeginning",
			() -> new AftermathofthebeginningItem());
	public static final RegistryObject<Item> SISTER_THEIA = REGISTRY.register("sister_theia", () -> new SisterTheiaItem());
	public static final RegistryObject<Item> MEMYFELFANDMYENEMY_LOST_FISHES_NEGRIBEATS = REGISTRY
			.register("memyfelfandmyenemy_lost_fishes_negribeats", () -> new MemyfelfandmyenemyLostFishesNegribeatsItem());
	public static final RegistryObject<Item> FERTILIZER = REGISTRY.register("fertilizer", () -> new FertilizerItem());
	public static final RegistryObject<Item> STEELALLOY = REGISTRY.register("steelalloy", () -> new SteelalloyItem());
	public static final RegistryObject<Item> BASALTIC_LAVA_BUCKET = REGISTRY.register("basaltic_lava_bucket", () -> new BasalticLavaItem());
	public static final RegistryObject<Item> PETRIFIEDWOOD = block(GeoimmersionModBlocks.PETRIFIEDWOOD,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> AMMONITE = REGISTRY.register("ammonite", () -> new AmmoniteItem());
	public static final RegistryObject<Item> AMBAR = REGISTRY.register("ambar", () -> new AmbarItem());
	public static final RegistryObject<Item> RED_SOIL_GRASS = block(GeoimmersionModBlocks.RED_SOIL_GRASS,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> YELLOW_IPE_LOG = block(GeoimmersionModBlocks.YELLOW_IPE_LOG,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> YELLOW_IPE_LEAVES = block(GeoimmersionModBlocks.YELLOW_IPE_LEAVES,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> YELLOW_IPE_WOOD = block(GeoimmersionModBlocks.YELLOW_IPE_WOOD,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> YELLOW_IPE_PLANKS = block(GeoimmersionModBlocks.YELLOW_IPE_PLANKS,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> AMBAR_FOSSIL = block(GeoimmersionModBlocks.AMBAR_FOSSIL,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS);
	public static final RegistryObject<Item> SLAG = REGISTRY.register("slag", () -> new SlagItem());
	public static final RegistryObject<Item> PYRITEMINERAL = block(GeoimmersionModBlocks.PYRITEMINERAL,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MINERALS);
	public static final RegistryObject<Item> CINNABERCRYSTAL = block(GeoimmersionModBlocks.CINNABERCRYSTAL,
			GeoimmersionModTabs.TAB_GEOIMMERSION_MINERALS);
	public static final RegistryObject<Item> QUARTZ = REGISTRY.register("quartz", () -> new QuartzItem());
	public static final RegistryObject<Item> FELDSPAR = REGISTRY.register("feldspar", () -> new FeldsparItem());
	public static final RegistryObject<Item> BIOTITE = REGISTRY.register("biotite", () -> new BiotiteItem());
	public static final RegistryObject<Item> CASSETERITE = REGISTRY.register("casseterite", () -> new CasseteriteItem());
	public static final RegistryObject<Item> WOLFRAMITE = REGISTRY.register("wolframite", () -> new WolframiteItem());
	public static final RegistryObject<Item> RUTILE = REGISTRY.register("rutile", () -> new RutileItem());
	public static final RegistryObject<Item> TOURMALINE = REGISTRY.register("tourmaline", () -> new TourmalineItem());
	public static final RegistryObject<Item> HORNBLENDE = REGISTRY.register("hornblende", () -> new HornblendeItem());
	public static final RegistryObject<Item> GARNET = REGISTRY.register("garnet", () -> new GarnetItem());
	public static final RegistryObject<Item> TUNGSTENINGOT = REGISTRY.register("tungsteningot", () -> new TungsteningotItem());
	public static final RegistryObject<Item> SULFUR = REGISTRY.register("sulfur", () -> new SulfurItem());
	public static final RegistryObject<Item> VANADINITE = REGISTRY.register("vanadinite", () -> new VanadiniteItem());
	public static final RegistryObject<Item> TORBENITE = REGISTRY.register("torbenite", () -> new TorbeniteItem());
	public static final RegistryObject<Item> FLUORITE = REGISTRY.register("fluorite", () -> new FluoriteItem());
	public static final RegistryObject<Item> PYRITE = REGISTRY.register("pyrite", () -> new PyriteItem());
	public static final RegistryObject<Item> APATITE = REGISTRY.register("apatite", () -> new ApatiteItem());
	public static final RegistryObject<Item> MAGNETITE = REGISTRY.register("magnetite", () -> new MagnetiteItem());
	public static final RegistryObject<Item> OLIVINE = REGISTRY.register("olivine", () -> new OlivineItem());
	public static final RegistryObject<Item> SPHALERITE = REGISTRY.register("sphalerite", () -> new SphaleriteItem());
	public static final RegistryObject<Item> OSMIUM = REGISTRY.register("osmium", () -> new OsmiumItem());
	public static final RegistryObject<Item> ZINC = REGISTRY.register("zinc", () -> new ZincItem());
	public static final RegistryObject<Item> SPODUMENE = REGISTRY.register("spodumene", () -> new SpodumeneItem());
	public static final RegistryObject<Item> TININGOT = REGISTRY.register("tiningot", () -> new TiningotItem());
	public static final RegistryObject<Item> COPPER_INGOT = REGISTRY.register("copper_ingot", () -> new CopperIngotItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> PLATINUM_INGOT = REGISTRY.register("platinum_ingot", () -> new PlatinumIngotItem());
	public static final RegistryObject<Item> ALUMINIUM = REGISTRY.register("aluminium", () -> new AluminiumItem());
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> VANADIUM = REGISTRY.register("vanadium", () -> new VanadiumItem());
	public static final RegistryObject<Item> NICKELINGOT = REGISTRY.register("nickelingot", () -> new NickelingotItem());
	public static final RegistryObject<Item> CARBIDE = REGISTRY.register("carbide", () -> new CarbideItem());
	public static final RegistryObject<Item> TITANIUMNUGGET = REGISTRY.register("titaniumnugget", () -> new TitaniumnuggetItem());
	public static final RegistryObject<Item> VANADIUMINGOT = REGISTRY.register("vanadiumingot", () -> new VanadiumingotItem());
	public static final RegistryObject<Item> NICKELNUGGET = REGISTRY.register("nickelnugget", () -> new NickelnuggetItem());
	public static final RegistryObject<Item> LITHIUMINGOT = REGISTRY.register("lithiumingot", () -> new LithiumingotItem());
	public static final RegistryObject<Item> LITHIUMNUGGET = REGISTRY.register("lithiumnugget", () -> new LithiumnuggetItem());
	public static final RegistryObject<Item> LEADNUGGET = REGISTRY.register("leadnugget", () -> new LeadnuggetItem());
	public static final RegistryObject<Item> URANIUMINGOT = REGISTRY.register("uraniumingot", () -> new UraniumingotItem());
	public static final RegistryObject<Item> URANIUMNUGGET = REGISTRY.register("uraniumnugget", () -> new UraniumnuggetItem());
	public static final RegistryObject<Item> OSMIUM_INGOT = REGISTRY.register("osmium_ingot", () -> new OsmiumIngotItem());
	public static final RegistryObject<Item> OSMIUMNUGGET = REGISTRY.register("osmiumnugget", () -> new OsmiumnuggetItem());
	public static final RegistryObject<Item> CINNABER = REGISTRY.register("cinnaber", () -> new CinnaberItem());
	public static final RegistryObject<Item> CALCITE = REGISTRY.register("calcite", () -> new CalciteItem());
	public static final RegistryObject<Item> POTASSIUM_CHLORIDE = REGISTRY.register("potassium_chloride", () -> new PotassiumChlorideItem());
	public static final RegistryObject<Item> SODIUM_NITRATE = REGISTRY.register("sodium_nitrate", () -> new SodiumNitrateItem());
	public static final RegistryObject<Item> TRINITROTOLUENE = REGISTRY.register("trinitrotoluene", () -> new TrinitrotolueneItem());
	public static final RegistryObject<Item> AMMONIA = REGISTRY.register("ammonia", () -> new AmmoniaItem());
	public static final RegistryObject<Item> GLICEROL = REGISTRY.register("glicerol", () -> new GlicerolItem());
	public static final RegistryObject<Item> NITROGLICERINE = REGISTRY.register("nitroglicerine", () -> new NitroglicerineItem());
	public static final RegistryObject<Item> PLATINUM_CATALYZER = REGISTRY.register("platinum_catalyzer", () -> new PlatinumCatalyzerItem());
	public static final RegistryObject<Item> POTASSIUMNITRATE = REGISTRY.register("potassiumnitrate", () -> new PotassiumnitrateItem());
	public static final RegistryObject<Item> ERLENMEYER = REGISTRY.register("erlenmeyer", () -> new ErlenmeyerItem());
	public static final RegistryObject<Item> ERLENMEYERWITHWATER = REGISTRY.register("erlenmeyerwithwater", () -> new ErlenmeyerwithwaterItem());
	public static final RegistryObject<Item> SULFURIC_ACID_ERLENMEYER = REGISTRY.register("sulfuric_acid_erlenmeyer",
			() -> new SulfuricAcidErlenmeyerItem());
	public static final RegistryObject<Item> POTASSIUMCHLORIDESOLUTION = REGISTRY.register("potassiumchloridesolution",
			() -> new PotassiumchloridesolutionItem());
	public static final RegistryObject<Item> SODIUMNITRATESOLUTION = REGISTRY.register("sodiumnitratesolution",
			() -> new SodiumnitratesolutionItem());
	public static final RegistryObject<Item> POTASSIUMNITRATESOLUTION = REGISTRY.register("potassiumnitratesolution",
			() -> new PotassiumnitratesolutionItem());
	public static final RegistryObject<Item> VANADIUM_CATALYZER = REGISTRY.register("vanadium_catalyzer", () -> new VanadiumCatalyzerItem());
	public static final RegistryObject<Item> NITRICACID = REGISTRY.register("nitricacid", () -> new NitricacidItem());
	public static final RegistryObject<Item> AMMONIUMNITRATE = REGISTRY.register("ammoniumnitrate", () -> new AmmoniumnitrateItem());
	public static final RegistryObject<Item> A_MMONIUMNITRATESOLUTION = REGISTRY.register("a_mmoniumnitratesolution",
			() -> new AMmoniumnitratesolutionItem());
	public static final RegistryObject<Item> TIN_PICKAXE = REGISTRY.register("tin_pickaxe", () -> new TinPickaxeItem());
	public static final RegistryObject<Item> TIN_AXE = REGISTRY.register("tin_axe", () -> new TinAxeItem());
	public static final RegistryObject<Item> TIN_SHOVEL = REGISTRY.register("tin_shovel", () -> new TinShovelItem());
	public static final RegistryObject<Item> TIN_HOE = REGISTRY.register("tin_hoe", () -> new TinHoeItem());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> LEAD_PICKAXE = REGISTRY.register("lead_pickaxe", () -> new LeadPickaxeItem());
	public static final RegistryObject<Item> LEAD_AXE = REGISTRY.register("lead_axe", () -> new LeadAxeItem());
	public static final RegistryObject<Item> LEAD_SHOVEL = REGISTRY.register("lead_shovel", () -> new LeadShovelItem());
	public static final RegistryObject<Item> LEAD_HOE = REGISTRY.register("lead_hoe", () -> new LeadHoeItem());
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> WOODEN_GEOLOGIST_HAMMER = REGISTRY.register("wooden_geologist_hammer",
			() -> new WoodenGeologistHammerItem());
	public static final RegistryObject<Item> STONE_GEOLOGIST_HAMMER = REGISTRY.register("stone_geologist_hammer",
			() -> new StoneGeologistHammerItem());
	public static final RegistryObject<Item> TIN_GEOLOGISTHAMMER = REGISTRY.register("tin_geologisthammer", () -> new TinGeologisthammerItem());
	public static final RegistryObject<Item> GOLD_GEOLOGIST_HAMMER = REGISTRY.register("gold_geologist_hammer", () -> new GoldGeologistHammerItem());
	public static final RegistryObject<Item> IRON_GEOLOGIST_HAMMER = REGISTRY.register("iron_geologist_hammer", () -> new IronGeologistHammerItem());
	public static final RegistryObject<Item> COPPER_GEOLOGIST_HAMMER = REGISTRY.register("copper_geologist_hammer",
			() -> new CopperGeologistHammerItem());
	public static final RegistryObject<Item> DIAMOND_GEOLOGIST_HAMMER = REGISTRY.register("diamond_geologist_hammer",
			() -> new DiamondGeologistHammerItem());
	public static final RegistryObject<Item> TITANIUMGEOLOGISTHAMMER = REGISTRY.register("titaniumgeologisthammer",
			() -> new TitaniumgeologisthammerItem());
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SilverPickaxeItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final RegistryObject<Item> SILVERGEOLOGISTHAMMER = REGISTRY.register("silvergeologisthammer",
			() -> new SilvergeologisthammerItem());
	public static final RegistryObject<Item> OBSIDIAN_AXE = REGISTRY.register("obsidian_axe", () -> new ObsidianAxeItem());
	public static final RegistryObject<Item> ALUMINUMPROSPECTORPAN = REGISTRY.register("aluminumprospectorpan",
			() -> new AluminumprospectorpanItem());
	public static final RegistryObject<Item> TIN_SWORD = REGISTRY.register("tin_sword", () -> new TinSwordItem());
	public static final RegistryObject<Item> TIN_ARMOR_HELMET = REGISTRY.register("tin_armor_helmet", () -> new TinArmorItem.Helmet());
	public static final RegistryObject<Item> TIN_ARMOR_CHESTPLATE = REGISTRY.register("tin_armor_chestplate", () -> new TinArmorItem.Chestplate());
	public static final RegistryObject<Item> TIN_ARMOR_LEGGINGS = REGISTRY.register("tin_armor_leggings", () -> new TinArmorItem.Leggings());
	public static final RegistryObject<Item> TIN_ARMOR_BOOTS = REGISTRY.register("tin_armor_boots", () -> new TinArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate",
			() -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> LEAD_SWORD = REGISTRY.register("lead_sword", () -> new LeadSwordItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_ARMOR_HELMET = REGISTRY.register("titanium_armor_helmet", () -> new TitaniumArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_ARMOR_CHESTPLATE = REGISTRY.register("titanium_armor_chestplate",
			() -> new TitaniumArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_ARMOR_LEGGINGS = REGISTRY.register("titanium_armor_leggings",
			() -> new TitaniumArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_ARMOR_BOOTS = REGISTRY.register("titanium_armor_boots", () -> new TitaniumArmorItem.Boots());
	public static final RegistryObject<Item> LEAD_ARMOR_HELMET = REGISTRY.register("lead_armor_helmet", () -> new LeadArmorItem.Helmet());
	public static final RegistryObject<Item> LEAD_ARMOR_CHESTPLATE = REGISTRY.register("lead_armor_chestplate", () -> new LeadArmorItem.Chestplate());
	public static final RegistryObject<Item> LEAD_ARMOR_LEGGINGS = REGISTRY.register("lead_armor_leggings", () -> new LeadArmorItem.Leggings());
	public static final RegistryObject<Item> LEAD_ARMOR_BOOTS = REGISTRY.register("lead_armor_boots", () -> new LeadArmorItem.Boots());
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", () -> new ObsidianSwordItem());
	public static final RegistryObject<Item> ALUMINUM_BOW = REGISTRY.register("aluminum_bow", () -> new AluminumBowItem());
	public static final RegistryObject<Item> ALUMINUMARROW = REGISTRY.register("aluminumarrow", () -> new AluminumarrowItem());
	public static final RegistryObject<Item> VOLCANO_SMOKE = block(GeoimmersionModBlocks.VOLCANO_SMOKE, null);
	public static final RegistryObject<Item> MINER_HELMET_HELMET = REGISTRY.register("miner_helmet_helmet", () -> new MinerHelmetItem.Helmet());
	public static final RegistryObject<Item> EMPTY_MINER_HELMET_HELMET = REGISTRY.register("empty_miner_helmet_helmet",
			() -> new EmptyMinerHelmetItem.Helmet());
	public static final RegistryObject<Item> AMETHISTGEOGE = block(GeoimmersionModBlocks.AMETHISTGEOGE, null);
	public static final RegistryObject<Item> AMETHIST = REGISTRY.register("amethist", () -> new AmethistItem());
	public static final RegistryObject<Item> MAGMADROPS = block(GeoimmersionModBlocks.MAGMADROPS, null);
	public static final RegistryObject<Item> OLDCHEST = block(GeoimmersionModBlocks.OLDCHEST, null);
	public static final RegistryObject<Item> MINERALCENTRIFUGUE = block(GeoimmersionModBlocks.MINERALCENTRIFUGUE, null);
	public static final RegistryObject<Item> UPPER_MANTLE = REGISTRY.register("upper_mantle", () -> new UpperMantleItem());
	public static final RegistryObject<Item> PUPPERMANTLEPERIDOTITE = block(GeoimmersionModBlocks.PUPPERMANTLEPERIDOTITE, null);
	public static final RegistryObject<Item> UPPERMANTLEKIMBERLITE = block(GeoimmersionModBlocks.UPPERMANTLEKIMBERLITE, null);
	public static final RegistryObject<Item> UPPERMANTLEDIAMONDKIMBERLITE = block(GeoimmersionModBlocks.UPPERMANTLEDIAMONDKIMBERLITE, null);
	public static final RegistryObject<Item> HANDSAW = REGISTRY.register("handsaw", () -> new HandsawItem());
	public static final RegistryObject<Item> LIGHT = block(GeoimmersionModBlocks.LIGHT, null);
	public static final RegistryObject<Item> PISTOLHAMMER = REGISTRY.register("pistolhammer", () -> new PistolhammerItem());
	public static final RegistryObject<Item> PISTOL = REGISTRY.register("pistol", () -> new PistolItem());
	public static final RegistryObject<Item> HANDGRIP = REGISTRY.register("handgrip", () -> new HandgripItem());
	public static final RegistryObject<Item> ASBESTOS_SUIT_ARMOR_HELMET = REGISTRY.register("asbestos_suit_armor_helmet",
			() -> new Asbestos_suitArmorItem.Helmet());
	public static final RegistryObject<Item> ASBESTOS_SUIT_ARMOR_CHESTPLATE = REGISTRY.register("asbestos_suit_armor_chestplate",
			() -> new Asbestos_suitArmorItem.Chestplate());
	public static final RegistryObject<Item> ASBESTOS_SUIT_ARMOR_LEGGINGS = REGISTRY.register("asbestos_suit_armor_leggings",
			() -> new Asbestos_suitArmorItem.Leggings());
	public static final RegistryObject<Item> ASBESTOS_SUIT_ARMOR_BOOTS = REGISTRY.register("asbestos_suit_armor_boots",
			() -> new Asbestos_suitArmorItem.Boots());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> PISTOLBARREL = REGISTRY.register("pistolbarrel", () -> new PistolbarrelItem());
	public static final RegistryObject<Item> VOLCANOASH_BUCKET = REGISTRY.register("volcanoash_bucket", () -> new VolcanoashItem());
	public static final RegistryObject<Item> MINERAL_CENTRIGUGUE_OFF = block(GeoimmersionModBlocks.MINERAL_CENTRIGUGUE_OFF, null);
	public static final RegistryObject<Item> PETROLEUM = REGISTRY.register("petroleum", () -> new PetroleumItem());
	public static final RegistryObject<Item> BASALT = block(GeoimmersionModBlocks.BASALT, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GEOFURNACE = block(GeoimmersionModBlocks.GEOFURNACE, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);
	public static final RegistryObject<Item> GEOFURNACEOFF = block(GeoimmersionModBlocks.GEOFURNACEOFF, GeoimmersionModTabs.TAB_GEOIMMERSION_ROCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
