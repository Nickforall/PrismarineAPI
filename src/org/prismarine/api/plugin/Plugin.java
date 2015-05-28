package org.prismarine.api.plugin;

public interface Plugin {

    /**
     * Gets the Type of plugin
     *
     * @return An instance of {@link PluginType} with the type of plugin
     */
    PluginType getPluginType();

}
