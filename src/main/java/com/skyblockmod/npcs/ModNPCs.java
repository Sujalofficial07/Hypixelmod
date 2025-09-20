package com.skyblockmod.npcs;

public class ModNPCs {
    public static NPC SHOPKEEPER;

    public static void registerNPCs() {
        SHOPKEEPER = new NPC("Bob", "Welcome to my shop!");
    }
}
