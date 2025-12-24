package net.legendzary.ppbmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.legendzary.ppbmod.block.ModBlocks;
import net.legendzary.ppbmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> PUSHPIBALD_SMELTABLES = List.of(ModBlocks.PUSHPIBALD_ORE, ModBlocks.PUSHPIBALD_DEEPSLATE_ORE);

        offerSmelting(exporter, PUSHPIBALD_SMELTABLES, RecipeCategory.MISC, ModItems.PUSHPIBALD, 0.25f, 200, "PUSHPIBALD");
        offerBlasting(exporter, PUSHPIBALD_SMELTABLES, RecipeCategory.MISC, ModItems.PUSHPIBALD, 0.25f, 100, "PUSHPIBALD");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PUSHPIBALD, RecipeCategory.DECORATIONS, ModBlocks.PUSHPIBALD_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PUSHPIBALD_SWORD)
            .pattern("#")
            .pattern("#")
            .pattern("I")
            .input('#', ModItems.PUSHPIBALD)
            .input('I', Items.STICK)
            .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
            .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PUSHPIBALD_PICKAXE)
                .pattern("###")
                .pattern(" I ")
                .pattern(" I ")
                .input('#', ModItems.PUSHPIBALD)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PUSHPIBALD_AXE)
                .pattern("##")
                .pattern("I#")
                .pattern("I ")
                .input('#', ModItems.PUSHPIBALD)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PUSHPIBALD_SHOVEL)
                .pattern("#")
                .pattern("I")
                .pattern("I")
                .input('#', ModItems.PUSHPIBALD)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.PUSHPIBALD_HOE)
                .pattern("##")
                .pattern("I ")
                .pattern("I ")
                .input('#', ModItems.PUSHPIBALD)
                .input('I', Items.STICK)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUSHPIBALD_HELMET)
                .pattern("###")
                .pattern("# #")
                .pattern("   ")
                .input('#', ModItems.PUSHPIBALD)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUSHPIBALD_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.PUSHPIBALD)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUSHPIBALD_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.PUSHPIBALD)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUSHPIBALD_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.PUSHPIBALD)
                .criterion(hasItem(ModItems.PUSHPIBALD), conditionsFromItem(ModItems.PUSHPIBALD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUSHPIN, 4)
            .input(Items.RED_DYE)
            .input(Items.IRON_INGOT)
            .criterion(hasItem(ModBlocks.PUSHPIBALD_BLOCK), conditionsFromItem(ModBlocks.PUSHPIBALD_BLOCK))
            .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHAT_MASCOT, 1)
                .input(Items.COOKED_CHICKEN)
                .input(Items.GREEN_DYE)
                .criterion(hasItem(Items.COOKED_CHICKEN), conditionsFromItem(Items.COOKED_CHICKEN))
                .offerTo(exporter);
    }
}
