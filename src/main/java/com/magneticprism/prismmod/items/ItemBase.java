package com.magneticprism.prismmod.items;

import com.magneticprism.prismmod.PrismMod;
import com.magneticprism.prismmod.init.ModItems;
import com.magneticprism.prismmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{	
	
	public ItemBase(String name, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		PrismMod.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
