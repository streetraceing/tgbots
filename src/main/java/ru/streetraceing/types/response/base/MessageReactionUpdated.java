package ru.streetraceing.types.response.base;

import java.util.List;

public class MessageReactionUpdated {
    public Chat chat;
    public Integer message_id;
    public User user;
    public Chat actor_chat;
    public long date;
    public List<ReactionType> old_reaction;
    public List<ReactionType> new_reaction;
}
