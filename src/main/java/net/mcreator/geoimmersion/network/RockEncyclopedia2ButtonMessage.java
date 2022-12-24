
package net.mcreator.geoimmersion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.world.inventory.RockEncyclopedia2Menu;
import net.mcreator.geoimmersion.procedures.SlateButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.SkarnButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.SchistButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.RocksButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.QuartziteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OpenRock3Procedure;
import net.mcreator.geoimmersion.procedures.MarbleButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.GneissButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.BauxiteButtonClickedProcedure;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RockEncyclopedia2ButtonMessage {
	private final int buttonID, x, y, z;

	public RockEncyclopedia2ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RockEncyclopedia2ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RockEncyclopedia2ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RockEncyclopedia2ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RockEncyclopedia2Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			RocksButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			OpenRock3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			MarbleButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GneissButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			QuartziteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			SchistButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			SlateButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			SkarnButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			BauxiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GeoimmersionMod.addNetworkMessage(RockEncyclopedia2ButtonMessage.class, RockEncyclopedia2ButtonMessage::buffer,
				RockEncyclopedia2ButtonMessage::new, RockEncyclopedia2ButtonMessage::handler);
	}
}
