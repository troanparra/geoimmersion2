
package net.mcreator.geoimmersion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.world.inventory.MineralEncyclopedia2Menu;
import net.mcreator.geoimmersion.procedures.VanadiniteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.TorbeniteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.SpodumeneButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.PyriteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OsmiumTetroxiteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OpenMineral3Procedure;
import net.mcreator.geoimmersion.procedures.MineralButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.MagnetiteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.FluoriteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.CinnaberButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.CasseteriteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.CalciteButtonClickedProcedure;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineralEncyclopedia2ButtonMessage {
	private final int buttonID, x, y, z;

	public MineralEncyclopedia2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MineralEncyclopedia2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MineralEncyclopedia2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MineralEncyclopedia2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MineralEncyclopedia2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			MineralButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			CasseteriteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			VanadiniteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SpodumeneButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			MagnetiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			CinnaberButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			CalciteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			OsmiumTetroxiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			PyriteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			FluoriteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			TorbeniteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 11) {

			OpenMineral3Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GeoimmersionMod.addNetworkMessage(MineralEncyclopedia2ButtonMessage.class, MineralEncyclopedia2ButtonMessage::buffer,
				MineralEncyclopedia2ButtonMessage::new, MineralEncyclopedia2ButtonMessage::handler);
	}
}
