package ru.streetraceing.types.request;

import ru.streetraceing.types.base.MessageEntityType;
import ru.streetraceing.types.request.base.Container;

public class MessageEntity extends Container {
    public MessageEntity type(MessageEntityType value) {
        add("type", value.name());
        return this;
    }

    public MessageEntity offset(int value) {
        add("offset", value);
        return this;
    }

    public MessageEntity length(int value) {
        add("length", value);
        return this;
    }

    public MessageEntity url(String value) {
        add("url", value);
        return this;
    }

    public MessageEntity language(String value) {
        add("language", value);
        return this;
    }

    public MessageEntity custom_emoji_id(String value) {
        add("custom_emoji_id", value);
        return this;
    }

    public MessageEntity user(User value) {
        add("user", value.toMap());
        return this;
    }
}