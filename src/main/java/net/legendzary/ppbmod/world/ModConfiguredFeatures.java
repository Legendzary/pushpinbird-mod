package net.legendzary.ppbmod.world;

import net.legendzary.ppbmod.PushpinbirdMod;
import net.legendzary.ppbmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PUSHPIBALD_SMALL = registerKey("ore_pushpibald_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PUSHPIBALD_MEDIUM = registerKey("ore_pushpibald_medium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PUSHPIBALD_LARGE = registerKey("ore_pushpibald_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PUSHPIBALD_BURIED = registerKey("ore_pushpibald_buried");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldpushpiBALDOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PUSHPIBALD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.PUSHPIBALD_DEEPSLATE_ORE.getDefaultState()));

        register(context, ORE_PUSHPIBALD_SMALL, Feature.ORE, new OreFeatureConfig(overworldpushpiBALDOres, 4, 0.5f));
        register(context, ORE_PUSHPIBALD_MEDIUM, Feature.ORE, new OreFeatureConfig(overworldpushpiBALDOres, 8, 0.7f));
        register(context, ORE_PUSHPIBALD_LARGE, Feature.ORE, new OreFeatureConfig(overworldpushpiBALDOres, 12, 0.5f));
        register(context, ORE_PUSHPIBALD_BURIED, Feature.ORE, new OreFeatureConfig(overworldpushpiBALDOres, 8, 1.0f));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(PushpinbirdMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
