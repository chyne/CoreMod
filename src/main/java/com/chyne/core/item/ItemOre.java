package com.chyne.core.item;

import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by chris on 2017-02-10.
 */
public class ItemOre extends ItemBase implements ItemOreDict {

    private String oreName;

    public ItemOre(String name, String oreName) {
        super(name);

        this.oreName = oreName;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
