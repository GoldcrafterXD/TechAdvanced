package com.goldcrafterxd.techadvanced.block;

import com.goldcrafterxd.techadvanced.TechAdvanced;
import com.goldcrafterxd.techadvanced.item.ModCreativeModeTab;
import com.goldcrafterxd.techadvanced.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TechAdvanced.MODID);


    // Elemental Ores and Blocks
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> COBALT_ORE = registerBlock("cobalt_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> COBALT_BLOCK = registerBlock("cobalt_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(6f).destroyTime(2f)));

    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));
    // Elemental Ores and Blocks End

    // Tanks
    public static final RegistryObject<Block> ARGON_TANK = registerBlock("argon_tank", () ->
            new TankBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> OXYGEN_TANK = registerBlock("oxygen_tank", () ->
            new TankBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> NITROGEN_TANK = registerBlock("nitrogen_tank", () ->
            new TankBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> EMPTY_TANK = registerBlock("empty_tank", () ->
            new TankBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> HELIUM_TANK = registerBlock("helium_tank", () ->
            new TankBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));
    //Tanks End

    //Machines
    public static final RegistryObject<Block> COMPRESSOR = registerBlock("compressor", () ->
            new MachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> PULVERIZER = registerBlock("pulverizer", () ->
            new MachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> OVEN_E = registerBlock("oven_e", () ->
            new MachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> PULVERIZER_E = registerBlock("pulverizer_e", () ->
            new MachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    public static final RegistryObject<Block> COMPRESSOR_E = registerBlock("compressor_e", () ->
            new MachineBlock(BlockBehaviour.Properties.of(Material.METAL).strength(12f).destroyTime(2f)));

    //Machines End
    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.TECHADVANCED_TAB)));
    }

    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
