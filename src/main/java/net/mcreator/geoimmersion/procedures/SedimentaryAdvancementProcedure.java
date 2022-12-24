package net.mcreator.geoimmersion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.geoimmersion.init.GeoimmersionModBlocks;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class SedimentaryAdvancementProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BAUXITE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.BANDED_IRON_FORMATION.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.LIMESTONE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.SANDSTONE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.METALIMESTONE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.TRAVERTINE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == GeoimmersionModBlocks.EVAPORITE.get()) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("geoimmersion:sedimentary"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
