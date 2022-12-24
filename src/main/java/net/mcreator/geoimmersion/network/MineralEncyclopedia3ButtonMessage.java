
package net.mcreator.geoimmersion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.geoimmersion.world.inventory.MineralEncyclopedia3Menu;
import net.mcreator.geoimmersion.procedures.WolframiteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.SphaleriteButtonClickedProcedure;
import net.mcreator.geoimmersion.procedures.OpenMineral2Procedure;
import net.mcreator.geoimmersion.procedures.GalenaButtonClickedProcedure;
import net.mcreator.geoimmersion.GeoimmersionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MineralEncyclopedia3ButtonMessage {
	private final int buttonID, x, y, z;

	public MineralEncyclopedia3ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public MineralEncyclopedia3ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(MineralEncyclopedia3ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(MineralEncyclopedia3ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = MineralEncyclopedia3Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			OpenMineral2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			WolframiteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SphaleriteButtonClickedProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			GalenaButtonClickedProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		GeoimmersionMod.addNetworkMessage(MineralEncyclopedia3ButtonMessage.class, MineralEncyclopedia3ButtonMessage::buffer,
				MineralEncyclopedia3ButtonMessage::new, MineralEncyclopedia3ButtonMessage::handler);
	}
}
