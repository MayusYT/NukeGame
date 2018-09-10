package main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Arena {

    public static GameState gameState = GameState.LOBBY; // default gamestate

    public static GameState getState() {
        return gameState;
    }

    public static void setState(GameState newState) {
        gameState = newState;
        Bukkit.broadcastMessage("Current State: " + Arena.getState().toString());
    }
}
