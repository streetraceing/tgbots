package ru.streetraceing.types.request;

import ru.streetraceing.types.base.ParseMode;
import ru.streetraceing.types.request.base.Container;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputPollOption extends Container {
    public InputPollOption text(String value) {
        add("text", value);
        return this;
    }

    public InputPollOption text_parse_mode(ParseMode value) {
        add("text_parse_mode", value.name());
        return this;
    }

    public InputPollOption text_entities(MessageEntity[] value) {
        add("text_entities", Arrays.stream(value).map(MessageEntity::toMap).collect(Collectors.toList()));
        return this;
    }
}
