package ru.streetraceing.types.response.base;

public class ChatJoinRequest {
    public Chat chat;
    public User from;
    public Integer user_chat_id;
    public long date;
    public String bio;
    public ChatInviteLink invite_link;
}
