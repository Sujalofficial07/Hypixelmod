package com.skyblockmod.npcs;

import com.skyblockmod.economy.Coins;
import java.util.HashMap;
import java.util.UUID;

public class ShopNPC extends NPC {
    private final HashMap<String, Integer> shopItems = new HashMap<>();

    public ShopNPC(String name, String dialog) {
        super(name, dialog);
    }

    public void addItem(String itemName, int price) {
        shopItems.put(itemName, price);
    }

    public void buyItem(UUID player, String itemName) {
        if (!shopItems.containsKey(itemName)) {
            System.out.println("Item not found in shop!");
            return;
        }
        int price = shopItems.get(itemName);
        if (Coins.removeCoins(player, price)) {
            System.out.println("Player bought " + itemName);
        } else {
            System.out.println("Not enough coins!");
        }
    }
}
