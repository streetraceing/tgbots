package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class KeyboardButton extends Container {
    public KeyboardButton text(String value) {
        add("text", value);
        return this;
    }

    public KeyboardButton request_contact(boolean value) {
        add("request_contact", value);
        return this;
    }

    public KeyboardButton request_location(boolean value) {
        add("request_location", value);
        return this;
    }

    public KeyboardButton web_app(WebAppInfo value) {
        add("web_app", value.toMap());
        return this;
    }

    public KeyboardButton request_poll(KeyboardButtonPollType value) {
        add("request_poll", value.toMap());
        return this;
    }

    public KeyboardButton request_users(KeyboardButtonRequestUsers value) {
        add("request_users", value.toMap());
        return this;
    }

    public KeyboardButton request_chat(KeyboardButtonRequestChat value) {
        add("request_chat", value.toMap());
        return this;
    }
}
