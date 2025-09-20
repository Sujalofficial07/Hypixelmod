package com.skyblockmod.npcs;

import java.util.UUID;

public class ModNPCs {
    public static ShopNPC SHOPKEEPER;

    public static void registerNPCs() {
        SHOPKEEPER = new ShopNPC("Bob", "Welcome to my shop!");
        SHOPKEEPER.addItem("Healing Wand", 100);
        SHOPKEEPER.addItem("Grappling Hook", 250);
    }

    public static void testInteraction(UUID player) {
        SHOPKEEPER.buyItem(player, "Healing Wand");
    }
}
