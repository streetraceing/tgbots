package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.base.ChatAction;

public class sendChatAction extends TelegramRequest {
    public sendChatAction action(ChatAction value) {
        query("action", value.name());
        return this;
    }

    public sendChatAction business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendChatAction chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendChatAction chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendChatAction message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }
}
