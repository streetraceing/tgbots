package ru.streetraceing.types.request;

import ru.streetraceing.types.Json;
import ru.streetraceing.types.request.base.Container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReactionType extends Container {
    private final List<HashMap<String, Object>> emojies = new ArrayList<>();

    public ReactionType emoji(String value) {
        HashMap<String, Object> res = new HashMap<>();
        res.put("type", "emoji");
        res.put("emoji", value);
        emojies.add(res);
        return this;
    }

    public ReactionType custom_emoji(String value) {
        HashMap<String, Object> res = new HashMap<>();
        res.put("type", "emoji");
        res.put("custom_emoji_id", value);
        emojies.add(res);
        return this;
    }

    @Override
    public String toString() {
        return Json.parser.toJson(emojies);
    }
}