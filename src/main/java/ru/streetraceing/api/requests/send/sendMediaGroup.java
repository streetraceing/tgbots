package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendMediaGroup extends TelegramRequest {
    public sendMediaGroup media(InputMedia[] value) {
        query("media", Arrays.stream(value).map(InputMedia::toString).collect(Collectors.toList()));
        return this;
    }

    // ----------

    public sendMediaGroup business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendMediaGroup chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendMediaGroup chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendMediaGroup message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendMediaGroup reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendMediaGroup reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendMediaGroup reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendMediaGroup reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendMediaGroup reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendMediaGroup disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendMediaGroup protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendMediaGroup allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendMediaGroup message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
