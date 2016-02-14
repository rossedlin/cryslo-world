package com.cryslo.cryslo_world;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.source.CommandBlockSource;
import org.spongepowered.api.command.source.ConsoleSource;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.text.Text;

/**
 * Build a list of commands for this plugin
 *
 * Created by rosse on 14/02/2016.
 */
public class Commands implements CommandExecutor
{
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException
    {
        if (src instanceof Player)
        {
            Player player = (Player) src;
            player.sendMessage(Text.of("Hello " + player.getName() + "!"));
        }
        else if (src instanceof ConsoleSource)
        {
            src.sendMessage(Text.of("Hello GLaDOS!"));
            // The Cake Is a Lie
        }
        else if (src instanceof CommandBlockSource)
        {
            src.sendMessage(Text.of("Hello Companion Cube!"));
            // <3
        }

        return CommandResult.success();
    }
}
