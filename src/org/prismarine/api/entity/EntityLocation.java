package org.prismarine.api.entity;

import org.prismarine.api.world.Location;

public class EntityLocation extends Location{

    public float pitch;
    public float yaw;

    /**
     * Creates a new Entity Location.
     *
     * @param x X-coord
     * @param y Y-coord
     * @param z Z-coord
     * @param p Pitch
     * @param yaw Yaw
     */
    public EntityLocation(double x, double y, double z, float p, float yaw) {
        super(x, y, z);
        this.pitch = p;
        this.yaw = yaw;
    }

    /**
     * Creates a new Entity Location.
     *
     * @param x X-coord
     * @param y Y-coord
     * @param z Z-coord
     */
    public EntityLocation(double x, double y, double z) {
        super(x, y, z);
        this.pitch = 0;
        this.yaw = 0;
    }

    /**
     * Sets the entity's angle of looking up/down.
     *
     * @param p new pitch
     */
    public void setPitch(float p){
        this.pitch = p;
    }

    /**
     * Sets the entity's rotation around the y-axis.
     *
     * @param y new rotation (yaw)
     */
    public void setYaw(float y){
        this.yaw = y;
    }

    /**
     * Gets the entity's current pitch.
     *
     * @return the entity's current pitch
     */
    public float getPitch(){
        return this.pitch;
    }

    /**
     * Gets the entity's current yaw.
     *
     * @return the entity's current yaw
     */
    public float getYaw(){
       return this.yaw;
    }
}
