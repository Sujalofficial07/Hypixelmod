package com.skyblockmod.islands;

import java.util.UUID;

public class Island {
    private final UUID owner;
    private String name;
    private int level;

    public Island(UUID owner, String name) {
        this.owner = owner;
        this.name = name;
        this.level = 1;
    }

    public UUID getOwner() { return owner; }
    public String getName() { return name; }
    public int getLevel() { return level; }

    public void upgrade() {
        level++;
    }
}
