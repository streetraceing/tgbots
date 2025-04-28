package ru.streetraceing.types.response.base;

import java.util.List;

public class InlineQueryResultCachedVideo {
    public String type;
    public String id;
    public String video_file_id;
    public String title;
    public String description;
    public String caption;
    public String parse_mode;
    public List<MessageEntity> caption_entities;
    public boolean show_caption_above_media;
    public InlineKeyboardMarkup reply_markup;
    public InputMessageContent input_message_content;
}
