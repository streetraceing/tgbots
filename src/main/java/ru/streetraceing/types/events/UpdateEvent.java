package ru.streetraceing.types.events;

import ru.streetraceing.types.response.Update;

public class UpdateEvent {
    public Update update;

    public UpdateEvent(Update update) {
        this.update = update;
    }

    public boolean hasMessage() {
        return update.message != null;
    }

    public boolean hasEditedMessage() {
        return update.edited_message != null;
    }

    public boolean hasChannelPost() {
        return update.channel_post != null;
    }

    public boolean hasEditedChannelPost() {
        return update.edited_message != null;
    }

    public boolean hasMessageReaction() {
        return update.message_reaction != null;
    }

    public boolean hasInlineQuery() {
        return update.edited_business_message != null;
    }

    public boolean hasCallbackQuery() {
        return update.callback_query != null;
    }

    public boolean hasPoll() {
        return update.poll != null;
    }

    public boolean hasPollAnswer() {
        return update.poll_answer != null;
    }
}
