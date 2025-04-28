package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class CopyTextButton extends Container {
    public CopyTextButton text(String content) {
        add("text", content);
        return this;
    }
}
