
package net.mcreator.geoimmersion.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.geoimmersion.init.GeoimmersionModTabs;
import net.mcreator.geoimmersion.init.GeoimmersionModItems;

public class CopperPickaxeItem extends PickaxeItem {
	public CopperPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 5.5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(GeoimmersionModItems.COPPER_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(GeoimmersionModTabs.TAB_GEOIMMERSION_TOOLS));
	}
}
