package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class SwitchInlineQueryChosenChat extends Container {
    public SwitchInlineQueryChosenChat query(String value) {
        add("query", value);
        return this;
    }

    public SwitchInlineQueryChosenChat allow_user_chats(boolean value) {
        add("allow_user_chats", value);
        return this;
    }

    public SwitchInlineQueryChosenChat allow_bot_chats(boolean value) {
        add("allow_bot_chats", value);
        return this;
    }

    public SwitchInlineQueryChosenChat allow_group_chats(boolean value) {
        add("allow_group_chats", value);
        return this;
    }

    public SwitchInlineQueryChosenChat allow_channel_chats(boolean value) {
        add("allow_channel_chats", value);
        return this;
    }
}
