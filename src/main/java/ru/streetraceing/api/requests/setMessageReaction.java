package ru.streetraceing.api.requests;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.request.ReactionType;

public class setMessageReaction extends TelegramRequest {
    public setMessageReaction chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public setMessageReaction chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public setMessageReaction message_id(int value) {
        query("message_id", value);
        return this;
    }

    public setMessageReaction is_big(boolean value) {
        query("is_big", value);
        return this;
    }

    public setMessageReaction reaction(ReactionType value) {
        query("reaction", value);
        return this;
    }
}
