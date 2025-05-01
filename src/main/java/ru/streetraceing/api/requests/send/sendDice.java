package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.base.DiceEmoji;
import ru.streetraceing.types.request.*;

public class sendDice extends TelegramRequest {
    public sendDice emoji(DiceEmoji value) {
        query("emoji", value.emoji);
        return this;
    }

    // ----------

    public sendDice business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendDice chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendDice chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendDice message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendDice reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendDice reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendDice reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendDice reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendDice reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendDice disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendDice protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendDice allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendDice message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
