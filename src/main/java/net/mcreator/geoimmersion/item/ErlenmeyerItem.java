
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.geoimmersion.procedures.ErlenmeyerRightClickedOnBlockProcedure;
import net.mcreator.geoimmersion.init.GeoimmersionModTabs;

public class ErlenmeyerItem extends Item {
	public ErlenmeyerItem() {
		super(new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_CHEMISTRY).stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ErlenmeyerRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
