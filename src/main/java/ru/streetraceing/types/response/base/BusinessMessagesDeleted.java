package ru.streetraceing.types.response.base;

import java.util.List;

public class BusinessMessagesDeleted {
    public String business_connection_id;
    public Chat chat;
    public List<Integer> message_ids;
}
