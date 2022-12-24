package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;

public class FertilizerRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(GeoimmersionModItems.FERTILIZER.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
