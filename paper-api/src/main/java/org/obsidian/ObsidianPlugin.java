package org.obsidian;

import org.ObsidianPluginLoader;
import org.bukkit.plugin.java.JavaPlugin;
import org.obsidian.command.CommandManager;

/**
 *
 * Creates a new ObsidianPlugin
 * that inherits all the methods from JavaPlugin class
 *
 */
public abstract class ObsidianPlugin extends JavaPlugin {

    private final CommandManager commandManager = new CommandManager();
    private final ObsidianPluginLoader obsidianPluginLoader = new ObsidianPluginLoader(this);
    private ObsidianPluginInfo obsidianPluginInfo = null;

    public void setObsidianPluginInfo(final ObsidianPluginInfo obsidianPluginInfo) {

        this.obsidianPluginInfo = obsidianPluginInfo;

    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public ObsidianPluginLoader getObsidianPluginLoader() {
        return obsidianPluginLoader;
    }

    public ObsidianPluginInfo getPluginInfo() {
        return obsidianPluginInfo;
    }

}
