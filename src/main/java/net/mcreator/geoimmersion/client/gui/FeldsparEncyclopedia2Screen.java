
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

import net.mcreator.geoimmersion.world.inventory.FeldsparEncyclopedia2Menu;
import net.mcreator.geoimmersion.network.FeldsparEncyclopedia2ButtonMessage;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FeldsparEncyclopedia2Screen extends AbstractContainerScreen<FeldsparEncyclopedia2Menu> {
	private final static HashMap<String, Object> guistate = FeldsparEncyclopedia2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FeldsparEncyclopedia2Screen(FeldsparEncyclopedia2Menu container, Inventory inventory, Component text) {
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

	private static final ResourceLocation texture = new ResourceLocation("geoimmersion:textures/screens/feldspar_encyclopedia_2.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/feldspato-6.400p.png"));
		this.blit(ms, this.leftPos + 32, this.topPos + 21, 0, 0, 200, 133, 200, 133);

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
		this.font.draw(poseStack, "Image taken from \"didatico.igc.usp.br\"", 32, 166, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + 12, this.topPos + 156, 9, 20, new TextComponent("."), e -> {
			if (true) {
				GeoimmersionMod.PACKET_HANDLER.sendToServer(new FeldsparEncyclopedia2ButtonMessage(0, x, y, z));
				FeldsparEncyclopedia2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}