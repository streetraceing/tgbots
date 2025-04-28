package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendVideo extends TelegramRequest {
    public sendVideo caption(String value) {
        query("caption", value);
        return this;
    }

    public sendVideo caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendVideo video(String value) {
        query("video", value);
        return this;
    }

    public sendVideo thumbnail(String value) {
        query("thumbnail", value);
        return this;
    }

    public sendVideo cover(String value) {
        query("cover", value);
        return this;
    }

    public sendVideo start_timestamp(int value) {
        query("start_timestamp", value);
        return this;
    }

    public sendVideo duration(int value) {
        query("duration", value);
        return this;
    }

    public sendVideo width(int value) {
        query("width", value);
        return this;
    }

    public sendVideo height(int value) {
        query("height", value);
        return this;
    }

    public sendVideo has_spoiler(boolean value) {
        query("has_spoiler", value);
        return this;
    }

    public sendVideo supports_streaming(boolean value) {
        query("supports_streaming", value);
        return this;
    }

    // ----------

    public sendVideo business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendVideo chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendVideo chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendVideo message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendVideo reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendVideo reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideo reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideo reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideo reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideo disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendVideo protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendVideo allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendVideo message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
