package net.woogie.extraDimensions.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.woogie.extraDimensions.ExtraDimensionsUtil;

public class CommandXdCreate extends CommandBase {

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender agent) {

		if (MinecraftServer.getServer().isSinglePlayer()
				|| MinecraftServer
						.getServer()
						.getConfigurationManager()
						.func_152596_g(
								getPlayer(agent, agent.getCommandSenderName())
										.getGameProfile())) {
			return true;
		}
		return false;
	}

	@Override
	public String getCommandName() {
		return "xdcreate";
	}

	@Override
	public String getCommandUsage(ICommandSender agent) {
		return "/" + getCommandName()
				+ " <Dimension Name> <World Type> <Biomes>";
	}

	@Override
	public int getRequiredPermissionLevel() {
		return MinecraftServer.getServer().getOpPermissionLevel();
	}

	@Override
	public void processCommand(ICommandSender agent, String[] args) {

		if (args.length > 0 && args.length < 4) {

			String dimensionName = args[0];
			String worldType = "xdMultiBiome";
			String allowedBiomes = "*";

			if (args.length > 1) {
				worldType = args[1];
			}

			if (args.length > 2) {
				allowedBiomes = args[2];
			}

			agent.addChatMessage(new ChatComponentText(ExtraDimensionsUtil
					.createDimension(dimensionName, worldType, allowedBiomes)));
		} else {
			throw new WrongUsageException("Usage: " + getCommandUsage(agent),
					new Object[0]);
		}
	}
}