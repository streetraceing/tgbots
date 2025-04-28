package ru.streetraceing.api.events;

import ru.streetraceing.api.network.Bot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EventScheduler {
    private static final HashMap<Bot, List<Event>> events = new HashMap<>();

    public static void register(Bot instance, Event content) {
        List<Event> temp = events.get(instance);
        if(temp == null){
            events.put(instance, Arrays.stream(new Event[]{content}).toList());
        } else {
            temp.add(content);
            events.put(instance, temp);
        }
    }

    public static void push(Bot instance, EventList type, Object data) {
        List<Event> temp = events.get(instance);

        temp.stream().filter(e -> e.type == type).forEach(
                e -> {
                    try {
                        e.consumer.accept(data);
                    } catch (Exception err) { err.printStackTrace(); }
                }
        );
    }
}
