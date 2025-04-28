package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendAnimation extends TelegramRequest {
    public sendAnimation caption(String value) {
        query("caption", value);
        return this;
    }

    public sendAnimation caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendAnimation animation(String value) {
        query("animation", value);
        return this;
    }

    public sendAnimation thumbnail(String value) {
        query("thumbnail", value);
        return this;
    }

    public sendAnimation duration(int value) {
        query("duration", value);
        return this;
    }

    public sendAnimation width(int value) {
        query("width", value);
        return this;
    }

    public sendAnimation height(int value) {
        query("height", value);
        return this;
    }

    // ----------

    public sendAnimation business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendAnimation chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendAnimation chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendAnimation message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendAnimation reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendAnimation reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendAnimation reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendAnimation reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendAnimation reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendAnimation disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendAnimation protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendAnimation allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendAnimation message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
