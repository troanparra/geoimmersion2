
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.geoimmersion.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.geoimmersion.network.GeoimmersionEncyclopediaOpenMessage;
import net.mcreator.geoimmersion.GeoimmersionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GeoimmersionModKeyMappings {
	public static final KeyMapping GEOIMMERSION_ENCYCLOPEDIA_OPEN = new KeyMapping("key.geoimmersion.geoimmersion_encyclopedia_open", GLFW.GLFW_KEY_Y,
			"key.categories.ui");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(GEOIMMERSION_ENCYCLOPEDIA_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == GEOIMMERSION_ENCYCLOPEDIA_OPEN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						GeoimmersionMod.PACKET_HANDLER.sendToServer(new GeoimmersionEncyclopediaOpenMessage(0, 0));
						GeoimmersionEncyclopediaOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
