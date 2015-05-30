package org.prismarine.api.plugin;

import java.io.File;
import java.io.FileReader;

public interface PluginManagerBase {

    /**
     * Gets the plugin directory of this manager
     *
     * @return The plugin directory of this manager
     */
    File getPluginsDir();

    /**
     * Initializes a plugin, and adds it to the manager
     *
     * @param pluginFile The file of the plugin to initialize
     * @param name The name of the plugin to initialize
     */
    void addPlugin(FileReader pluginFile, String name);

}
