package ru.streetraceing.types.request;

import ru.streetraceing.types.Json;
import ru.streetraceing.types.request.base.Container;

import java.util.ArrayList;
import java.util.List;

public class ReplyKeyboardMarkup extends Container {
    private final List<List<Object>> rows = new ArrayList<>();

    public ReplyKeyboardMarkup row(ReplyKeyboardRow value) {
        rows.add(value.buttons);
        return this;
    }

    public ReplyKeyboardMarkup is_persistent(boolean value) {
        add("is_persistent", value);
        return this;
    }

    public ReplyKeyboardMarkup resize_keyboard(boolean value) {
        add("resize_keyboard", value);
        return this;
    }

    public ReplyKeyboardMarkup one_time_keyboard(boolean value) {
        add("one_time_keyboard", value);
        return this;
    }

    public ReplyKeyboardMarkup input_field_placeholder(String value) {
        add("input_field_placeholder", value);
        return this;
    }

    public ReplyKeyboardMarkup selective(boolean value) {
        add("selective", value);
        return this;
    }

    public String toString() {
        add("keyboard", rows);
        return Json.parser.toJson(data);
    }
}