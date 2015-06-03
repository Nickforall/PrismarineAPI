package org.prismarine.api.events.player;

import org.prismarine.api.players.Player;

public class PlayerJoinEvent extends PlayerEvent {

    private String joinMessage;

    public PlayerJoinEvent(Player player, String joinMessage) {
        super(player);
        this.joinMessage = joinMessage;
    }

    /**
     * Sets the join message for this player's join
     *
     * @param msg The new join message.
     */
    public void setJoinMessage(String msg){
        this.joinMessage = msg;
    }

    /**
     * Gets the join message for this join
     *
     * @return The join message for this join
     */
    public String getJoinMessage(){
        return joinMessage;
    }

}
