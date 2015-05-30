package org.prismarine.api.players;

import java.util.UUID;

public interface Player {

    /**
     * Gets the player's unique user id, use this for saving user related things.
     *
     * @return The player's {@link java.util.UUID}, unique user id
     */
    UUID getUUID();

    /**
     * Gets the player's displayname.
     *
     * @return The player's displayname
     */
    String getDisplayName();

    /**
     * Sets the player's displayname.
     *
     * @param name new displayname to set
     */
    void setDisplayname(String name);

    /**
     * Returns the player's health in healthpoints.
     *
     * @return The player's health
     */
    int getHealth();

    /**
     * Sets the player's health.
     *
     * @param health the healthpoints to set
     */
    void setHealth(int health);

    /**
     * Adds healthpoints to the player's health
     *
     * @param health amount of healthpoints to add.
     * @return the new amount of health
     */
    int addHealth(int health);

    /**
     * Gets the player's current food level.
     *
     * @return the player's current food level
     */
    int getFood();

    /**
     * Sets the player's food level.
     *
     * @param food the amount of foodpoints to add
     */
    void setFood(int food);

    /**
     * Adds to the player's foodlevel.
     *
     * @param food the amount of foodlevels to add
     * @param saturation the saturation of the foodlevels to add
     * @return the new amount of food
     */
    int addFood(int food, float saturation);

    /**
     * Gets the player's experience in experience points.
     *
     * @return the player's experience points
     */
    int getExperience();

    /**
     * Sets the player's experience points.
     *
     * @param exp the amount of expierience points to give the player
     */
    void setExperience(int exp);

    /**
     * Adds experience points to the player's experience
     *
     * @param exp amount of experience points to add
     * @return new amount of experience
     */
    int addExperience(int exp);

    /**
     * Gets the player's experience level.
     *
     * @return the player's experience level;
     */
    int getExpLevel();

    /**
     * Sets the player's experience levels.
     *
     * @param level the amount of expierience levels to set
     */
    void setExpLevel(int level);

    /**
     * Adds experience levels to the player's experience.
     *
     * @param level amount of experience levels to add
     * @return new level experience
     */
    int addExpLevel(int level);

    /**
     * Gets if the player is Op.
     *
     * @return whether the player is op.
     */
    boolean isOp();

    /**
     * Sets the player's op level.
     *
     * @param bool op, or not.
     */
    void setOp(boolean bool);

    /**
     * Gets the player's armor level.
     *
     * @return the player's armor level
     */
    int getArmorLevel();

    /**
     * Gets the player's {@link Gamemode}.
     * @return the player's {@link Gamemode}
     */
    Gamemode getGameMode();

    /**
     * Sets the player's gamemode.
     *
     * @param gm the player's new gamemode
     */
    void setGameMode(Gamemode gm);

}
