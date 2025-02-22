package org.obsidian.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.obsidian.command.ICommand;

public class TestCommand implements ICommand {

    @Override
    public boolean onCommand(@NotNull final CommandSender sender, @NotNull final Command command, @NotNull final String label, final @NotNull String @NotNull [] args) {

        if (sender instanceof final Player player) {

            player.sendTMessage("&eMessage");

        }

        return true;

    }

    @Override
    public String getCommandName() {
        return "test";
    }

    @Override
    public String getCommandUsage() {
        return "Example usage for " + getCommandName();
    }

}
