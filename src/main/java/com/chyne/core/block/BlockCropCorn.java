package com.chyne.core.block;

import com.chyne.core.CoreMod;
import com.chyne.core.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by chris on 2017-02-10.
 */
public class BlockCropCorn extends BlockCrops {

    public BlockCropCorn() {
        setUnlocalizedName("cropCorn");
        setRegistryName("cropCorn");

        setCreativeTab(CoreMod.creativeTab);
    }

    @Override
    protected Item getSeed() {
        return ModItems.cornSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.corn;
    }
}
