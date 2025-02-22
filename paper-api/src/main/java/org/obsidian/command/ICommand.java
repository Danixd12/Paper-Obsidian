package org.obsidian.command;

import org.bukkit.command.CommandExecutor;

public interface ICommand extends CommandExecutor {

    public String getCommandName();

    default String getCommandUsage() {

        return "No usage set for /" + getCommandName();

    }

    default String getCommandDescription() {

        return "No description set for /" + getCommandName();

    }

}
