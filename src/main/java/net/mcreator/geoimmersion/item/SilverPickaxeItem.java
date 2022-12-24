
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;
import net.mcreator.geoimmersion.init.GeoimmersionModItems;

public class SilverPickaxeItem extends PickaxeItem {
	public SilverPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 500;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GeoimmersionModItems.SILVER_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_TOOLS));
	}
}
