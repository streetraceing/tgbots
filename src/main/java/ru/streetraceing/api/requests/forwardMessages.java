package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.Json;

public class forwardMessages extends TelegramRequest {
    public forwardMessages chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public forwardMessages chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public forwardMessages message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public forwardMessages message_ids(int[] value) {
        query("message_ids", Json.parser.toJson(value));
        return this;
    }

    public forwardMessages from_chat_id(long value) {
        query("from_chat_id", value);
        return this;
    }

    public forwardMessages from_chat_id(String value) {
        query("from_chat_id", value);
        return this;
    }

    public forwardMessages video_start_timestamp(int value) {
        query("video_start_timestamp", value);
        return this;
    }

    public forwardMessages disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public forwardMessages protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }
}
