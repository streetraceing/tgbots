package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.Json;

public class copyMessages extends TelegramRequest {
    public copyMessages chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public copyMessages chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public copyMessages from_chat_id(long value) {
        query("from_chat_id", value);
        return this;
    }

    public copyMessages from_chat_id(String value) {
        query("from_chat_id", value);
        return this;
    }

    public copyMessages message_ids(int[] value) {
        query("message_ids", Json.parser.toJson(value));
        return this;
    }

    public copyMessages message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public copyMessages disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public copyMessages protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public copyMessages remove_caption(boolean value) {
        query("remove_caption", value);
        return this;
    }
}
