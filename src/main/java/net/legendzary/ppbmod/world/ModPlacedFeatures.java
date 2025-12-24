package net.legendzary.ppbmod.world;

import net.legendzary.ppbmod.PushpinbirdMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ORE_PUSHPIBALD_SMALL_PLACED = registerKey("ore_pushpibald_small_placed");
    public static final RegistryKey<PlacedFeature> ORE_PUSHPIBALD_MEDIUM_PLACED = registerKey("ore_pushpibald_medium_placed");
    public static final RegistryKey<PlacedFeature> ORE_PUSHPIBALD_LARGE_PLACED = registerKey("ore_pushpibald_large_placed");
    public static final RegistryKey<PlacedFeature> ORE_PUSHPIBALD_BURIED_PLACED = registerKey("ore_pushpibald_buried_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, ORE_PUSHPIBALD_SMALL_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_PUSHPIBALD_SMALL),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        register(context, ORE_PUSHPIBALD_MEDIUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_PUSHPIBALD_MEDIUM),
                ModOrePlacement.modifiersWithCount(1,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-4))));
        register(context, ORE_PUSHPIBALD_LARGE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_PUSHPIBALD_LARGE),
                ModOrePlacement.modifiersWithRarity(12,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
        register(context, ORE_PUSHPIBALD_BURIED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_PUSHPIBALD_BURIED),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(PushpinbirdMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}