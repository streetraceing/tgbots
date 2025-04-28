package ru.streetraceing.types.response.base;

import ru.streetraceing.types.response.Message;

public class GiveawayCompleted {
    public Integer winner_count;
    public Integer unclaimed_prize_count;
    public Message giveaway_message;
    public boolean is_star_giveaway;
}
