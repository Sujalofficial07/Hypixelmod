package com.skyblockmod.minions;

import com.skyblockmod.players.PlayerData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class MinionManager {
    private static final HashMap<UUID, List<Minion>> playerMinions = new HashMap<>();

    public static void addMinion(UUID player, Minion minion) {
        playerMinions.computeIfAbsent(player, k -> new ArrayList<>()).add(minion);
    }

    public static void produceAll(UUID player, PlayerData owner) {
        List<Minion> minions = playerMinions.get(player);
        if (minions == null) return;
        for (Minion m : minions) {
            m.produce(owner);
        }
    }
}
