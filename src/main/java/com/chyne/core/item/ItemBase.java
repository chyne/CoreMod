package com.chyne.core.item;

import com.chyne.core.CoreMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by chris on 2017-02-10.
 */
public class ItemBase extends Item implements ItemModelProvider{

    protected String name;

    public ItemBase(String name) {
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
