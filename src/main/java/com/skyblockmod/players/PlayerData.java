package com.skyblockmod.players;

import com.skyblockmod.economy.Coins;
import java.util.UUID;

public class PlayerData {
    private final UUID playerId;

    public PlayerData(UUID playerId) {
        this.playerId = playerId;
    }

    public int getCoins() {
        return Coins.getCoins(playerId);
    }

    public void addCoins(int amount) {
        Coins.addCoins(playerId, amount);
    }

    public boolean spendCoins(int amount) {
        return Coins.removeCoins(playerId, amount);
    }

    // Add more data like skills, pets, islands
}
