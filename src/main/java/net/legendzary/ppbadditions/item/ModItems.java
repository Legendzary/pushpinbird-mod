package net.legendzary.ppbadditions.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.legendzary.ppbadditions.PushpinbirdAdditions;
import net.legendzary.ppbadditions.item.custom.PushpinItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PUSHPIN = registerItem("pushpin",
            new PushpinItem(new Item.Settings().maxCount(64)));

    public static final Item CHAT_MASCOT = registerItem("chat_mascot", new Item(new Item.Settings().food(ModFoodComponents.CHAT_MASCOT)));

    public static final Item PUSHPIBALD = registerItem("pushpibald",
            new Item(new Item.Settings()));

    public static final Item PUSHPIBALD_SWORD = registerItem("pushpibald_sword",
            new SwordItem(ModToolMaterials.PUSHIBALD, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PUSHIBALD, 3, -2.3f))));
    public static final Item PUSHPIBALD_PICKAXE = registerItem("pushpibald_pickaxe",
            new PickaxeItem(ModToolMaterials.PUSHIBALD, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PUSHIBALD, 1, -2.8f))));
    public static final Item PUSHPIBALD_AXE = registerItem("pushpibald_axe",
            new AxeItem(ModToolMaterials.PUSHIBALD, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PUSHIBALD, 5, -2.9f))));
    public static final Item PUSHPIBALD_SHOVEL = registerItem("pushpibald_shovel",
            new ShovelItem(ModToolMaterials.PUSHIBALD, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PUSHIBALD, 1.5f, -3.0f))));
    public static final Item PUSHPIBALD_HOE = registerItem("pushpibald_hoe",
            new HoeItem(ModToolMaterials.PUSHIBALD, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PUSHIBALD, -3, 0.0f))));

    public static final Item PUSHPIBALD_HELMET = registerItem("pushpibald_helmet",
            new ArmorItem(ModArmorMaterials.PUSHPIBALD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item PUSHPIBALD_CHESTPLATE = registerItem("pushpibald_chestplate",
            new ArmorItem(ModArmorMaterials.PUSHPIBALD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))));
    public static final Item PUSHPIBALD_LEGGINGS = registerItem("pushpibald_leggings",
            new ArmorItem(ModArmorMaterials.PUSHPIBALD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item PUSHPIBALD_BOOTS = registerItem("pushpibald_boots",
            new ArmorItem(ModArmorMaterials.PUSHPIBALD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PushpinbirdAdditions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PushpinbirdAdditions.LOGGER.info("Registering Mod Items for " + PushpinbirdAdditions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS). register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PUSHPIBALD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT). register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PUSHPIN);
            fabricItemGroupEntries.add(PUSHPIBALD_SWORD);
            fabricItemGroupEntries.add(PUSHPIBALD_HELMET);
            fabricItemGroupEntries.add(PUSHPIBALD_CHESTPLATE);
            fabricItemGroupEntries.add(PUSHPIBALD_LEGGINGS);
            fabricItemGroupEntries.add(PUSHPIBALD_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS). register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PUSHPIBALD_SHOVEL);
            fabricItemGroupEntries.add(PUSHPIBALD_PICKAXE);
            fabricItemGroupEntries.add(PUSHPIBALD_AXE);
            fabricItemGroupEntries.add(PUSHPIBALD_HOE);
        });
    }
}
