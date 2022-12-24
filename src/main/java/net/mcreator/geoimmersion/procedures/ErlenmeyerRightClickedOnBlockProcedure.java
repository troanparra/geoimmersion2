package net.mcreator.geoimmersion.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;

public class ErlenmeyerRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GeoimmersionModItems.ERLENMEYER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GeoimmersionModItems.ERLENMEYERWITHWATER.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAULDRON
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GeoimmersionModItems.ERLENMEYER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GeoimmersionModItems.ERLENMEYERWITHWATER.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
