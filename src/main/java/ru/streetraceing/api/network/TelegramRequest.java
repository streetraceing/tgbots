package ru.streetraceing.api.network;

import com.google.gson.reflect.TypeToken;
import ru.streetraceing.utils.Enviroment;

public class TelegramRequest extends HttpRequest {
    public TelegramRequest(String token, String method) {
        super(Enviroment.TELEGRAM_API_HOST);
        path("bot" + token);
        path(method);
    }

    public TelegramRequest(String token) {
        super(Enviroment.TELEGRAM_API_HOST);
        path("bot" + token);
        path(this.getClass().getSimpleName());
    }

    public TelegramRequest() {
        super(Enviroment.TELEGRAM_API_HOST);
        path("bot...");
        path(this.getClass().getSimpleName());
    }

    protected TelegramRequest build(String token) {
        replace_in_path("bot" + token, 1);
        return this;
    }

    protected TelegramRequest getSource() {
        return this;
    }

    protected TypeToken getResponseType() {
        return null;
    }
}
