
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

import net.mcreator.geoimmersion.world.inventory.RockEncyclopedia3Menu;
import net.mcreator.geoimmersion.network.RockEncyclopedia3ButtonMessage;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RockEncyclopedia3Screen extends AbstractContainerScreen<RockEncyclopedia3Menu> {
	private final static HashMap<String, Object> guistate = RockEncyclopedia3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RockEncyclopedia3Screen(RockEncyclopedia3Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("geoimmersion:textures/screens/rock_encyclopedia_3.png");

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
		this.font.draw(poseStack, "Geoimmersion Encyclopedia: Rocks", 17, 14, -12829636);
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
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(0, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 36, this.topPos + 52, 72, 20, new TextComponent("Limestone"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(1, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 36, this.topPos + 81, 72, 20, new TextComponent("Sandstone"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(2, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 131, this.topPos + 52, 93, 20, new TextComponent("Metalimestone"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(3, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 131, this.topPos + 81, 93, 20, new TextComponent("Metasandstone"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(4, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 141, this.topPos + 109, 77, 20, new TextComponent("Travertine"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(5, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 36, this.topPos + 109, 72, 20, new TextComponent("Evaporite"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(6, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 65, this.topPos + 138, 134, 20, new TextComponent("Banded Iron Formation"), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new RockEncyclopedia3ButtonMessage(7, x, y, z));
				RockEncyclopedia3ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
	}
}
