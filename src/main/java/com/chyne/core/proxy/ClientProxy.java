package com.chyne.core.proxy;

import com.chyne.core.CoreMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by chris on 2017-02-10.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(CoreMod.modId + ":" + id, "inventory"));
    }
}
