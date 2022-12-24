
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GeoimmersionModTabs {
	public static CreativeModeTab TAB_GEOIMMERSION_ROCKS;
	public static CreativeModeTab TAB_CARVED_ROCKS;
	public static CreativeModeTab TAB_GEOIMMERSION_CHEMISTRY;
	public static CreativeModeTab TAB_GEOIMMERSION_MISCELLANEOUS;
	public static CreativeModeTab TAB_GEOIMMERSION_MINERALS;
	public static CreativeModeTab TAB_GEOIMMERSION_TOOLS;

	public static void load() {
		TAB_GEOIMMERSION_ROCKS = new CreativeModeTab("tabgeoimmersion_rocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GeoimmersionModBlocks.GRANITE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_CARVED_ROCKS = new CreativeModeTab("tabcarved_rocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GeoimmersionModBlocks.POLISHEDGRANITE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GEOIMMERSION_CHEMISTRY = new CreativeModeTab("tabgeoimmersion_chemistry") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GeoimmersionModItems.ERLENMEYER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GEOIMMERSION_MISCELLANEOUS = new CreativeModeTab("tabgeoimmersion_miscellaneous") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GeoimmersionModItems.SISTER_THEIA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GEOIMMERSION_MINERALS = new CreativeModeTab("tabgeoimmersion_minerals") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GeoimmersionModItems.CASSETERITE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GEOIMMERSION_TOOLS = new CreativeModeTab("tabgeoimmersion_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GeoimmersionModItems.IRON_GEOLOGIST_HAMMER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
