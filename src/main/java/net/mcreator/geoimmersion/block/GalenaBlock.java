
package net.mcreator.geoimmersion.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.procedures.Xpdrop1Procedure;

import java.util.List;
import java.util.Collections;

public class GalenaBlock extends Block {
	public GalenaBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(3f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Galena"));
		list.add(new TextComponent("also known as lead glance, is the natural form of PbS."));
		list.add(new TextComponent("It\uFFFDs the most important ore of silver and lead."));
		list.add(new TextComponent(
				"When broken with the Geologist\uFFFDs Hammer, it has the following possible drops: \tCommon - Argentiferous Galena (silver-rich galena) \tUncommon - Sphalerite\\ Fluorite"));
		list.add(new TextComponent("Rare:Vanadinite"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		Xpdrop1Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return retval;
	}
}
