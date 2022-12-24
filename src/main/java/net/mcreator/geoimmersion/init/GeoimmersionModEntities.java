
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.geoimmersion.entity.PistolEntity;
import net.mcreator.geoimmersion.entity.NobelsthrowabledynamiteEntity;
import net.mcreator.geoimmersion.entity.HandTNTEntity;
import net.mcreator.geoimmersion.entity.AluminumBowEntity;
import net.mcreator.geoimmersion.GeoimmersionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GeoimmersionModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, GeoimmersionMod.MODID);
	public static final RegistryObject<EntityType<NobelsthrowabledynamiteEntity>> NOBELSTHROWABLEDYNAMITE = register(
			"projectile_nobelsthrowabledynamite",
			EntityType.Builder.<NobelsthrowabledynamiteEntity>of(NobelsthrowabledynamiteEntity::new, MobCategory.MISC)
					.setCustomClientFactory(NobelsthrowabledynamiteEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HandTNTEntity>> HAND_TNT = register("projectile_hand_tnt",
			EntityType.Builder.<HandTNTEntity>of(HandTNTEntity::new, MobCategory.MISC).setCustomClientFactory(HandTNTEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AluminumBowEntity>> ALUMINUM_BOW = register("projectile_aluminum_bow",
			EntityType.Builder.<AluminumBowEntity>of(AluminumBowEntity::new, MobCategory.MISC).setCustomClientFactory(AluminumBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PistolEntity>> PISTOL = register("projectile_pistol",
			EntityType.Builder.<PistolEntity>of(PistolEntity::new, MobCategory.MISC).setCustomClientFactory(PistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
