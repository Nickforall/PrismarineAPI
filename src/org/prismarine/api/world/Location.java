package org.prismarine.api.world;

public class Location {

    public double locX;
    public double locY;
    public double locZ;
    private float pitch;
    private float yaw;

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
        this.pitch = 0.0F;
        this.yaw = 0.0F;
    }
    
    public Location(double x, double y, double z, float pitch, float yaw){
        this.locX = x;
        this.locY = y;
        this.locZ = z;
        this.pitch = pitch;
        this.yaw = yaw;
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
     * Sets the X of this location.
     *
     * @param x new X of this location
     */
    public void setX(double x){
        this.locX = x;
    }

    /**
     * Sets the Y of this locaton.
     *
     * @param y new Y of this location
     */
    public void setY(double y){
        this.locY = y;
    }

    /**
     * Sets the Z of this locaton.
     *
     * @param z new Z of this location
     */
    public void setZ(double z){
        this.locZ = z;
    }
    
    /**
     * Gets the Pitch of this location.
     * 
     * @return Pitch of this location
     */
     public float getPitch(){
         return pitch;
     }
     
     /**
      * Sets the Pitch of this location.
      * 
      * @param pitch new Pitch of this location
      */
      public void setPitch(float pitch){
          this.pitch = pitch;
      }
      
       /**
     * Gets the Yaw of this location.
     * 
     * @return Yaw of this location
     */
     public float getYaw(){
         return Yaw;
     }
     
     /**
      * Sets the Yaw of this location.
      * 
      * @param pitch new Yaw of this location
      */
      public void setYaw(float yaw){
          this.yaw = yaw;
      }
    
}
