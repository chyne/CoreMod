package com.chyne.core.item.tool;

import com.chyne.core.CoreMod;
import com.chyne.core.item.ItemModelProvider;
import net.minecraft.item.Item;

/**
 * Created by chris on 2017-02-10.
 */
public class ItemSword extends net.minecraft.item.ItemSword implements ItemModelProvider {

    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CoreMod.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        CoreMod.proxy.registerItemRenderer(this, 0, name);
    }
}
