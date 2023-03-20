package com.magneticprism.prismmod.tabs;

import com.magneticprism.prismmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PrismModTabItems extends CreativeTabs
{
    public PrismModTabItems(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() 
    {
        return new ItemStack(ModItems.STRANGE_CRYSTAL);
    }
}
