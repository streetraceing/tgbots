package ru.streetraceing.types.request.base;

import ru.streetraceing.types.Json;

import java.util.HashMap;
import java.util.List;

public class Container {
    protected final HashMap<String, Object> data = new HashMap<>();

    public void add(String name, Object value) {
        data.put(name, value);
    }

    public HashMap<String, Object> toMap() {
        return data;
    }

    public List<Object> objects() {
        return data.values().stream().toList();
    }

    @Override
    public String toString() {
        return Json.parser.toJson(data);
    }
}
