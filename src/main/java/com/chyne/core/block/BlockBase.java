package com.chyne.core.block;

import com.chyne.core.CoreMod;
import com.chyne.core.item.ItemModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by chris on 2017-02-10.
 */
public class BlockBase extends Block implements ItemModelProvider{

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CoreMod.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        CoreMod.proxy.registerItemRenderer(item, 0, name);
    }
}
