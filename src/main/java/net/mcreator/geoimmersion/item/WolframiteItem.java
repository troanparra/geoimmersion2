
package net.mcreator.geoimmersion.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;

import java.util.List;

public class WolframiteItem extends Item {
	public WolframiteItem() {
		super(new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_MINERALS).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"An iron and manganese rich tungstate mineral. Its name comes from \uFFFDwolf rahm\uFFFD, the name given to tungsten in 1747 by a Swedish mineralogist. When smelted with a blast furnace it gives one Tungsten ingot."));
	}
}
