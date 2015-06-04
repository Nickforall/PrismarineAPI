package org.prismarine.api.world;

public class Location {

    public double locX;
    public double locY;
    public double locZ;

    /**
     * Creates a new Location.
     *
     * @param x X-coord
     * @param y Y-coord
     * @param z Z-coord
     */
    public Location(double x, double y, double z){
        this.locX = x;
        this.locY = y;
        this.locZ = z;
    }

    /**
     * Gets the X of this location.
     *
     * @return X of this location
     */
    public double getX(){
        return locX;
    }

    /**
     * Gets the Y of this location.
     *
     * @return Y of this location
     */
    public double getY(){
        return locY;
    }

    /**
     * Gets the Z of this location.
     *
     * @return Z of this location
     */
    public double getZ(){
        return locZ;
    }

    /**
     * Sets the X of this locaton.
     *
     * @param x new X of this locaton
     */
    public void setX(double x){
        this.locX = x;
    }

    /**
     * Sets the Y of this locaton.
     *
     * @param y new Y of this locaton
     */
    public void setY(double y){
        this.locY = y;
    }

    /**
     * Sets the Z of this locaton.
     *
     * @param z new Z of this locaton
     */
    public void setZ(double z){
        this.locZ = z;
    }
}
