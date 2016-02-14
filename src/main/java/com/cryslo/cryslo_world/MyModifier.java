package com.cryslo.cryslo_world;

import com.cryslo.cryslo_world.Biom.IslandBiomeGen;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.data.DataContainer;
import org.spongepowered.api.world.WorldCreationSettings;
import org.spongepowered.api.world.biome.BiomeGenerationSettings;
import org.spongepowered.api.world.biome.BiomeTypes;
import org.spongepowered.api.world.gen.BiomeGenerator;
import org.spongepowered.api.world.gen.WorldGenerator;
import org.spongepowered.api.world.gen.WorldGeneratorModifier;
import org.spongepowered.api.world.gen.populator.Cactus;

/**
 * Lets modify the chunks!!!
 *
 * Created by Ross Edlin on 14/02/2016.
 */
public class MyModifier implements WorldGeneratorModifier
{
    @Override
    public String getId()
    {
        return CrysloWorld.ID + ":mymodifier";
    }

    @Override
    public String getName()
    {
        return "My Modifier";
    }

    @Override
    public void modifyWorldGenerator(WorldCreationSettings world, DataContainer settings, WorldGenerator worldGenerator)
    {
        BiomeGenerator biomeGenerator = new IslandBiomeGen();
        worldGenerator.setBiomeGenerator(biomeGenerator);

//        BiomeGenerationSettings jgl = worldGenerator.getBiomeSettings(BiomeTypes.JUNGLE_EDGE);
//        for (BlockType populator : jgl.getPopulators(Cactus.class))
//        {
//            populator.setHeight(5);
//        }
//
//        BiomeGenerationSettings desertSettings = worldGenerator.getBiomeSettings(BiomeTypes.DESERT);
//        for (Cactus populator : desertSettings.getPopulators(Cactus.class))
//        {
//            populator.setHeight(5);
//        }
    }
}