package net.mcreator.geoimmersion.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.init.GeoimmersionModItems;

import java.util.Random;

public class AsbestossuitArmorHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == GeoimmersionModItems.ASBESTOS_SUIT_ARMOR_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == GeoimmersionModItems.ASBESTOS_SUIT_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == GeoimmersionModItems.ASBESTOS_SUIT_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == GeoimmersionModItems.ASBESTOS_SUIT_ARMOR_BOOTS.get()) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final int _amount = 1;
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							if (_stk.hurt(_amount, new Random(), null)) {
								_stk.shrink(1);
								_stk.setDamageValue(0);
							}
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 0, 0));
		}
	}
}
