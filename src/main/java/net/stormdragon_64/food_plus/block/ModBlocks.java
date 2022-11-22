package net.stormdragon_64.food_plus.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stormdragon_64.food_plus.FoodPlus;
import net.stormdragon_64.food_plus.block.custom.EmptyIceCreamTub;
import net.stormdragon_64.food_plus.item.ModItems;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.IRON_BLOCK;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FoodPlus.MOD_ID);

    //actual blocks
    public static final RegistryObject<Block> EMPTY_ICE_CREAM_TUB = registerBlock("empty_ice_cream_tub",
            () -> new EmptyIceCreamTub(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F, 6.0F)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> VANILLA_ICE_CREAM_TUB = registerBlock("vanilla_ice_cream_tub",
            () -> new EmptyIceCreamTub(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F, 6.0F)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item>
    registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}
