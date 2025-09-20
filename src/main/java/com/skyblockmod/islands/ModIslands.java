package com.skyblockmod.islands;

import java.util.HashMap;
import java.util.UUID;

public class ModIslands {
    private static final HashMap<UUID, Island> islands = new HashMap<>();

    public static void initIslands() {
        // Example: initialize dummy islands
        Island hub = new Island(UUID.randomUUID(), "Hub");
        islands.put(hub.getOwner(), hub);
    }

    public static Island getIsland(UUID owner) { return islands.get(owner); }
}
