package net.stormdragon_64.food_plus.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DONUT = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8F).fast().build();

    public static final FoodProperties CHEESE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).fast().build();

}
