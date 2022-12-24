
package net.mcreator.geoimmersion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.geoimmersion.world.inventory.MineralEncyclopedia2Menu;
import net.mcreator.geoimmersion.network.MineralEncyclopedia2ButtonMessage;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class MineralEncyclopedia2Screen extends AbstractContainerScreen<MineralEncyclopedia2Menu> {
	private final static HashMap<String, Object> guistate = MineralEncyclopedia2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public MineralEncyclopedia2Screen(MineralEncyclopedia2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 270;
		this.imageHeight = 190;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("geoimmersion:textures/screens/mineral_encyclopedia_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Geoimmersion Encyclopedia: Minerals", 17, 14, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 17, this.topPos + 157, 9, 20, new TextComponent("."), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(0, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 93, this.topPos + 81, 82, 20, new TextComponent("Casseterite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(1, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 93, this.topPos + 52, 77, 20, new TextComponent("Vanadinite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(2, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 179, this.topPos + 109, 72, 20, new TextComponent("Spodumene"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(3, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 17, this.topPos + 109, 72, 20, new TextComponent("Magnetite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(4, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 17, this.topPos + 52, 67, 20, new TextComponent("Cinnaber"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(5, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 103, this.topPos + 109, 61, 20, new TextComponent("Calcite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(6, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 74, this.topPos + 138, 108, 20, new TextComponent("Osmium Tetroxide"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(7, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 188, this.topPos + 81, 56, 20, new TextComponent("Pyrite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(8, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 17, this.topPos + 81, 67, 20, new TextComponent("Fluorite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(9, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 179, this.topPos + 52, 77, 20, new TextComponent("Torbernite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(10, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 245, this.topPos + 157, 9, 20, new TextComponent("."), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new MineralEncyclopedia2ButtonMessage(11, x, y, z));
				MineralEncyclopedia2ButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
	}
}
