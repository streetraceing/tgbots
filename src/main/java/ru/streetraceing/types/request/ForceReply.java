package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class ForceReply extends Container {
    public ForceReply() {
        add("force_reply", true);
    }

    public ForceReply input_field_placeholder(String value) {
        add("input_field_placeholder", value);
        return this;
    }

    public ForceReply selective(boolean value) {
        add("selective", value);
        return this;
    }
}
