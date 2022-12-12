package net.stormdragon_64.food_plus.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.stormdragon_64.food_plus.FoodPlus;
import net.stormdragon_64.food_plus.item.ModItems;
import vectorwing.farmersdelight.common.block.CabinetBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FoodPlus.MOD_ID);
    //actual blocks

    //andesite counters
    public static final RegistryObject<Block> ANDESITE_SPRUCE_COUNTER =
            registerBlock("andesite_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_BIRCH_COUNTER =
            registerBlock("andesite_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_OAK_COUNTER =
            registerBlock("andesite_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_DARK_OAK_COUNTER =
            registerBlock("andesite_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_WARPED_COUNTER =
            registerBlock("andesite_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_CRIMSON_COUNTER =
            registerBlock("andesite_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_JUNGLE_COUNTER =
            registerBlock("andesite_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> ANDESITE_ACACIA_COUNTER =
            registerBlock("andesite_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    // Granite Counters
    public static final RegistryObject<Block> GRANITE_SPRUCE_COUNTER =
            registerBlock("granite_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_BIRCH_COUNTER =
            registerBlock("granite_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_OAK_COUNTER =
            registerBlock("granite_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_DARK_OAK_COUNTER =
            registerBlock("granite_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_WARPED_COUNTER =
            registerBlock("granite_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_CRIMSON_COUNTER =
            registerBlock("granite_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_JUNGLE_COUNTER =
            registerBlock("granite_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> GRANITE_ACACIA_COUNTER =
            registerBlock("granite_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);


    //tuff counters

    public static final RegistryObject<Block> TUFF_SPRUCE_COUNTER =
            registerBlock("tuff_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_BIRCH_COUNTER =
            registerBlock("tuff_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_OAK_COUNTER =
            registerBlock("tuff_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_DARK_OAK_COUNTER =
            registerBlock("tuff_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_WARPED_COUNTER =
            registerBlock("tuff_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_CRIMSON_COUNTER =
            registerBlock("tuff_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_JUNGLE_COUNTER =
            registerBlock("tuff_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> TUFF_ACACIA_COUNTER =
            registerBlock("tuff_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);


    // diorite counters

    public static final RegistryObject<Block> DIORITE_SPRUCE_COUNTER =
            registerBlock("diorite_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_BIRCH_COUNTER =
            registerBlock("diorite_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_OAK_COUNTER =
            registerBlock("diorite_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_DARK_OAK_COUNTER =
            registerBlock("diorite_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_WARPED_COUNTER =
            registerBlock("diorite_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_CRIMSON_COUNTER =
            registerBlock("diorite_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_JUNGLE_COUNTER =
            registerBlock("diorite_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DIORITE_ACACIA_COUNTER =
            registerBlock("diorite_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);


    //deepslate counters

    public static final RegistryObject<Block> DEEPSLATE_SPRUCE_COUNTER =
            registerBlock("deepslate_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_BIRCH_COUNTER =
            registerBlock("deepslate_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_OAK_COUNTER =
            registerBlock("deepslate_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_DARK_OAK_COUNTER =
            registerBlock("deepslate_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_WARPED_COUNTER =
            registerBlock("deepslate_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_CRIMSON_COUNTER =
            registerBlock("deepslate_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_JUNGLE_COUNTER =
            registerBlock("deepslate_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> DEEPSLATE_ACACIA_COUNTER =
            registerBlock("deepslate_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);


    // blackstone Counters

    public static final RegistryObject<Block> BLACKSTONE_SPRUCE_COUNTER =
            registerBlock("blackstone_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_BIRCH_COUNTER =
            registerBlock("blackstone_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_OAK_COUNTER =
            registerBlock("blackstone_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_DARK_OAK_COUNTER =
            registerBlock("blackstone_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_WARPED_COUNTER =
            registerBlock("blackstone_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_CRIMSON_COUNTER =
            registerBlock("blackstone_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_JUNGLE_COUNTER =
            registerBlock("blackstone_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> BLACKSTONE_ACACIA_COUNTER =
            registerBlock("blackstone_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);


    //scoria counters

    public static final RegistryObject<Block> SCORIA_SPRUCE_COUNTER =
            registerBlock("scoria_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_BIRCH_COUNTER =
            registerBlock("scoria_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_OAK_COUNTER =
            registerBlock("scoria_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_DARK_OAK_COUNTER =
            registerBlock("scoria_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_WARPED_COUNTER =
            registerBlock("scoria_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_CRIMSON_COUNTER =
            registerBlock("scoria_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_JUNGLE_COUNTER =
            registerBlock("scoria_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORIA_ACACIA_COUNTER =
            registerBlock("scoria_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);


    // scorchia Counters

    public static final RegistryObject<Block> SCORCHIA_SPRUCE_COUNTER =
            registerBlock("scorchia_spruce_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_BIRCH_COUNTER =
            registerBlock("scorchia_birch_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_OAK_COUNTER =
            registerBlock("scorchia_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_DARK_OAK_COUNTER =
            registerBlock("scorchia_dark_oak_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_WARPED_COUNTER =
            registerBlock("scorchia_warped_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_CRIMSON_COUNTER =
            registerBlock("scorchia_crimson_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_JUNGLE_COUNTER =
            registerBlock("scorchia_jungle_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<Block> SCORCHIA_ACACIA_COUNTER =
            registerBlock("scorchia_acacia_counter", () -> new
                    CabinetBlock(BlockBehaviour.Properties.copy(Blocks.BARREL).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);



    //Stuff to make it work
    private static <T extends Block>RegistryObject<T>
    registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn, tab);
    return toReturn;
    }

    private static <T extends Block>RegistryObject<Item>
    registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
