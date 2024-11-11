package com.jldaiki.terhanacraft.item;

import com.jldaiki.terhanacraft.Terhanacraft;
import com.jldaiki.terhanacraft.item.custom.SlownessSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Terhanacraft.MOD_ID);

    //here we define the ores, materials, armors and tools

    //Glacius` Mind items
    public static final RegistryObject<Item> RAW_GLACIUS = ITEMS.register("raw_glacius",
            ( ) -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_INGOT = ITEMS.register("glacius_ingot",
            ( ) -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_NUGGET = ITEMS.register("glacius_nugget",
            ( ) -> new Item(new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));
    //Glacius` Mind Tools
    public static final RegistryObject<Item> GLACIUS_SWORD = ITEMS.register("glacius_sword",
            ( ) -> new SlownessSwordItem(ModTiers.GLACIUS,5,-2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_AXE = ITEMS.register("glacius_axe",
            ( ) -> new AxeItem(ModTiers.GLACIUS,6,-3f,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_PICKAXE = ITEMS.register("glacius_pickaxe",
            ( ) -> new PickaxeItem(ModTiers.GLACIUS,2,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_SHOVEL = ITEMS.register("glacius_shovel",
            ( ) -> new ShovelItem(ModTiers.GLACIUS,2,-2f,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_HOE = ITEMS.register("glacius_hoe",
            ( ) -> new HoeItem(ModTiers.GLACIUS,1,0.1f,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));
    //Glacius` Mind Armor
    public static final RegistryObject<Item> GLACIUS_HELMET = ITEMS.register("glacius_helmet",
            ( ) -> new ArmorItem(ModArmorMaterials.GLACIUS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_CHESTPLATE = ITEMS.register("glacius_chestplate",
            ( ) -> new ArmorItem(ModArmorMaterials.GLACIUS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_LEGGINGS = ITEMS.register("glacius_leggings",
            ( ) -> new ArmorItem(ModArmorMaterials.GLACIUS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));

    public static final RegistryObject<Item> GLACIUS_BOOTS = ITEMS.register("glacius_boots",
            ( ) -> new ArmorItem(ModArmorMaterials.GLACIUS, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.TERHANACRAFT_TAB)));






    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }
}
