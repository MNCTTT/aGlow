package org.bitpixls.aglow;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class GlowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("aglow.use")){
            if (args.length==0) {
                if (player.isGlowing()) {
                    player.setGlowing(false);
                    player.sendMessage("§cGlowing is now off!");
                } else if (!player.isGlowing()) {
                    player.setGlowing(true);
                    player.sendMessage("§aGlowing is now on!");
                }
            }
            else if (args.length==1){
                if (args.length == 1 && Objects.equals(args[0], "help")) {
                    player.sendMessage("§aaGlow commands:");
                    player.sendMessage("§6/glow §a- §btoggles glow on/off");
                    player.sendMessage("§cAliases: §a/aglow");
                    player.sendMessage("§6/glow §chelp §a- §b this menu, also works with /aglow");
                }
            }
        } else if (!player.hasPermission("aglow.use")){
            player.sendMessage("§cYou don't have permission to use this!");
        }
        return false;
    }
}
