package net.legendzary.ppbmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CHAT_MASCOT = new FoodComponent.Builder().nutrition(7).saturationModifier(0.7f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 60), 1.0f).build();
}
