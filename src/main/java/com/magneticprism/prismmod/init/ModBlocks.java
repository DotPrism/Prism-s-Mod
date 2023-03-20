package com.magneticprism.prismmod.init;

import java.util.ArrayList;
import java.util.List;

import com.magneticprism.prismmod.blocks.*;
import com.magneticprism.prismmod.blocks.ores.*;
import com.magneticprism.prismmod.blocks.metal.*;
import com.magneticprism.prismmod.blocks.machines.*;
import com.magneticprism.prismmod.PrismMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	// ores
	public static final Block COPPER_ORE = new CopperOre("copper_ore", Material.ROCK, PrismMod.prismmod_tab, 5f, 15f, 1);
	public static final Block LEAD_ORE = new LeadOre("lead_ore", Material.ROCK, PrismMod.prismmod_tab, 5f, 15f, 2);
	public static final Block NICKEL_ORE = new NickelOre("nickel_ore", Material.ROCK, PrismMod.prismmod_tab, 5f, 15f, 2);
	public static final Block SILVER_ORE = new SilverOre("silver_ore", Material.ROCK, PrismMod.prismmod_tab, 5f, 15f, 2);
	public static final Block TIN_ORE = new TinOre("tin_ore", Material.ROCK, PrismMod.prismmod_tab, 5f, 15f, 1);
	public static final Block URANIUM_ORE = new UraniumOre("uranium_ore", Material.ROCK, PrismMod.prismmod_tab, 5f, 15f, 2);
	
	// metal blocks
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block", Material.IRON, PrismMod.prismmod_tab, 5f, 15f, 1);
	public static final Block LEAD_BLOCK = new LeadBlock("lead_block", Material.IRON, PrismMod.prismmod_tab, 5f, 15f, 2);
	public static final Block NICKEL_BLOCK = new NickelBlock("nickel_block", Material.IRON, PrismMod.prismmod_tab, 5f, 15f, 2);
	public static final Block SILVER_BLOCK = new SilverBlock("silver_block", Material.IRON, PrismMod.prismmod_tab, 5f, 15f, 2);
	public static final Block TIN_BLOCK = new TinBlock("tin_block", Material.IRON, PrismMod.prismmod_tab, 5f, 15f, 1);
	public static final Block URANIUM_BLCK = new UraniumBlock("uranium_block", Material.IRON, PrismMod.prismmod_tab, 5f, 15f, 2);
	
	// other blocks
	public static final Block STEEL_BLOCK = new BlockBase("steel_block", Material.IRON, PrismMod.prismmod_tab);
	// public static final Block CAPACITOR_BLOCK = new CapacitorBlock("energy_capacitor", Material.IRON, PrismMod.prismmod_tab);
	
	// machines
	public static final Block DECAY_FURNACE = new DecayFurnace("decay_furnace", Material.IRON, PrismMod.prismmod_tab);
}
