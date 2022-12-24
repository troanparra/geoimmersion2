package net.mcreator.geoimmersion.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;
import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class FilledoilbarrelRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y + 1, z), GeoimmersionModBlocks.OIL.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GeoimmersionModItems.FILLEDOILBARREL.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GeoimmersionModItems.OILBARREL.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
