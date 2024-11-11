package com.jldaiki.terhanacraft.block;

import com.jldaiki.terhanacraft.Terhanacraft;
import com.jldaiki.terhanacraft.item.ModCreativeModeTab;
import com.jldaiki.terhanacraft.item.Moditems;
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

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Terhanacraft.MOD_ID);

    //Glacius` Mind Blocks
    public static final RegistryObject<Block> GLACIUS_ORE_BLOCK = registerBlock("glacius_ore_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.98f).strength(3f).sound(SoundType.GLASS).requiresCorrectToolForDrops()), ModCreativeModeTab.TERHANACRAFT_TAB);

    public static final RegistryObject<Block> RAW_GLACIUS_BLOCK = registerBlock("raw_glacius_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERHANACRAFT_TAB);

    public static final RegistryObject<Block> GLACIUS_BLOCK = registerBlock("glacius_block",
            ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.TERHANACRAFT_TAB);



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;

    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){

    return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }



    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);

    }
}
