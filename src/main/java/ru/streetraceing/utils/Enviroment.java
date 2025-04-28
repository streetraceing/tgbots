package ru.streetraceing.utils;

public class Enviroment {
    public static String TELEGRAM_API_HOST = "api.telegram.org";

    public static String get(String var) {
        return System.getenv(var);
    }

    public static String token() {
        return get("BOT_TOKEN");
    }
}
