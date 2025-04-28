package ru.streetraceing.types.response.base;

import ru.streetraceing.types.response.RepliedMessage;

public class CallbackQuery {
    public String id;
    public User from;
    public RepliedMessage message;
    public String inline_message_id;
    public String chat_instance;
    public String data;
    public String game_short_name;
}
