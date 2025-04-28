package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class KeyboardButtonPollType extends Container {
    public KeyboardButtonPollType(String type) {
        add("type", type);
    }
}
