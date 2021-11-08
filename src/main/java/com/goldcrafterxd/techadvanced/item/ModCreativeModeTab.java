package com.goldcrafterxd.techadvanced.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TECHADVANCED_TAB = new CreativeModeTab("techadvanced_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.URANIUM_INGOT.get());
        }
    };
}
