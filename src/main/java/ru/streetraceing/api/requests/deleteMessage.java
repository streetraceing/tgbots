package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;

public class deleteMessage extends TelegramRequest {
    public deleteMessage chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public deleteMessage chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public deleteMessage message_id(int value) {
        query("message_id", value);
        return this;
    }
}
