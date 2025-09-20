package com.skyblockmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SkyblockItem extends Item {
    private final String abilityDescription;

    public SkyblockItem(Settings settings, String abilityDescription) {
        super(settings);
        this.abilityDescription = abilityDescription;
    }

    public String getAbilityDescription() {
        return abilityDescription;
    }
}
