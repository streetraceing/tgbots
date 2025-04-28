package ru.streetraceing.types.response.base;

import java.util.List;

public class InputMediaAudio {
    public String type;
    public String media;
    public String thumbnail;
    public String caption;
    public String parse_mode;
    public List<MessageEntity> caption_entities;
    public Integer duration;
    public String performer;
    public String title;
}
