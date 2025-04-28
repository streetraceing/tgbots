package ru.streetraceing.types.request;

import ru.streetraceing.types.Json;
import ru.streetraceing.types.request.base.Container;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardMarkup extends Container {
    private final List<List<Object>> rows = new ArrayList<>();

    public InlineKeyboardMarkup row(InlineKeyboardRow value) {
        rows.add(value.buttons);
        return this;
    }

    public String toString() {
        add("inline_keyboard", rows);
        return Json.parser.toJson(data);
    }
}