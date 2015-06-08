package org.prismarine.api.entity;

public interface LivingEntity extends Entity {

    /**
     * Sets if the Entity is invulnerable to damage
     *
     * @param invulnerable Whether the Entity is invulnerable to all forms of damage
     */
    void setInvulnerable(boolean invulnerable);

    /**
     * Gets if the Entity is invulnerable to damage
     */
    boolean isInvulnerable();

    /**
     * Gets the amount of health the Entity has
     *
     * @return Returns the amount of health the Entity has
     */
    float getHealth();

    /**
     * Sets the amount of health the Entity has
     *
     * @param health The amount of health the Entity has
     */
    void setHealth(float health);

    /**
     * Damage the Entity
     *
     * @param damage The amount of damage to inflict
     */
    void damage(float damage);

    /**
     * Sets the max amount of health the Entity can have
     *
     * @param maxHealth The max amount of health this Entity can have
     */
    void setMaxHealth(float maxHealth);

    /**
     * Gest the max amount of health the Entity can have
     *
     * @return Returns the max amount of health this Entity can have
     */
    float getMaxHealth();
}
