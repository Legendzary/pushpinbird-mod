package net.legendzary.ppbmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legendzary.ppbmod.block.ModBlocks;
import net.legendzary.ppbmod.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PUSHPIBALD_BLOCK)
                .add(ModBlocks.PUSHPIBALD_ORE)
                .add(ModBlocks.PUSHPIBALD_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.PUSHPIBALD_BLOCK)
                .add(ModBlocks.PUSHPIBALD_ORE)
                .add(ModBlocks.PUSHPIBALD_DEEPSLATE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PUSHPIBALD_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
    }
}
