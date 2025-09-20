package com.skyblockmod;

import com.skyblockmod.config.Keybinds;
import com.skyblockmod.gui.SkyblockMenuScreen;
import com.skyblockmod.items.ModItems;
import com.skyblockmod.npcs.ModNPCs;
import com.skyblockmod.islands.ModIslands;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SkyblockMod implements ModInitializer, ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger("SkyblockMod");

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Skyblock Mod");
        ModItems.registerItems();
        ModNPCs.registerNPCs();
        ModIslands.initIslands();
    }

    @Override
    public void onInitializeClient() {
        Keybinds.register();
        SkyblockMenuScreen.registerScreens();

    }
    @Override
    public void onInitialize() {
    LOGGER.info("Initializing Skyblock Mod");
    ModItems.registerItems();
    ModNPCs.registerNPCs();
    ModIslands.initIslands();

    // Example: Give coins and buy an item
    UUID testPlayer = UUID.randomUUID();
    ProfileManager.getProfile(testPlayer).addCoins(200);
    ModNPCs.testInteraction(testPlayer); // Should successfully buy Healing Wand

    // Add a minion
    MinionManager.addMinion(testPlayer, new Minion("Mining", 5));
    MinionManager.produceAll(testPlayer, ProfileManager.getProfile(testPlayer));
}
    
}
