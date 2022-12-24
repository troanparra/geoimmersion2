package net.mcreator.geoimmersion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MineralcentrifugueUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos(x, y, z)) : false) {
			CentrifugeTickProcedure.execute(world, x, y, z);
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "burntime") > 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.minecart.riding")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.minecart.riding")),
								SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
