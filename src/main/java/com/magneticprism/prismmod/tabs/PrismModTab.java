package com.magneticprism.prismmod.tabs;

import com.magneticprism.prismmod.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PrismModTab extends CreativeTabs
{
    public PrismModTab(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() 
    {
        return new ItemStack(Item.getItemFromBlock(ModBlocks.SILVER_ORE));
    }
}
