package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

public class sendLocation extends TelegramRequest {
    public sendLocation latitude(float value) {
        query("latitude", value);
        return this;
    }

    public sendLocation longitude(float value) {
        query("longitude", value);
        return this;
    }

    public sendLocation horizontal_accuracy(float value) {
        query("horizontal_accuracy", value);
        return this;
    }

    public sendLocation live_period(int value) {
        query("live_period", value);
        return this;
    }

    public sendLocation heading(int value) {
        query("heading", value);
        return this;
    }

    public sendLocation proximity_alert_radius(int value) {
        query("proximity_alert_radius", value);
        return this;
    }

    // ----------

    public sendLocation business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendLocation chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendLocation chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendLocation message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendLocation reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendLocation reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendLocation reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendLocation reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendLocation reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendLocation disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendLocation protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendLocation allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendLocation message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
