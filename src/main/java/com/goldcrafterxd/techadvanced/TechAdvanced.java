package com.goldcrafterxd.techadvanced;

import com.goldcrafterxd.techadvanced.block.ModBlocks;
import com.goldcrafterxd.techadvanced.fluid.ModFluids;
import com.goldcrafterxd.techadvanced.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TechAdvanced.MODID)
public class TechAdvanced
{
    public static final String MODID = "techadvanced";

    public TechAdvanced() {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModFluids.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }






}
