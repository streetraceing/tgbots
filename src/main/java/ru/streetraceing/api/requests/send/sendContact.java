package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

public class sendContact extends TelegramRequest {
    public sendContact phone_number(String value) {
        query("phone_number", value);
        return this;
    }

    public sendContact first_name(String value) {
        query("first_name", value);
        return this;
    }

    public sendContact last_name(String value) {
        query("last_name", value);
        return this;
    }

    public sendContact vcard(String value) {
        query("vcard", value);
        return this;
    }

    // ----------

    public sendContact business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendContact chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendContact chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendContact message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendContact reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendContact reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendContact reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendContact reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendContact reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendContact disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendContact protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendContact allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendContact message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
