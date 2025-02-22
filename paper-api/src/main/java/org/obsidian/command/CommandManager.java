package org.obsidian.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Objects;

public final class CommandManager {

    private final ArrayList<ICommand> commandList = new ArrayList<>();

    public CommandManager registerCommand(ICommand command) {

        commandList.add(command);

        return this;

    }

    public ICommand getCommand(String name) {

        ICommand commandToReturn = null;

        for (ICommand command : commandList) {

            if (command.getCommandName().equals(name))
                commandToReturn = command;

        }

        return commandToReturn;

    }

    public void initCommandManager(JavaPlugin plugin) {

        try {
            plugin.getLogger().info("Initializing CommandManager for " + plugin.getName());

            for (ICommand command : commandList) {

                Command cmd = Objects.requireNonNull(plugin.getCommand(command.getCommandName()))
                    .setUsage(command.getCommandUsage())
                    .setDescription(command.getCommandDescription());

                ((PluginCommand) cmd).setExecutor(command);

                plugin.getLogger().info("Registered command: " + command.getCommandName());

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void withSubcommands(CommandSender... sender) {



    }

}
