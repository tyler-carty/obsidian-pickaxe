package net.obsidian.pickaxe.mod.item;

import net.obsidian.pickaxe.mod.ObsidianPickaxe;
import net.obsidian.pickaxe.mod.item.custom.ModPickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new ModPickaxeItem(ModToolMaterial.OBSIDIAN, 2, 2, new Item.Settings().group(ItemGroup.TOOLS)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ObsidianPickaxe.MOD_ID, name), item);
    }  
}
