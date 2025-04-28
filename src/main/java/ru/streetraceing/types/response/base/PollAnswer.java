package ru.streetraceing.types.response.base;

import java.util.List;

public class PollAnswer {
    public String poll_id;
    public Chat voter_chat;
    public User user;
    public List<Integer> option_ids;
}
