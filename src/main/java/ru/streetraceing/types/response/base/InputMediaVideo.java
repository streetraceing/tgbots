package ru.streetraceing.types.response.base;

import java.util.List;

public class InputMediaVideo {
    public String type;
    public String media;
    public String thumbnail;
    public String cover;
    public Integer start_timestamp;
    public String caption;
    public String parse_mode;
    public List<MessageEntity> caption_entities;
    public boolean show_caption_above_media;
    public Integer width;
    public Integer height;
    public Integer duration;
    public boolean supports_streaming;
    public boolean has_spoiler;
}
