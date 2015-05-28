package org.prismarine.api;

import java.io.File;

public interface Server {

    /**
     * Gets the amount of memory, that is being used by Prismarine.
     *
     * @return Amount of memory being used by Prismarine, in MB
     */
    int getMemoryUsage();

    /**
     * Gets the time the server has been up and runnning.
     *
     * @return The time the server has been up, in Seconds
     */
    int getServerUptime();

    /**
     * Gets the current MessageOfTheDay
     *
     * @return The current "Message of The Day", that is being displayed in a server list
     */
    String getMotd();

    /**
     * Reloads the Motd, by checking for changes in the properties.
     */
    void reloadMotd();

    /**
     * Gets the Server Icon that is currently being used.
     *
     * @return A {@link File} that represents the Server Icon
     */
    File getServerIcon();

    /**
     * Shuts the server down
     */
    void shutdown();

    /**
     * Restarts the server.
     */
    void restart();

    /**
     * Gets if a whitelist is enabled.
     *
     * @return Whether a whitelist is being enabled
     */
    boolean hasWhitelist();

    /**
     * Gets if the server is using Mojang's authentication servers.
     *
     * @return Whether the server is using Mojang's authentication servers
     */
    boolean getOnlineMode();

    boolean getPvpEnabled();

    boolean getAnimalsSpawn();

    boolean getSpawnStructures();

    boolean getAllowFlight();

}
