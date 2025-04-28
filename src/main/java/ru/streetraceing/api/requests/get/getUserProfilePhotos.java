package ru.streetraceing.api.requests.get;

import com.google.gson.reflect.TypeToken;
import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.response.result.getUserProfilePhotosResult;

public class getUserProfilePhotos extends TelegramRequest {
    @Override
    public TypeToken<getUserProfilePhotosResult> getResponseType() {
        return TypeToken.get(getUserProfilePhotosResult.class);
    }

    public getUserProfilePhotos offset(int content) {
        query("offset", content);
        return this;
    }

    public getUserProfilePhotos limit(int content) {
        query("limit", content);
        return this;
    }

    public getUserProfilePhotos user_id(long content) {
        query("user_id", content);
        return this;
    }
}
