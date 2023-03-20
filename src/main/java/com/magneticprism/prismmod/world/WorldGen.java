package com.magneticprism.prismmod.world;

import java.util.Random;

import com.magneticprism.prismmod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator
{
    @Override
    public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
    {
        if (world.provider.getDimension() == 0)
        {
            generateOverworld(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        else if (world.provider.getDimension() == 1)
        {
            generateNether(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
        else
        {
            generateEnd(rand, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        generateOre(ModBlocks.COPPER_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 12, 80, rand.nextInt(7) + 7, 30);
        generateOre(ModBlocks.LEAD_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 6, 42, rand.nextInt(4) + 3, 12);
        generateOre(ModBlocks.URANIUM_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 12, 28, rand.nextInt(3) + 2, 8);
        generateOre(ModBlocks.NICKEL_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 20, 36, rand.nextInt(5) + 2, 10);
        generateOre(ModBlocks.SILVER_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 12, 40, rand.nextInt(3) + 1, 13);
        generateOre(ModBlocks.TIN_ORE.getDefaultState(), world, rand, chunkX * 16, chunkZ * 16, 12, 28, rand.nextInt(7) + 5, 28);
    }

    private void generateNether(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    { }

    private void generateEnd(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    { }

    private void generateOre(IBlockState ore, World world, Random rand, int chunkX, int chunkZ, int minY, int maxY, int size, int chances)
    {
        int detlaY = maxY - minY;
        for (int i = 0; i  < chances; i++)
        {
            BlockPos pos = new BlockPos(chunkX + rand.nextInt(16), minY + rand.nextInt(detlaY), chunkZ + rand.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, size);
            generator.generate(world, rand, pos);
        }
    }
}
