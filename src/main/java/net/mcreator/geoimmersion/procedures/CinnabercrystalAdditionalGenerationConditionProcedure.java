package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class CinnabercrystalAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (100); index0++) {
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.RIOLITE.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
			if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get()
					|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BASALT.get())
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
				world.setBlock(new BlockPos(x, y - 1, z), GeoimmersionModBlocks.CINNABERCRYSTAL.get().defaultBlockState(), 3);
				{
					Direction _dir = Direction.DOWN;
					BlockPos _pos = new BlockPos(x, y - 1, z);
					BlockState _bs = world.getBlockState(_pos);
					Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
						world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
					} else {
						_property = _bs.getBlock().getStateDefinition().getProperty("axis");
						if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
							world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
					}
				}
			}
		}
		return true;
	}
}
