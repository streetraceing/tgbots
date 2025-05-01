package ru.streetraceing.types.response.base;

import ru.streetraceing.types.base.ChatType;

public class Chat {
    public long id;
    public ChatType type;
    public String title;
    public String username;
    public String first_name;
    public String last_name;
    public boolean is_forum;
}
