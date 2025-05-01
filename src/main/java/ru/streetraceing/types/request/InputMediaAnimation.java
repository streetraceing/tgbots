package ru.streetraceing.types.request;

import ru.streetraceing.types.base.ParseMode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputMediaAnimation extends InputMedia {
    public InputMediaAnimation() {
        add("type", "animation");
    }

    public InputMediaAnimation caption_entities(MessageEntity[] value) {
        add("caption_entities", Arrays.stream(value).map(MessageEntity::toMap).collect(Collectors.toList()));
        return this;
    }

    public InputMediaAnimation duration(int value) {
        add("duration", value);
        return this;
    }

    public InputMediaAnimation width(int value) {
        add("width", value);
        return this;
    }

    public InputMediaAnimation height(int value) {
        add("height", value);
        return this;
    }

    public InputMediaAnimation media(String value) {
        add("media", value);
        return this;
    }

    public InputMediaAnimation caption(String value) {
        add("caption", value);
        return this;
    }

    public InputMediaAnimation parse_mode(ParseMode value) {
        add("parse_mode", value.name());
        return this;
    }

    public InputMediaAnimation show_caption_above_media(boolean value) {
        add("show_caption_above_media", value);
        return this;
    }

    public InputMediaAnimation has_spoiler(boolean value) {
        add("has_spoiler", value);
        return this;
    }
}
