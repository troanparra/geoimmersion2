
package net.mcreator.geoimmersion.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.procedures.PyriteprocedureProcedure;
import net.mcreator.geoimmersion.init.GeoimmersionModFluids;

public class BasalticLavaBlock extends LiquidBlock {
	public BasalticLavaBlock() {
		super(() -> (FlowingFluid) GeoimmersionModFluids.BASALTIC_LAVA.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 6));
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 10;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		PyriteprocedureProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
