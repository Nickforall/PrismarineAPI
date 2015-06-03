package org.prismarine.api.events;

public interface Cancellable {
    /**
     * Gets if an event is being cancelled.
     *
     * @return Whether an event is cancelled
     */
    public boolean isCancelled();

    /**
     * Cancels an event
     */
    public void cancel();
}
