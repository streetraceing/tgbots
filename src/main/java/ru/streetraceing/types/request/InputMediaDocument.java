package ru.streetraceing.types.request;

import ru.streetraceing.types.base.ParseMode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputMediaDocument extends InputMedia {
    public InputMediaDocument() {
        add("type", "document");
    }

    public InputMediaDocument caption_entities(MessageEntity[] value) {
        add("caption_entities", Arrays.stream(value).map(MessageEntity::toMap).collect(Collectors.toList()));
        return this;
    }

    public InputMediaDocument media(String value) {
        add("media", value);
        return this;
    }

    public InputMediaDocument caption(String value) {
        add("caption", value);
        return this;
    }

    public InputMediaDocument parse_mode(ParseMode value) {
        add("parse_mode", value.name());
        return this;
    }

    public InputMediaDocument thumbnail(String value) {
        add("thumbnail", value);
        return this;
    }

    public InputMediaDocument disable_content_type_detection(boolean value) {
        add("disable_content_type_detection", value);
        return this;
    }
}
