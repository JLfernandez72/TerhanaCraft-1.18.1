package com.jldaiki.terhanacraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TERHANACRAFT_TAB = new CreativeModeTab("terhanacraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Moditems.RAW_GLACIUS.get());
        }
    };
}
