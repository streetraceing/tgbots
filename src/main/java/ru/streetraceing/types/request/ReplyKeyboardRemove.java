package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class ReplyKeyboardRemove extends Container {
    public ReplyKeyboardRemove() {
        add("remove_keyboard", true);
    }

    public ReplyKeyboardRemove selective(boolean value) {
        add("selective", value);
        return this;
    }
}
