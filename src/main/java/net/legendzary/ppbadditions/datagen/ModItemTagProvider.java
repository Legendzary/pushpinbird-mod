package net.legendzary.ppbadditions.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.legendzary.ppbadditions.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.PUSHPIBALD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.PUSHPIBALD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.PUSHPIBALD_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.PUSHPIBALD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.PUSHPIBALD_HOE);
        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.PUSHPIBALD_HELMET);
        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.PUSHPIBALD_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.PUSHPIBALD_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.PUSHPIBALD_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PUSHPIBALD_HELMET)
                .add(ModItems.PUSHPIBALD_CHESTPLATE)
                .add(ModItems.PUSHPIBALD_LEGGINGS)
                .add(ModItems.PUSHPIBALD_BOOTS);

    }
}
