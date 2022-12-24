
package net.mcreator.geoimmersion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.world.inventory.RockEncyclopedia3Menu;
import net.mcreator.geoimmersion.procedures.TravertineButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.SandstoneButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OpenRock2Procedure;
import net.mcreator.geoimmersion.procedures.MetasandstoneButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.MetalimestoneButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.LimestoneButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.EvaporiteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.BIFButtonClickedProcedure;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RockEncyclopedia3ButtonMessage {
	private final int buttonID, x, y, z;

	public RockEncyclopedia3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RockEncyclopedia3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RockEncyclopedia3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RockEncyclopedia3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RockEncyclopedia3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenRock2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			LimestoneButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SandstoneButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			MetalimestoneButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			MetasandstoneButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			TravertineButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			EvaporiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			BIFButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GeoimmersionMod.addNetworkMessage(RockEncyclopedia3ButtonMessage.class, RockEncyclopedia3ButtonMessage::buffer,
				RockEncyclopedia3ButtonMessage::new, RockEncyclopedia3ButtonMessage::handler);
	}
}
