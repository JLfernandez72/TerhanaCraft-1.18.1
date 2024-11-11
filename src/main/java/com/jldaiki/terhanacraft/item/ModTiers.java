package com.jldaiki.terhanacraft.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier GLACIUS = new ForgeTier(2, 1000, 7f,
            2f, 25, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Moditems.GLACIUS_INGOT.get()));
}
