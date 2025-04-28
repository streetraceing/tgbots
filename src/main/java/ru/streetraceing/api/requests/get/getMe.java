package ru.streetraceing.api.requests.get;

import com.google.gson.reflect.TypeToken;
import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.response.result.getMeResult;

public class getMe extends TelegramRequest {
    @Override
    public TypeToken<getMeResult> getResponseType() {
        return TypeToken.get(getMeResult.class);
    }
}
