package net.mcreator.geoimmersion.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

public class GraniteDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements()
						.getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("geoimmersion:granite_page"))).isDone()
				: false) {
			return true;
		}
		return false;
	}
}
