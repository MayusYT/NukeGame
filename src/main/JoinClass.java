package main;

import Lobby.GameStart;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinClass implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player p = e.getPlayer();
        if(Arena.getState() == GameState.LOBBY && p.hasPermission("Nuke.StartGame")) {
            ItemStack startDia = new ItemStack(Material.DIAMOND);
            ItemMeta startMeta = startDia.getItemMeta();
            startMeta.setDisplayName("§aSpiel starten!");
            startDia.setItemMeta(startMeta);
            p.getInventory().addItem(startDia);
        }

    }


}
