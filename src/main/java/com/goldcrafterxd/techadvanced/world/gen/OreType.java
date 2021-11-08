package com.goldcrafterxd.techadvanced.world.gen;

import com.goldcrafterxd.techadvanced.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    TITANIUM(Lazy.of(ModBlocks.TITANIUM_ORE), 8, 25, 50),
    COBALT(Lazy.of(ModBlocks.COBALT_ORE), 8, 25, 50),
    RUBY(Lazy.of(ModBlocks.RUBY_ORE), 8, 25, 50),
    SAPPHIRE(Lazy.of(ModBlocks.SAPPHIRE_ORE), 8, 25, 50),
    TIN(Lazy.of(ModBlocks.TIN_ORE), 8, 25, 50),
    SILVER(Lazy.of(ModBlocks.SILVER_ORE), 8, 25, 50),
    URANIUM(Lazy.of(ModBlocks.URANIUM_ORE), 8, 25, 50);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
