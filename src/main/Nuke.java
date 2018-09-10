package main;

import Lobby.GameStart;
import debug.DebugCMD;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Nuke extends JavaPlugin {
    public static String prefix = ChatColor.YELLOW + "[NUKE] > " + ChatColor.RESET;
    @Override
    public void onEnable() {
        ConsoleCommandSender console = this.getServer().getConsoleSender();
        console.sendMessage("########################################");
        console.sendMessage("#                                       ");
        console.sendMessage(ChatColor.YELLOW + "NUKE" + ChatColor.DARK_GREEN + " gestartet! (v.1.0)");
        console.sendMessage("#                                       ");
        console.sendMessage("########################################");

        init();
    }

    public void init() {
        Bukkit.getPluginManager().registerEvents(new GameStart(), this);
        Bukkit.getPluginManager().registerEvents(new JoinClass(), this);


        getCommand("debug").setExecutor(new DebugCMD());
    }


}
