package net.legendzary.ppbmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.legendzary.ppbmod.PushpinbirdMod;
import net.legendzary.ppbmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PUSHPINBIRD_MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PushpinbirdMod.MOD_ID, "pushpinbird_mod"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PUSHPIBALD))
                    .displayName(Text.translatable("itemgroup.ppbmod.item.group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PUSHPIN);

                        entries.add(ModItems.CHAT_MASCOT);

                        entries.add(ModItems.PUSHPIBALD);
                        entries.add(ModBlocks.PUSHPIBALD_BLOCK);

                        entries.add(ModBlocks.PUSHPIBALD_ORE);
                        entries.add(ModBlocks.PUSHPIBALD_DEEPSLATE_ORE);

                        entries.add(ModItems.PUSHPIBALD_SWORD);
                        entries.add(ModItems.PUSHPIBALD_PICKAXE);
                        entries.add(ModItems.PUSHPIBALD_AXE);
                        entries.add(ModItems.PUSHPIBALD_SHOVEL);
                        entries.add(ModItems.PUSHPIBALD_HOE);

                        entries.add(ModItems.PUSHPIBALD_HELMET);
                        entries.add(ModItems.PUSHPIBALD_CHESTPLATE);
                        entries.add(ModItems.PUSHPIBALD_LEGGINGS);
                        entries.add(ModItems.PUSHPIBALD_BOOTS);

                    }).build());



    public static void registerItemGroups() {
        PushpinbirdMod.LOGGER.info("Registering Item Groups for " + PushpinbirdMod.MOD_ID);
    }
}
