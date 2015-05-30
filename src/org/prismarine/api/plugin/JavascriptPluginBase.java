package org.prismarine.api.plugin;

public interface JavascriptPluginBase {

    /**
     * Called when a plugin has been loaded
     */
    void onEnable();

    /**
     * Called when a plugin is about to unload
     */
    void onDisable();
}
