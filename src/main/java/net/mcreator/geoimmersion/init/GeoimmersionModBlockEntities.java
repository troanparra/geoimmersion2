
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.geoimmersion.block.entity.OldchestBlockEntity;
import net.mcreator.geoimmersion.block.entity.MineraltableBlockEntity;
import net.mcreator.geoimmersion.block.entity.MineralcentrifugueBlockEntity;
import net.mcreator.geoimmersion.block.entity.MineralCentrigugueOFFBlockEntity;
import net.mcreator.geoimmersion.block.entity.GeofurnaceoffBlockEntity;
import net.mcreator.geoimmersion.block.entity.GeofurnaceBlockEntity;
import net.mcreator.geoimmersion.GeoimmersionMod;

public class GeoimmersionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			GeoimmersionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MINERALTABLE = register("mineraltable", GeoimmersionModBlocks.MINERALTABLE,
			MineraltableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OLDCHEST = register("oldchest", GeoimmersionModBlocks.OLDCHEST, OldchestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINERALCENTRIFUGUE = register("mineralcentrifugue",
			GeoimmersionModBlocks.MINERALCENTRIFUGUE, MineralcentrifugueBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MINERAL_CENTRIGUGUE_OFF = register("mineral_centrigugue_off",
			GeoimmersionModBlocks.MINERAL_CENTRIGUGUE_OFF, MineralCentrigugueOFFBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GEOFURNACE = register("geofurnace", GeoimmersionModBlocks.GEOFURNACE,
			GeofurnaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GEOFURNACEOFF = register("geofurnaceoff", GeoimmersionModBlocks.GEOFURNACEOFF,
			GeofurnaceoffBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
