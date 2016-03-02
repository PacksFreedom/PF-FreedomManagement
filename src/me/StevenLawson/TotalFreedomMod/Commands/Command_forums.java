package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.ONLY_IN_GAME, blockHostConsole = true)
@CommandParameters(
		description = "Command to go to the forums", 
		usage = "/<command>",
		aliases = "ai")
public class Command_forums extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    	sender.sendMessage(ChatColor.BLUE + "The link to the forums is http://packsfreedom.boards.net/ just click that link or manually type it into your browser.");


    	return true;
}
}
