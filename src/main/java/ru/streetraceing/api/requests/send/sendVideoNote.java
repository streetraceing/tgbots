package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendVideoNote extends TelegramRequest {
    public sendVideoNote caption(String value) {
        query("caption", value);
        return this;
    }

    public sendVideoNote caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendVideoNote video_note(String value) {
        query("video_note", value);
        return this;
    }

    public sendVideoNote thumbnail(String value) {
        query("thumbnail", value);
        return this;
    }

    public sendVideoNote duration(int value) {
        query("duration", value);
        return this;
    }

    public sendVideoNote length(int value) {
        query("length", value);
        return this;
    }

    // ----------

    public sendVideoNote business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendVideoNote chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendVideoNote chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendVideoNote message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendVideoNote reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendVideoNote reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideoNote reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideoNote reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideoNote reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendVideoNote disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendVideoNote protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendVideoNote allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendVideoNote message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
