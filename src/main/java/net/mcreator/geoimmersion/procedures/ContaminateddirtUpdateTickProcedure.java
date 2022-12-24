package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

public class ContaminateddirtUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x + 1, y, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x - 1, y, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x, y, z - 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x, y, z + 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x + 1, y + 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x - 1, y + 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x + 1, y - 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x + 1, y - 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x - 1, y - 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x, y + 1, z + 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x, y + 1, z - 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(new BlockPos(x, y - 1, z + 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos(x, y - 1, z - 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x + 1, y, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x - 1, y, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y, z - 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y, z + 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x + 1, y + 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x - 1, y + 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x + 1, y - 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x + 1, y - 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x - 1, y - 1, z), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y + 1, z + 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y + 1, z - 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y - 1, z + 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y - 1, z - 1), GeoimmersionModBlocks.CONTAMINATEDDIRT.get().defaultBlockState(), 3);
			}
		}
	}
}
