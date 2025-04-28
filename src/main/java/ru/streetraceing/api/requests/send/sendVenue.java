package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

public class sendVenue extends TelegramRequest {
    public sendVenue latitude(float value) {
        query("latitude", value);
        return this;
    }

    public sendVenue longitude(float value) {
        query("longitude", value);
        return this;
    }

    public sendVenue title(String value) {
        query("title", value);
        return this;
    }

    public sendVenue address(String value) {
        query("address", value);
        return this;
    }

    public sendVenue foursquare_id(String value) {
        query("foursquare_id", value);
        return this;
    }

    public sendVenue foursquare_type(String value) {
        query("foursquare_type", value);
        return this;
    }

    public sendVenue google_place_id(String value) {
        query("google_place_id", value);
        return this;
    }

    public sendVenue google_place_type(String value) {
        query("google_place_type", value);
        return this;
    }

    // ----------

    public sendVenue business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendVenue chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendVenue chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendVenue message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendVenue reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendVenue reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendVenue reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendVenue reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendVenue reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendVenue disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendVenue protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendVenue allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendVenue message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
