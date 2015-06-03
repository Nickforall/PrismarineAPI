package org.prismarine.api.events;

public interface EventListener<E extends Event> {

    public void onEvent(E event);

}
