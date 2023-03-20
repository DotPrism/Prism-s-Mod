package com.magneticprism.prismmod;

import com.magneticprism.prismmod.proxy.CommonProxy;
import com.magneticprism.prismmod.tabs.PrismModTab;
import com.magneticprism.prismmod.tabs.PrismModTabItems;
import com.magneticprism.prismmod.util.Reference;
import com.magneticprism.prismmod.util.handlers.RegistryHandler;
import com.magneticprism.prismmod.world.WorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class PrismMod 
{
	public static final CreativeTabs prismmod_tab = new PrismModTab("prismmodtab");
	public static final CreativeTabs prismmod_tab_items = new PrismModTabItems("prismmodtab_items");

	@Instance
	public static PrismMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.initRegistries(event);
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		RegistryHandler.postInitRegistries(event);
	}
}
