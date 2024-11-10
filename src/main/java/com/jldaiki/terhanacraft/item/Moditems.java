package com.jldaiki.terhanacraft.item;

import com.jldaiki.terhanacraft.Terhanacraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Terhanacraft.MOD_ID);


    public static final RegistryObject<Item> RAW_GLACIUS = ITEMS.register("raw_glacius",
            ( ) -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_INGOT = ITEMS.register("glacius_ingot",
            ( ) -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_NUGGET = ITEMS.register("glacius_nugget",
            ( ) -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
