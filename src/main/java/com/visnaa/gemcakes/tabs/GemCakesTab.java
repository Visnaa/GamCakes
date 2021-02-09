package com.visnaa.gemcakes.tabs;

import com.visnaa.gemcakes.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GemCakesTab extends ItemGroup
{
    public GemCakesTab() {
        super("gemcakes_tab");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.RUBY_CAKE.get());
    }
}
