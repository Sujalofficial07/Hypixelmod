package com.skyblockmod.economy;

import java.util.UUID;
import java.util.HashMap;

public class Coins {
    private static final HashMap<UUID, Integer> balances = new HashMap<>();

    public static int getCoins(UUID player) {
        return balances.getOrDefault(player, 0);
    }

    public static void addCoins(UUID player, int amount) {
        balances.put(player, getCoins(player) + amount);
    }

    public static boolean removeCoins(UUID player, int amount) {
        int current = getCoins(player);
        if (current >= amount) {
            balances.put(player, current - amount);
            return true;
        }
        return false;
    }
}
