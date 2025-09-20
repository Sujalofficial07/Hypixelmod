package com.skyblockmod.items;

import net.minecraft.item.Item;

public class SkyblockItem extends Item {
    private final String ability;

    public SkyblockItem(Settings settings, String ability) {
        super(settings);
        this.ability = ability;
    }

    public String getAbility() { return ability; }
}
