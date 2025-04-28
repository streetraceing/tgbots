package ru.streetraceing.api.network;

import ru.streetraceing.api.events.Event;
import ru.streetraceing.api.events.EventList;
import ru.streetraceing.api.events.EventScheduler;
import ru.streetraceing.api.requests.get.*;
import ru.streetraceing.types.Json;
import ru.streetraceing.types.events.UpdateEvent;
import ru.streetraceing.types.response.ApiResponse;
import ru.streetraceing.types.response.result.*;

import java.util.function.Consumer;

public class Bot {
    protected String token;
    protected Longpolling longpolling;

    public Bot (String token) {
        this.token = token;
        this.longpolling = new Longpolling(this);
    }

    public <T extends ApiResponse> T sendRequest(TelegramRequest request) {
        request.build(token);

        String json_res = Requests.get(request);
        ApiResponse res = Json.request_response(json_res);

        if(!res.ok) {
            new TelegramException(res.error_code, res.description).printStackTrace();
        }
        if(request.getResponseType() != null) {
            return (T) Json.parser.fromJson(json_res, request.getResponseType());
        } else return null;
    }

    public getMeResult sendRequest(getMe request) {
        return sendRequest(request.getSource());
    }

    public getUpdatesResult sendRequest(getUpdates request) {
        return sendRequest(request.getSource());
    }

    public getUserProfilePhotosResult sendRequest(getUserProfilePhotos request) {
        return sendRequest(request.getSource());
    }

    public void onUpdate(Consumer<UpdateEvent> callback) {
        EventScheduler.register(this, new Event(EventList.UPDATE, callback));
    }
}
