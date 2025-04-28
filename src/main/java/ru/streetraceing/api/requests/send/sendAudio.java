package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendAudio extends TelegramRequest {
    public sendAudio caption(String value) {
        query("caption", value);
        return this;
    }

    public sendAudio caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendAudio audio(String value) {
        query("audio", value);
        return this;
    }

    public sendAudio duration(int value) {
        query("duration", value);
        return this;
    }

    public sendAudio performer(String value) {
        query("performer", value);
        return this;
    }

    public sendAudio title(String value) {
        query("title", value);
        return this;
    }

    public sendAudio thumbnail(String value) {
        query("thumbnail", value);
        return this;
    }

    // ----------

    public sendAudio business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendAudio chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendAudio chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendAudio message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendAudio reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendAudio reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendAudio reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendAudio reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendAudio reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendAudio disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendAudio protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendAudio allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendAudio message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
