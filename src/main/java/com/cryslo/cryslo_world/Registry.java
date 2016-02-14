package com.cryslo.cryslo_world;

import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.spec.CommandSpec;
import org.spongepowered.api.plugin.PluginContainer;
import org.spongepowered.api.text.Text;

/**
 * Main Registry for Cryslo
 *
 * Created by Ross Edlin on 14/02/2016.
 */
final public class Registry
{
    private static Logger logger;
    private static Game game;
    private static PluginContainer plugin;

    public static Logger getLogger()
    {
        return logger;
    }

    public static void setLogger(Logger logger)
    {
        Registry.logger = logger;
    }

    public static Game getGame()
    {
        return game;
    }

    public static void setGame(Game game)
    {
        Registry.game = game;
    }

    public static PluginContainer getPlugin()
    {
        return plugin;
    }

    public static void setPlugin(PluginContainer plugin)
    {
        Registry.plugin = plugin;
    }

    public static void initCommands()
    {
        CommandSpec myCommandSpec = CommandSpec.builder()
                .description(Text.of("Main Cryslo Command"))
                .permission("cryslo.world.command.cryslo")
                .executor(new Commands())
                .build();

        Sponge.getCommandManager().register(Registry.getPlugin(), myCommandSpec, "cryslo", "hello", "test");
    }
}

