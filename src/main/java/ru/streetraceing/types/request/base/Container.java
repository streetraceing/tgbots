package ru.streetraceing.types.request.base;

import ru.streetraceing.types.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Container {
    protected final HashMap<String, Object> data = new HashMap<>();

    public void add(String name, Object value) {
        data.put(name, value);
    }

    public HashMap<String, Object> toMap() {
        return data;
    }

    public List<Object> objects() {
        return new ArrayList<>(data.values());
    }

    @Override
    public String toString() {
        return Json.parser.toJson(data);
    }
}
