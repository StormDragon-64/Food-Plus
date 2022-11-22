package net.stormdragon_64.food_plus.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DONUT = (new FoodProperties.Builder()).nutrition(6).saturationMod(0.8F).fast().build();
    public static final FoodProperties EMPTY_CONE = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.1F).fast().build();
    public static final FoodProperties VANILLA_ICE_CREAM = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 0), 1F).build();


}
