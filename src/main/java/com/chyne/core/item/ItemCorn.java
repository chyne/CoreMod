package com.chyne.core.item;

import com.chyne.core.CoreMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by chris on 2017-02-10.
 */
public class ItemCorn extends ItemFood implements ItemModelProvider, ItemOreDict {

    public ItemCorn() {
        super(3, 0.6f,false);

        setUnlocalizedName("corn");
        setRegistryName("corn");

        setCreativeTab(CoreMod.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        CoreMod.proxy.registerItemRenderer(this, 0,"corn");
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre("cropCorn", this);
    }
}
