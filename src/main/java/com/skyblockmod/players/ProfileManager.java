package com.skyblockmod.players;

import java.util.HashMap;
import java.util.UUID;

public class ProfileManager {
    private static final HashMap<UUID, PlayerData> profiles = new HashMap<>();

    public static PlayerData getProfile(UUID playerId) {
        return profiles.computeIfAbsent(playerId, PlayerData::new);
    }
}
