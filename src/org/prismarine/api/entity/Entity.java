package org.prismarine.api.entity;

import org.prismarine.api.world.Location;

import java.util.UUID;

public interface Entity {

    /**
     * Gets the UUID of the Entity
     *
     * @return Returns the UUID of the Entity
     */
    UUID getUUID();

    /**
     * Gets the custom name of the Entity
     *
     * @return Returns the custom name of the Entity
     */
    String getCustomName();

    /**
     * Checks if the Entity has a custom name
     *
     * @return Returns true/false depending on if the Entity has a custom name
     */
    boolean hasCustomName();

    /**
     * Sets the custom name of the Entity
     *
     * @param name The custom name of the Entity
     */
    void setCustomName(String name);

    /**
     * Gets the Location of the Entity
     *
     * @return Returns The Location of the Entity
     */
    Location getLocation();

    /**
     * Sets the Location of the Entity
     *
     * @param location The Location to set the Entity to
     */
    void setLocation(Location location);

    /**
     * Teleports this Entity to another Entity
     *
     * @param entity The Entity to teleport to
     */
    void teleport(Entity entity);

    /**
     * Gets the amount of Ticks that this Entity has been alive for
     *
     * @return int Returns the amount of Ticks the Entity has been alive for
     */
    int getTicksAlive();

    /**
     * Sets if the Entity is visible to other Entities
     *
     * @param visible Whether the Entity is visible to other Entites
     */
    void setVisible(boolean visible);

    /**
     * Gets if the Entity is visible to other Entities
     *
     * @return Returns if the Entity is visible to other Entities
     */
    boolean isVisible();

}
