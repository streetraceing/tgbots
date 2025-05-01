package ru.streetraceing.types.response.base;

import ru.streetraceing.types.base.MessageEntityType;

public class MessageEntity {
    public MessageEntityType type;
    public Integer offset;
    public Integer length;
    public String url;
    public User user;
    public String language;
    public String custom_emoji_id;
}
