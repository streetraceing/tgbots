package ru.streetraceing.types.response.base;

import java.util.List;

public class MessageReactionCountUpdated {
    public Chat chat;
    public Integer message_id;
    public long date;
    public List<ReactionCount> reactions;
}
