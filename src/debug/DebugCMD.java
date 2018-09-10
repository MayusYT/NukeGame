package debug;

import main.Arena;
import main.GameState;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DebugCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Player p = (Player) sender;

        if(args.length == 2) {
            if (args[0].equalsIgnoreCase("setstate")) {
                if(args[1].equalsIgnoreCase("lobby")) {

                    Arena.setState(GameState.LOBBY);

                } else if (args[1].equalsIgnoreCase("game")) {
                    Arena.setState(GameState.GAME);

                } else if (args[1].equalsIgnoreCase("battle")) {
                    Arena.setState(GameState.BATTLE);

                } else if (args[1].equalsIgnoreCase("postgame")) {
                    Arena.setState(GameState.POSTGAME);
                }
            }
        } else if(args.length == 1) {
            if(args[0].equalsIgnoreCase("getstate")) {
                p.sendMessage("Current State: " + Arena.getState().toString());
            }
        }



        return true;
    }
}
