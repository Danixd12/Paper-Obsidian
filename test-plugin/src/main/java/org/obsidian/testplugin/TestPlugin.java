package org.obsidian.testplugin;

import org.obsidian.ObsidianPlugin;
import org.obsidian.PluginInfo;
import org.obsidian.command.ICommand;

@PluginInfo(name = "TestPlugin" ,author = "dani33y", version = "0.0.1")
public class TestPlugin extends ObsidianPlugin {

    @Override
    public void onEnable() {

        getCommandManager().registerCommand(new TestCommand())
            .withSubcommands();

        getLogger().info("Started " + getPluginInfo().getName() + " by " + getPluginInfo().getAuthor());


    }

}
