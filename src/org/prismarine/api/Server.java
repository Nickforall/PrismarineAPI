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

    //TODO: Documentation

    /**
     * Gets if Player VS Player is enabled on the server.
     *
     * @return Whether PvP is enabled on the server
     */
    boolean getPvpEnabled();

    /**
     * Gets if animals are allowed to spawn in the server.
     *
     * @return Whether animals are allowed to spawn in the server
     */
    boolean getAnimalsSpawn();

    /**
     * Gets if Structures are allowed to generate in the server.
     *
     * @return Whether Structures are allowed to generate in the server
     */
    boolean getGenerateStructures();

    /**
     * Gets if flying is enabled on the server
     *
     * @return Whether flying is enabled on the server
     */
    boolean getAllowFlight();

    /**
     * Sets the Message Of The Day for the server.
     * @param motd a new "Message of The Day", that is being displayed in a server list
     */
    void setMotd(String motd);

    /**
     * Gets the minecraft version of the current server.
     * @return The Minecraft version of the current server.
     */
    String getServerVersion();

}
