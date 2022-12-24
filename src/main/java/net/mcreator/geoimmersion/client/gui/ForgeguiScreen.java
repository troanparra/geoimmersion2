
package net.mcreator.geoimmersion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.geoimmersion.world.inventory.ForgeguiMenu;
import net.mcreator.geoimmersion.procedures.Loadingbar9Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar8Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar7Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar6Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar5Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar4Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar3Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar2Procedure;
import net.mcreator.geoimmersion.procedures.Loadingbar10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ForgeguiScreen extends AbstractContainerScreen<ForgeguiMenu> {
	private final static HashMap<String, Object> guistate = ForgeguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ForgeguiScreen(ForgeguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("geoimmersion:textures/screens/forgegui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_empty.png"));
		this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);

		if (Loadingbar2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_0.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_1.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_2.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_3.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_4.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_5.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_6.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_7.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_8.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
		if (Loadingbar10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("geoimmersion:textures/screens/progress_bar_filled_9.png"));
			this.blit(ms, this.leftPos + 60, this.topPos + 43, 0, 0, 54, 10, 54, 10);
		}
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
		this.font.draw(poseStack, "" + (entity.getPersistentData().getDouble("fuel")) + "", 42, 52, -12829636);
		this.font.draw(poseStack, "" + (entity.getPersistentData().getDouble("smelting")) + "", 42, 16, -12829636);
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
	}
}
