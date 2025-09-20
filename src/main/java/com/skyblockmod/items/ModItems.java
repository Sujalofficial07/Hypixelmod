package com.skyblockmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.skyblockmod.SkyblockMod;

public class ModItems {
    public static Item HEALING_WAND;

    public static void registerItems() {
        HEALING_WAND = new SkyblockItem(new Item.Settings().group(ItemGroup.MISC), "Heals player");
        Registry.register(Registry.ITEM, new Identifier(SkyblockMod.MOD_ID, "healing_wand"), HEALING_WAND);
    }
}
