package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;

public class forwardMessage extends TelegramRequest {
    public forwardMessage chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public forwardMessage chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public forwardMessage message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public forwardMessage message_id(int value) {
        query("message_id", value);
        return this;
    }

    public forwardMessage from_chat_id(long value) {
        query("from_chat_id", value);
        return this;
    }

    public forwardMessage from_chat_id(String value) {
        query("from_chat_id", value);
        return this;
    }

    public forwardMessage video_start_timestamp(int value) {
        query("video_start_timestamp", value);
        return this;
    }

    public forwardMessage disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public forwardMessage protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }
}
