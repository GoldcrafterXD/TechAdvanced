package com.goldcrafterxd.techadvanced.item;

import com.goldcrafterxd.techadvanced.TechAdvanced;
import com.goldcrafterxd.techadvanced.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechAdvanced.MODID);

    //INGOTS

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    //INGOTS END
    //TOOLS
        //RUBY
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));
        //RUBY END
        //SAPPHIRE
    public static final RegistryObject<Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword",
            () -> new SwordItem(ModItemTier.SAPPHIRE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe",
            () -> new AxeItem(ModItemTier.SAPPHIRE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe",
            () -> new PickaxeItem(ModItemTier.SAPPHIRE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel",
            () -> new ShovelItem(ModItemTier.SAPPHIRE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe",
            () -> new HoeItem(ModItemTier.SAPPHIRE, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));
        //SAPPHIRE END
        //TITANIUM
    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModItemTier.TITANIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModItemTier.TITANIUM, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModItemTier.TITANIUM, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModItemTier.TITANIUM, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModItemTier.TITANIUM, 0, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));
        //TITANIUM END
    //TOOLS END
    //MISC

    public static final RegistryObject<Item> OIL_BUCKET = ITEMS.register("oil_bucket",
            () -> new BucketItem(() -> ModFluids.OIL_FLUID.get(),  new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.TECHADVANCED_TAB)));

    //MISC END



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
