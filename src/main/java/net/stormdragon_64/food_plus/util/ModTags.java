package net.stormdragon_64.food_plus.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.stormdragon_64.food_plus.FoodPlus;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> VANILLA_ICE_CREAMS = tag("vanilla_ice_creams");
        public static final TagKey<Item> CHOCOLATE_ICE_CREAMS = tag("chocolate_ice_creams");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(FoodPlus.MOD_ID, name));
        }
    }
}
