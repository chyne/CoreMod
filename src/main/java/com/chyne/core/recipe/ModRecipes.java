package com.chyne.core.recipe;

import com.chyne.core.block.ModBlocks;
import com.chyne.core.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by chris on 2017-02-10.
 */
public class ModRecipes {

    public static void init() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), ModItems.corn);

        GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_STEW), " R ", "CPM", " B ",
                'R', Items.COOKED_RABBIT,
                'C', ModItems.corn,
                'P', Items.BAKED_POTATO,
                'M', Blocks.BROWN_MUSHROOM,
                'B', Items.BOWL);

        GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);

        GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET,
                "I I", " I ",
                'I', "ingotCopper"));
    }

}
