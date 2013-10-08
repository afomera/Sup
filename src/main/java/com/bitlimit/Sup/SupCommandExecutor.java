package com.bitlimit.Sup;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SupCommandExecutor implements CommandExecutor {

    private Sup plugin;

    public SupCommandExecutor(Sup plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("sup")){ // If the player typed /kc then do the following...
            // do something...
            sender.sendMessage(ChatColor.GOLD + "Sup Brah!");
            return true;
        }
       return false;
    }

}
