package ru.streetraceing.types.request;

import ru.streetraceing.types.base.ParseMode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputMediaVideo extends InputMedia {
    public InputMediaVideo () {
        add("type", "video");
    }

    public InputMediaVideo caption_entities(MessageEntity[] value) {
        add("caption_entities", Arrays.stream(value).map(MessageEntity::toMap).collect(Collectors.toList()));
        return this;
    }

    public InputMediaVideo media(String value) {
        add("media", value);
        return this;
    }

    public InputMediaVideo thumbnail(String value) {
        add("thumbnail", value);
        return this;
    }

    public InputMediaVideo cover(String value) {
        add("cover", value);
        return this;
    }

    public InputMediaVideo caption(String value) {
        add("caption", value);
        return this;
    }

    public InputMediaVideo parse_mode(ParseMode value) {
        add("parse_mode", value.name());
        return this;
    }

    public InputMediaVideo show_caption_above_media(boolean value) {
        add("show_caption_above_media", value);
        return this;
    }

    public InputMediaVideo start_timestamp(int value) {
        add("start_timestamp", value);
        return this;
    }

    public InputMediaVideo duration(int value) {
        add("duration", value);
        return this;
    }

    public InputMediaVideo width(int value) {
        add("width", value);
        return this;
    }

    public InputMediaVideo height(int value) {
        add("height", value);
        return this;
    }

    public InputMediaVideo has_spoiler(boolean value) {
        add("has_spoiler", value);
        return this;
    }

    public InputMediaVideo supports_streaming(boolean value) {
        add("supports_streaming", value);
        return this;
    }
}
