package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class SilverAxeItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		if (Math.random() < 0.25) {
			(itemstack).enchant(Enchantments.SMITE, 1);
		}
		if (Math.random() < 0.125) {
			(itemstack).enchant(Enchantments.SMITE, 2);
		}
		if (Math.random() < 0.0625) {
			(itemstack).enchant(Enchantments.SMITE, 3);
		}
		if (Math.random() < 0.03125) {
			(itemstack).enchant(Enchantments.SMITE, 4);
		}
		if (Math.random() < 0.015) {
			(itemstack).enchant(Enchantments.SMITE, 5);
		}
	}
}
