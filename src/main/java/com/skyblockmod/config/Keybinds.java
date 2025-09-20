package com.skyblockmod.config;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class Keybinds {
    public static KeyBinding SKYBLOCK_MENU;

    public static void register() {
        SKYBLOCK_MENU = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.skyblockmod.menu",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                "key.categories.skyblock"
        ));
    }
}
