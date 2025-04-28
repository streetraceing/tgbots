package ru.streetraceing.api.events;

import java.util.function.Consumer;

public class Event {
    protected Consumer consumer;
    public EventList type;

    public Event (EventList type, Consumer consumer) {
        this.consumer = consumer;
        this.type = type;
    }
}
