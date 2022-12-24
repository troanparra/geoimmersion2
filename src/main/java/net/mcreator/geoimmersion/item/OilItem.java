
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;
import net.mcreator.geoimmersion.init.GeoimmersionModFluids;

public class OilItem extends BucketItem {
	public OilItem() {
		super(GeoimmersionModFluids.OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS));
	}
}
