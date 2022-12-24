
package net.mcreator.geoimmersion.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;

import java.util.List;
import java.util.Collections;

public class SulfurrockBlock extends Block {
	public SulfurrockBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(1f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"Sulfur is the chemical element with the atomic symbol of S and atomic number of 16. It has a yellow color at room temperature."));
		list.add(new TextComponent("When broken with the Geologist\uFFFDs Hammer"));
		list.add(new TextComponent("it has the following possible drops:"));
		list.add(new TextComponent("Common - Sulfur"));
		list.add(new TextComponent("Uncommon - Sphalerite"));
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
		return Collections.singletonList(new ItemStack(GeoimmersionModItems.SULFUR.get()));
	}
}
