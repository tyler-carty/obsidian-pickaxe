package net.obsidian.pickaxe.mod.registry;

import net.obsidian.pickaxe.mod.ObsidianPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item OBSIDIAN_PICKAXE = new Item(new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ObsidianPickaxe.MOD_ID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
    }
}
