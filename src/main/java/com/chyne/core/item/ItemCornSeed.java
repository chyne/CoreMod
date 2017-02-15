package com.chyne.core.item;

import com.chyne.core.CoreMod;
import com.chyne.core.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by chris on 2017-02-10.
 */
public class ItemCornSeed extends ItemSeeds implements ItemModelProvider {

    public ItemCornSeed() {
        super(ModBlocks.cropCorn, Blocks.FARMLAND);
        setUnlocalizedName("cornSeed");
        setRegistryName("cornSeed");

        setCreativeTab(CoreMod.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        CoreMod.proxy.registerItemRenderer(item, 0, "cornSeed");
    }
}
