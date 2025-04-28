package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

import java.util.ArrayList;
import java.util.List;

public class ReplyKeyboardRow extends Container {
    protected final List<Object> buttons = new ArrayList<>();

    public ReplyKeyboardRow button(KeyboardButton value) {
        buttons.add(value.toMap());
        return this;
    }
}
