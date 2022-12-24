
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;

public class TungsteningotItem extends Item {
	public TungsteningotItem() {
		super(new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_MINERALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
