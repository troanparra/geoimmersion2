
package net.mcreator.geoimmersion.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;
import net.mcreator.geoimmersion.init.GeoimmersionModSounds;

import java.util.List;

public class AftermathofthebeginningItem extends RecordItem {
	public AftermathofthebeginningItem() {
		super(0, GeoimmersionModSounds.REGISTRY.get(new ResourceLocation("geoimmersion:aftermath_of_the_beginning")),
				new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The beginning of Earth history starts on the corpse of a ancestral star"));
	}
}
