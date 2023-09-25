package org.bitpixls.aglow;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GlowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("aglow.use")){
            if (player.isGlowing()) {
                player.setGlowing(false);
                player.sendMessage("§cGlowing is now off!");
            } else if (!player.isGlowing()){
                player.setGlowing(true);
                player.sendMessage("§aGlowing is now on!");
            }
        } else if (!player.hasPermission("aglow.use")){
            player.sendMessage("§cYou don't have permission to use this!");
        }
        return false;
    }
}
