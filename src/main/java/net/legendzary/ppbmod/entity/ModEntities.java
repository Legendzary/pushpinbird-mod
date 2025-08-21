package net.legendzary.ppbmod.entity;

import net.legendzary.ppbmod.PushpinbirdMod;
import net.legendzary.ppbmod.entity.custom.PushpinProjectileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PushpinProjectileEntity> PUSHPIN = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PushpinbirdMod.MOD_ID, "pushpin"),
            EntityType.Builder.<PushpinProjectileEntity>create(PushpinProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());


    public static void registerModEntities() {
        PushpinbirdMod.LOGGER.info("Registering Mod Entities for " + PushpinbirdMod.MOD_ID);
    }
}
