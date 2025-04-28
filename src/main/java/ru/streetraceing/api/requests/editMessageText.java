package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.InlineKeyboardMarkup;
import ru.streetraceing.types.request.LinkPreviewOptions;
import ru.streetraceing.types.request.MessageEntity;
import ru.streetraceing.types.request.ParseMode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class editMessageText extends TelegramRequest {
    public editMessageText business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public editMessageText chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public editMessageText chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public editMessageText message_id(int value) {
        query("message_id", value);
        return this;
    }

    public editMessageText inline_message_id(String value) {
        query("inline_message_id", value);
        return this;
    }

    public editMessageText text(String value) {
        query("text", value);
        return this;
    }

    public editMessageText parse_mode(ParseMode value) {
        query("parse_mode", value.name());
        return this;
    }

    public editMessageText entities(MessageEntity[] value) {
        query("entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public editMessageText link_preview_options(LinkPreviewOptions value) {
        query("link_preview_options", value);
        return this;
    }

    public editMessageText reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }
}
