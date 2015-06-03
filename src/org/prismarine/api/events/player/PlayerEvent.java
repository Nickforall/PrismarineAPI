package org.prismarine.api.events.player;

import org.prismarine.api.events.Event;
import org.prismarine.api.players.Player;

public abstract class PlayerEvent extends Event{

    private final Player player;

    public PlayerEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }
}
