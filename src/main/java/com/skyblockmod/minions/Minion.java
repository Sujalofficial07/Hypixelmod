package com.skyblockmod.minions;

import com.skyblockmod.players.PlayerData;

public class Minion {
    private final String type;
    private final int productionRate; // items per minute

    public Minion(String type, int productionRate) {
        this.type = type;
        this.productionRate = productionRate;
    }

    public void produce(PlayerData owner) {
        System.out.println(type + " minion produced " + productionRate + " items for player");
        // Add actual item collection logic here
    }
}
