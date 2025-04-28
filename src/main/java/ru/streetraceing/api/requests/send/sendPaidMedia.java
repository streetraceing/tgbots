package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendPaidMedia extends TelegramRequest {
    public sendPaidMedia caption(String value) {
        query("caption", value);
        return this;
    }

    public sendPaidMedia caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendPaidMedia payload(String value) {
        query("payload", value);
        return this;
    }

    public sendPaidMedia star_count(int value) {
        query("star_count", value);
        return this;
    }

    public sendPaidMedia media(InputPaidMedia[] value) {
        query("media", Arrays.stream(value).map(InputPaidMedia::toString).collect(Collectors.toList()));
        return this;
    }

    // ----------

    public sendPaidMedia business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendPaidMedia chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendPaidMedia chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendPaidMedia message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendPaidMedia reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendPaidMedia reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendPaidMedia reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendPaidMedia reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendPaidMedia reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendPaidMedia disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendPaidMedia protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendPaidMedia allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendPaidMedia message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
