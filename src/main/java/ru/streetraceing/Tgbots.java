package ru.streetraceing;

import ru.streetraceing.api.network.Bot;

public class Tgbots {
    public static Bot createBot(String token) {
        return new Bot(token);
    }
}