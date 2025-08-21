package net.legendzary.ppbmod;

import net.fabricmc.api.ModInitializer;

import net.legendzary.ppbmod.block.ModBlocks;
import net.legendzary.ppbmod.entity.ModEntities;
import net.legendzary.ppbmod.item.ModItemGroups;
import net.legendzary.ppbmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushpinbirdMod implements ModInitializer {
	public static final String MOD_ID = "ppbmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
        ModEntities.registerModEntities();
	}
}