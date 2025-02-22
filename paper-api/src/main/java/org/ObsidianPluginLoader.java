package org;

import org.obsidian.ObsidianPlugin;
import org.obsidian.ObsidianPluginInfo;
import org.obsidian.PluginInfo;

public final class ObsidianPluginLoader {

    private final ObsidianPlugin plugin;

    public boolean commandManagerInitialized = false;
    public boolean pluginInitialized = false;

    public ObsidianPluginLoader(ObsidianPlugin plugin) {

        this.plugin = plugin;

    }

    public void initObsidianPlugin(PluginInfo pluginInfo) {

        this.plugin.setObsidianPluginInfo(new ObsidianPluginInfo(pluginInfo));

        this.pluginInitialized = true;

        plugin.getLogger().info("Initialized Obsidian plugin " + plugin.getName());

    }

    public void initObsidianPluginCommandManager() {

        this.plugin.getCommandManager().initCommandManager(plugin);

        this.commandManagerInitialized = true;

    }

}
