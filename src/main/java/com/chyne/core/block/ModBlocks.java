package com.chyne.core.block;

import com.chyne.core.item.ItemModelProvider;
import com.chyne.core.item.ItemOreDict;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by chris on 2017-02-10.
 */
public class ModBlocks {

    public static BlockOre oreCopper;

    public static BlockCropCorn cropCorn;

    public static BlockPedestal pedestal;

    public static void init() {
        oreCopper = register(new BlockOre("oreCopper", "oreCopper"));
        cropCorn = register(new BlockCropCorn(), null);
        pedestal = register(new BlockPedestal());
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);

        if (itemBlock != null) {
            GameRegistry.register(itemBlock);

            if (block instanceof ItemModelProvider) {
                ((ItemModelProvider)block).registerItemModel(itemBlock);
            }

            if (block instanceof ItemOreDict) {
                ((ItemOreDict)block).initOreDict();
            }

            if (itemBlock instanceof ItemOreDict) {
                ((ItemOreDict)itemBlock).initOreDict();
            }
        }




        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
