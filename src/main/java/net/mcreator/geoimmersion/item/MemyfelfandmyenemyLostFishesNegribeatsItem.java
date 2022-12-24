
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;
import net.mcreator.geoimmersion.init.GeoimmersionModSounds;

public class MemyfelfandmyenemyLostFishesNegribeatsItem extends RecordItem {
	public MemyfelfandmyenemyLostFishesNegribeatsItem() {
		super(0, GeoimmersionModSounds.REGISTRY.get(new ResourceLocation("geoimmersion:me_myself_and_my_enemy")),
				new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS).stacksTo(1).rarity(Rarity.RARE));
	}
}
