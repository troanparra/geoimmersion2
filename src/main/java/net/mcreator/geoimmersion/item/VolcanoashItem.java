
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.geoimmersion.init.GeoimmersionModFluids;

public class VolcanoashItem extends BucketItem {
	public VolcanoashItem() {
		super(GeoimmersionModFluids.VOLCANOASH, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(null));
	}
}
