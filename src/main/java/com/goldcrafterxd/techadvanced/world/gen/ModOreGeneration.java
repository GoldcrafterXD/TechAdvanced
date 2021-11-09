package com.goldcrafterxd.techadvanced.world.gen;


import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.BiasedToBottomHeight;
import net.minecraft.world.level.levelgen.placement.ConfiguredDecorator;
import net.minecraft.world.level.levelgen.placement.RangeDecorator;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreTypeOverworld ore : OreTypeOverworld.values()) {
            OreConfiguration oreConfig = new OreConfiguration(
                    OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,
                    ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

            // bottomOffset -> minimum height for the ore
            // maximum -> minHeight + maximum = top level (the vertical expansion of the ore, it grows x levels from bottomOffset)
            // topOffset -> subtracted from the maximum to give actual top level
            // ore effectively exists from bottomOffset to (bottomOffset + maximum - topOffset)
            ConfiguredDecorator<RangeDecoratorConfiguration> configuredDecorator = RangeDecorator.RANGE.configured(
                    new RangeDecoratorConfiguration(BiasedToBottomHeight.of(VerticalAnchor.bottom(), VerticalAnchor.belowTop(8), 8)));

            ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreConfig, configuredDecorator);

            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, oreFeature);
            event.getGeneration().addFeature(GenerationStep.Decoration.RAW_GENERATION, oreFeature);
        }
        for (OreTypeNether ore : OreTypeNether.values()) {
            OreConfiguration oreConfig = new OreConfiguration(
                    OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES,
                    ore.getBlock().get().defaultBlockState(), ore.getMaxVeinSize());

            // bottomOffset -> minimum height for the ore
            // maximum -> minHeight + maximum = top level (the vertical expansion of the ore, it grows x levels from bottomOffset)
            // topOffset -> subtracted from the maximum to give actual top level
            // ore effectively exists from bottomOffset to (bottomOffset + maximum - topOffset)
            ConfiguredDecorator<RangeDecoratorConfiguration> configuredDecorator = RangeDecorator.RANGE.configured(
                    new RangeDecoratorConfiguration(BiasedToBottomHeight.of(VerticalAnchor.bottom(), VerticalAnchor.belowTop(8), 8)));

            ConfiguredFeature<?, ?> oreFeature = registerOreFeature(ore, oreConfig, configuredDecorator);

            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, oreFeature);
            event.getGeneration().addFeature(GenerationStep.Decoration.RAW_GENERATION, oreFeature);
        }
    }

    private static ConfiguredFeature<?, ?> registerOreFeature(OreTypeOverworld ore, OreConfiguration oreConfig, ConfiguredDecorator configuredDecorator) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(),
                Feature.ORE.configured(oreConfig).decorated(configuredDecorator)
                        .squared().count(ore.getMaxVeinSize()));
    }
    private static ConfiguredFeature<?, ?> registerOreFeature(OreTypeNether ore, OreConfiguration oreConfig, ConfiguredDecorator configuredDecorator) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(),
                Feature.ORE.configured(oreConfig).decorated(configuredDecorator)
                        .squared().count(ore.getMaxVeinSize()));
    }
}







    /*
    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
            generateOre(event.getGeneration(), OreConfiguration.Predicates.STONE_ORE_REPLACEABLES,
                    ModBlocks.TITANIUM_ORE.get().defaultBlockState(), 10, 15, 60, 30);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state,
                                    int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize))
                        .range(new RangeDecoratorConfiguration(TrapezoidHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(192), 96))));


    }

     */

