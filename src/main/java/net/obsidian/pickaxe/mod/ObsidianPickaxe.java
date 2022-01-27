package net.obsidian.pickaxe.mod;

import net.fabricmc.api.ModInitializer;
import net.obsidian.pickaxe.mod.registry.ModItems;

public class ObsidianPickaxe implements ModInitializer{

    public static final String MOD_ID = "obsidianpickaxe";

    @Override
    public void onInitialize() {
        // Loads Mod Items
        ModItems.registerItems();
    }
    
}
