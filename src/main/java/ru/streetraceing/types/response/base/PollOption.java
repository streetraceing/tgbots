package ru.streetraceing.types.response.base;

import java.util.List;

public class PollOption {
    public String text;
    public List<MessageEntity> text_entities;
    public Integer voter_count;
}
