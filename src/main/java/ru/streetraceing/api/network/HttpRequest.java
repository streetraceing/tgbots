package ru.streetraceing.api.network;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class HttpRequest {
    private final List<String> path_entries = new ArrayList<>();
    private final HashMap<String, Object> query_entries = new HashMap<>();

    public HttpRequest (String host) {
        path("https://" + host);
    }

    protected HttpRequest path(String value) {
        path_entries.add(value);
        return this;
    }

    protected HttpRequest path(String value, int index) {
        path_entries.add(index, value);
        return this;
    }

    protected HttpRequest replace_in_path(String value, int index) {
        path_entries.remove(index);
        path_entries.add(index, value);
        return this;
    }

    protected HttpRequest query(String key, Object content) {
        query_entries.put(key, content);
        return this;
    }

    @Override
    public String toString() {
        String res = String.join("/", path_entries);
        if(!query_entries.isEmpty()) {
            res +=  "?";
            res +=  query_entries.entrySet()
                    .stream()
                    .map(e -> e.getKey()+"="+e.getValue())
                    .collect(Collectors.joining("&"));
        }
        return res;
    }
}
