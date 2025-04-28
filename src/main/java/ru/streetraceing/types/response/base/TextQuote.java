package ru.streetraceing.types.response.base;

import java.util.List;

public class TextQuote {
    public String text;
    public List<MessageEntity> entities;
    public Integer position;
    public boolean is_manual;
}
