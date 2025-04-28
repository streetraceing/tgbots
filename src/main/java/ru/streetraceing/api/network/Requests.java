package ru.streetraceing.api.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Requests {
    public static String get(String request) {
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(request);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            BufferedReader reader;

            if(connection.getResponseCode() == 200) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                reader.lines().forEach(response::append);
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            reader.lines().forEach(response::append);

            return response.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public static String get(HttpRequest request) {
        return get(request.toString());
    }
}
