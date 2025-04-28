package ru.streetraceing.api.requests.get;

import com.google.gson.reflect.TypeToken;
import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.Json;
import ru.streetraceing.types.response.result.getUpdatesResult;

public class getUpdates extends TelegramRequest {
    @Override
    public TypeToken<getUpdatesResult> getResponseType() {
        return TypeToken.get(getUpdatesResult.class);
    }

    public getUpdates offset(int content) {
        query("offset", content);
        return this;
    }

    public getUpdates limit(int content) {
        query("limit", content);
        return this;
    }

    public getUpdates timeout(int content) {
        query("timeout", content);
        return this;
    }

    public getUpdates allowed_updates(String[] value) {
        query("allowed_updates", Json.parser.toJson(value));
        return this;
    }
}
