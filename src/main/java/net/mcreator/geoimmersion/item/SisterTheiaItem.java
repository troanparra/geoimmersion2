
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

public class SisterTheiaItem extends RecordItem {
	public SisterTheiaItem() {
		super(0, GeoimmersionModSounds.REGISTRY.get(new ResourceLocation("geoimmersion:sister_theia")),
				new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_MISCELLANEOUS).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Earth was a molten rock and had a sister"));
		list.add(new TextComponent("Theia."));
		list.add(new TextComponent(
				"Theia collapse into earth on a interplanetary fight, then Earth and Theia debris formed Moon . So Earth cried about her sister death creating the first oceans."));
	}
}
