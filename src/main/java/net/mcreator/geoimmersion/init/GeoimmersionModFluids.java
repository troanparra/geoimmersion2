
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.geoimmersion.fluid.VolcanoashFluid;
import net.mcreator.geoimmersion.fluid.OilFluid;
import net.mcreator.geoimmersion.fluid.BasalticLavaFluid;
import net.mcreator.geoimmersion.GeoimmersionMod;

public class GeoimmersionModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, GeoimmersionMod.MODID);
	public static final RegistryObject<Fluid> OIL = REGISTRY.register("oil", () -> new OilFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_OIL = REGISTRY.register("flowing_oil", () -> new OilFluid.Flowing());
	public static final RegistryObject<Fluid> BASALTIC_LAVA = REGISTRY.register("basaltic_lava", () -> new BasalticLavaFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_BASALTIC_LAVA = REGISTRY.register("flowing_basaltic_lava",
			() -> new BasalticLavaFluid.Flowing());
	public static final RegistryObject<Fluid> VOLCANOASH = REGISTRY.register("volcanoash", () -> new VolcanoashFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_VOLCANOASH = REGISTRY.register("flowing_volcanoash", () -> new VolcanoashFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(OIL.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_OIL.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BASALTIC_LAVA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_BASALTIC_LAVA.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(VOLCANOASH.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_VOLCANOASH.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
