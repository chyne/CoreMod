package com.chyne.core.block;

import com.chyne.core.CoreMod;
import com.chyne.core.item.ItemOreDict;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by chris on 2017-02-10.
 */
public class BlockOre extends BlockBase implements ItemOreDict {

    private String oreName;

    public BlockOre(String name, String oreName) {
        super(Material.ROCK, name);

        this.oreName = oreName;

        setHardness(3f);
        setResistance(5f);

        setCreativeTab(CoreMod.creativeTab);
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }
}
