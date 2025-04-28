package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class copyMessage extends TelegramRequest {
    public copyMessage business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public copyMessage from_chat_id(long value) {
        query("from_chat_id", value);
        return this;
    }

    public copyMessage from_chat_id(String value) {
        query("from_chat_id", value);
        return this;
    }

    public copyMessage chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public copyMessage chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public copyMessage message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public copyMessage video_start_timestamp(int value) {
        query("video_start_timestamp", value);
        return this;
    }

    public copyMessage text(String value) {
        query("text", value);
        return this;
    }

    public copyMessage parse_mode(ParseMode value) {
        query("parse_mode", value.name());
        return this;
    }

    public copyMessage caption_entities(MessageEntity[] value) {
        query("caption_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public copyMessage caption(String value) {
        query("caption", value);
        return this;
    }

    public copyMessage link_preview_options(LinkPreviewOptions value) {
        query("link_preview_options", value);
        return this;
    }

    public copyMessage disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public copyMessage protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public copyMessage allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public copyMessage show_caption_above_media(boolean value) {
        query("show_caption_above_media", value);
        return this;
    }

    public copyMessage message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }

    public copyMessage reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public copyMessage reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public copyMessage reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public copyMessage reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public copyMessage reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }
}
