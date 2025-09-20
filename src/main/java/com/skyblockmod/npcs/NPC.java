package com.skyblockmod.npcs;

public class NPC {
    private final String name;
    private final String dialog;

    public NPC(String name, String dialog) {
        this.name = name;
        this.dialog = dialog;
    }

    public void interact() {
        System.out.println(name + " says: " + dialog);
    }
}
