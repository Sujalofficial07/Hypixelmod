package com.skyblockmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SkyblockMod implements ModInitializer, ClientModInitializer {

    public static final String MOD_ID = "skyblockmod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Skyblock Mod Initialized!");
        ModItems.registerItems();
        ModNPCs.registerNPCs();
        ModIslands.initIslands();
    }

    @Override
    public void onInitializeClient() {
        Keybinds.register();
        SkyblockMenuScreen.registerScreens();
    }
}
