
package net.mcreator.geoimmersion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.world.inventory.MineralEncyclopediaMenu;
import net.mcreator.geoimmersion.procedures.TourmalineButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.SulfurButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.RutileButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.QuartzButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OpenMineral2Procedure;
import net.mcreator.geoimmersion.procedures.OlivineButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.HornblendeButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.GobackButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.GarnetButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.FeldsparButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.BiotiteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.ApatiteButtonClickedProcedure;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineralEncyclopediaButtonMessage {
	private final int buttonID, x, y, z;

	public MineralEncyclopediaButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MineralEncyclopediaButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MineralEncyclopediaButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MineralEncyclopediaButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = MineralEncyclopediaMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GobackButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenMineral2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			QuartzButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			FeldsparButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			BiotiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			GarnetButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			OlivineButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			HornblendeButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			SulfurButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			RutileButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			TourmalineButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			ApatiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GeoimmersionMod.addNetworkMessage(MineralEncyclopediaButtonMessage.class, MineralEncyclopediaButtonMessage::buffer,
				MineralEncyclopediaButtonMessage::new, MineralEncyclopediaButtonMessage::handler);
	}
}
