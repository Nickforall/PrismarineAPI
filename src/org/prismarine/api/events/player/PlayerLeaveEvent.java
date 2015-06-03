package org.prismarine.api.events.player;

import org.prismarine.api.players.Player;

public class PlayerLeaveEvent extends PlayerEvent{

    private String leaveMessage;

    public PlayerLeaveEvent(Player player, String joinMessage) {
        super(player);
        this.leaveMessage = joinMessage;
    }

    /**
     * Sets the join message for this player's join
     *
     * @param msg The new join message.
     */
    public void setLeaveMessage(String msg){
        this.leaveMessage = msg;
    }

    /**
     * Gets the join message for this join
     *
     * @return The join message for this join
     */
    public String getLeaveMessage() {
        return leaveMessage;
    }
}
