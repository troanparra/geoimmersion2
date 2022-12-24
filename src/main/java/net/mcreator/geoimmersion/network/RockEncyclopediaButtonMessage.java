
package net.mcreator.geoimmersion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.world.inventory.RockEncyclopediaMenu;
import net.mcreator.geoimmersion.procedures.RioliteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.PeridotiteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OpenRock2Procedure;
import net.mcreator.geoimmersion.procedures.KimberliteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.GraniteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.GobackButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.GabbroButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.DioriteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.DiabaseButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.BasaltButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.AndesiteButtonClickedProcedure;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RockEncyclopediaButtonMessage {
	private final int buttonID, x, y, z;

	public RockEncyclopediaButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public RockEncyclopediaButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(RockEncyclopediaButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(RockEncyclopediaButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = RockEncyclopediaMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			GraniteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			GobackButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			DioriteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			AndesiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			BasaltButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			RioliteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			GabbroButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 7) {

			PeridotiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 8) {

			KimberliteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 9) {

			OpenRock2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 10) {

			DiabaseButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GeoimmersionMod.addNetworkMessage(RockEncyclopediaButtonMessage.class, RockEncyclopediaButtonMessage::buffer,
				RockEncyclopediaButtonMessage::new, RockEncyclopediaButtonMessage::handler);
	}
}
