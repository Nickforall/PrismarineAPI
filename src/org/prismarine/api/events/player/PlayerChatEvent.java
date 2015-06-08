package org.prismarine.api.events.player;

import org.prismarine.api.events.Cancellable;
import org.prismarine.api.players.Player;

public class PlayerChatEvent extends PlayerEvent implements Cancellable {

    private boolean cancel = false;
    private String message;

    public PlayerChatEvent(final Player player, final String msg) {
        super(player);
        this.message = msg;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void cancel() {
        this.cancel = true;
    }
}
