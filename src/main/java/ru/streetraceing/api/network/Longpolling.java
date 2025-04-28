package ru.streetraceing.api.network;

import ru.streetraceing.api.events.EventList;
import ru.streetraceing.api.events.EventScheduler;
import ru.streetraceing.api.requests.get.getUpdates;
import ru.streetraceing.types.events.UpdateEvent;
import ru.streetraceing.types.response.result.getUpdatesResult;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Longpolling {
    private final Bot instance;
    private Integer offset = 0;
    private Thread thread;
    private ScheduledExecutorService executor;

    public Longpolling(Bot instance) {
        this.instance = instance;
        start();
    }

    private void poll() {
        getUpdatesResult res = instance.sendRequest(new getUpdates().offset(offset));

        if(!res.ok) {
            new TelegramException(res.error_code, res.description).printStackTrace();
            stop();
        }

        if((res.result != null && !res.result.isEmpty())) {
            res.result.forEach(update -> {
                offset = update.update_id + 1;
                EventScheduler.push(instance, EventList.UPDATE, new UpdateEvent(update));
            });
        }
    }

    public void start() {
        thread = new Thread(() -> {
            executor = Executors.newScheduledThreadPool(3);
            executor.scheduleAtFixedRate(this::poll, 0L, 1L, TimeUnit.MILLISECONDS);
        });
        thread.start();
    }

    public void stop() {
        executor.shutdown();
        thread.interrupt();
    }
}
