package com.cryslo.cryslo_world;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.world.gen.WorldGeneratorModifier;

/**
 * Created by Ross Edlin on 14/02/2016.
 * sd
 */
@Plugin(id = CrysloWorld.ID, name = CrysloWorld.NAME, version = CrysloWorld.VERSION)
public class CrysloWorld
{
    public static final String ID = "cryslo_world";
    public static final String NAME = "Cryslo World";
    public static final String VERSION = "1.0";

    /**
     *
     *
     * @param event Game initialisation event
     */
    @Listener
    public void onPreInitialization(GamePreInitializationEvent event)
    {
        Registry.setGame(Sponge.getGame());
        Registry.setPlugin(Registry.getGame().getPluginManager().getPlugin(CrysloWorld.ID).get());
        Registry.setLogger(Registry.getGame().getPluginManager().getLogger(Registry.getPlugin()));
        Registry.initCommands();

        Sponge.getRegistry().register(WorldGeneratorModifier.class , new MyModifier());
    }
}