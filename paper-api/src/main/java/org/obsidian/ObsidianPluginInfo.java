package org.obsidian;

public class ObsidianPluginInfo {

    private PluginInfo pluginInfo = null;

    public ObsidianPluginInfo(PluginInfo pluginInfo) {

        this.pluginInfo = pluginInfo;

    }

    public String getName() {
        return pluginInfo.name();
    }

    public String getAuthor() {
        return pluginInfo.author();
    }

    public String getDescription() {
        return pluginInfo.description();
    }

    public String getVersion() {
        return pluginInfo.version();
    }

    public String getWeb() {
        return pluginInfo.web();
    }

}
