package com.chyne.core.item;

import com.chyne.core.CoreMod;
import com.chyne.core.item.tool.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by chris on 2017-02-10.
 */
public class ModItems {

    public static ItemBase ingotCopper;

    public static ItemCornSeed cornSeed;
    public static ItemCorn corn;

    public static ItemSword copperSword;

    public static void init() {
        ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));

        cornSeed = register(new ItemCornSeed());
        corn = register(new ItemCorn());

        copperSword = register(new ItemSword(CoreMod.copperToolMaterial, "copperSword"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }

        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }

        return item;
    }
}
