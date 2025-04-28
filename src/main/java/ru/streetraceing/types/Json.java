package ru.streetraceing.types;

import com.google.gson.Gson;
import ru.streetraceing.types.response.result.getUpdatesResult;
import ru.streetraceing.types.response.ApiResponse;

public class Json {
    public static final Gson parser = new Gson();

    public static getUpdatesResult updates(String json) {
        return parser.fromJson(json, getUpdatesResult.class);
    }

    public static ApiResponse request_response(String json) {
        return parser.fromJson(json, ApiResponse.class);
    }
}
