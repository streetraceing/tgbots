package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendDocument extends TelegramRequest {
    public sendDocument caption(String value) {
        query("caption", value);
        return this;
    }

    public sendDocument caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendDocument document(String value) {
        query("document", value);
        return this;
    }

    public sendDocument thumbnail(String value) {
        query("thumbnail", value);
        return this;
    }

    // ----------

    public sendDocument business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendDocument chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendDocument chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendDocument message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendDocument reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendDocument reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendDocument reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendDocument reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendDocument reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendDocument disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendDocument protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendDocument allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendDocument message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
