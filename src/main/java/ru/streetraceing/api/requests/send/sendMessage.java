package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.base.ParseMode;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendMessage extends TelegramRequest {
    public sendMessage business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendMessage chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendMessage chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendMessage message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendMessage text(String value) {
        query("text", value);
        return this;
    }

    public sendMessage parse_mode(ParseMode value) {
        query("parse_mode", value.name());
        return this;
    }

    public sendMessage entities(MessageEntity[] value) {
        query("entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendMessage link_preview_options(LinkPreviewOptions value) {
        query("link_preview_options", value);
        return this;
    }

    public sendMessage disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendMessage protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendMessage allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendMessage message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }

    public sendMessage reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendMessage reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendMessage reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendMessage reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendMessage reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }
}
