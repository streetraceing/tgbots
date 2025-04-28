package ru.streetraceing.types.request;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputMediaPhoto extends InputMedia {
    public InputMediaPhoto () {
        add("type", "photo");
    }

    public InputMediaPhoto caption_entities(MessageEntity[] value) {
        add("caption_entities", Arrays.stream(value).map(MessageEntity::toMap).collect(Collectors.toList()));
        return this;
    }

    public InputMediaPhoto media(String value) {
        add("media", value);
        return this;
    }

    public InputMediaPhoto caption(String value) {
        add("caption", value);
        return this;
    }

    public InputMediaPhoto parse_mode(ParseMode value) {
        add("parse_mode", value.name());
        return this;
    }

    public InputMediaPhoto show_caption_above_media(boolean value) {
        add("show_caption_above_media", value);
        return this;
    }

    public InputMediaPhoto has_spoiler(boolean value) {
        add("has_spoiler", value);
        return this;
    }
}
