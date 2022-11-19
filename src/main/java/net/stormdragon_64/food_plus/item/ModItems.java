package net.stormdragon_64.food_plus.item;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.stormdragon_64.food_plus.FoodPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item>  ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodPlus.MOD_ID);
    public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.ENCHANTED_GOLDEN_APPLE)));

    public static final RegistryObject<Item> VANILLA_ICE_CREAM = ITEMS.register("vanilla_ice_cream",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.ENCHANTED_GOLDEN_APPLE)));
public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}


}
