package com.chyne.core.client;

import akka.dispatch.sysmsg.Create;
import com.chyne.core.CoreMod;
import com.chyne.core.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by chris on 2017-02-10.
 */
public class ChyneCoreTab extends CreativeTabs {

    public ChyneCoreTab() {
        super(CoreMod.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.ingotCopper;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}
