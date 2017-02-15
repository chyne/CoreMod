package com.chyne.core;

import com.chyne.core.block.ModBlocks;
import com.chyne.core.client.ChyneCoreTab;
import com.chyne.core.item.ModItems;
import com.chyne.core.proxy.CommonProxy;
import com.chyne.core.recipe.ModRecipes;
import com.chyne.core.world.ModWorldGeneration;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = CoreMod.modId, name = CoreMod.name, version = CoreMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class CoreMod {

    public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER",
            2,
            500,
            6,
            2,
            14);

    public static final ChyneCoreTab creativeTab = new ChyneCoreTab();

    public static final String modId = "chyne";
    public static final String name = "Chyne Core";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static CoreMod instance;

    @SidedProxy(serverSide = "com.chyne.core.proxy.CommonProxy", clientSide = "com.chyne.core.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");

        ModBlocks.init();
        ModItems.init();

        GameRegistry.registerWorldGenerator(new ModWorldGeneration(), 3);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
