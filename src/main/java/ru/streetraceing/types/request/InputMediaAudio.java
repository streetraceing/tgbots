package ru.streetraceing.types.request;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputMediaAudio extends InputMedia {
    public InputMediaAudio() {
        add("type", "audio");
    }

    public InputMediaAudio caption_entities(MessageEntity[] value) {
        add("caption_entities", Arrays.stream(value).map(MessageEntity::toMap).collect(Collectors.toList()));
        return this;
    }

    public InputMediaAudio media(String value) {
        add("media", value);
        return this;
    }

    public InputMediaAudio performer(String value) {
        add("performer", value);
        return this;
    }

    public InputMediaAudio title(String value) {
        add("title", value);
        return this;
    }

    public InputMediaAudio duration(int value) {
        add("duration", value);
        return this;
    }

    public InputMediaAudio thumbnail(String value) {
        add("thumbnail", value);
        return this;
    }

    public InputMediaAudio caption(String value) {
        add("caption", value);
        return this;
    }

    public InputMediaAudio parse_mode(ParseMode value) {
        add("parse_mode", value.name());
        return this;
    }
}
