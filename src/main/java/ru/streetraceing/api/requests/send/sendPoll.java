package ru.streetraceing.api.requests.send;

import ru.streetraceing.api.network.TelegramRequest;
import ru.streetraceing.types.base.ParseMode;
import ru.streetraceing.types.base.PollType;
import ru.streetraceing.types.request.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class sendPoll extends TelegramRequest {
    public sendPoll question(String value) {
        query("question", value);
        return this;
    }

    public sendPoll question_parse_mode(ParseMode value) {
        query("question_parse_mode", value.name());
        return this;
    }

    public sendPoll question_entities(MessageEntity[] value) {
        query("question_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendPoll options(InputPollOption[] value) {
        query("options", Arrays.stream(value).map(InputPollOption::toString).collect(Collectors.toList()));
        return this;
    }

    public sendPoll is_anonymous(boolean value) {
        query("is_anonymous", value);
        return this;
    }

    public sendPoll type(PollType value) {
        query("type", value.name());
        return this;
    }

    public sendPoll allows_multiple_answers(boolean value) {
        query("allows_multiple_answers", value);
        return this;
    }

    public sendPoll correct_option_id(int value) {
        query("correct_option_id", value);
        return this;
    }

    public sendPoll explanation(String value) {
        query("explanation", value);
        return this;
    }

    public sendPoll explanation_parse_mode(ParseMode value) {
        query("explanation_parse_mode", value.name());
        return this;
    }

    public sendPoll explanation_entities(MessageEntity[] value) {
        query("explanation_entities", Arrays.stream(value).map(MessageEntity::toString).collect(Collectors.toList()));
        return this;
    }

    public sendPoll open_period(int value) {
        query("open_period", value);
        return this;
    }

    public sendPoll close_date(int value) {
        query("close_date", value);
        return this;
    }

    public sendPoll is_closed(boolean value) {
        query("is_closed", value);
        return this;
    }

    // ----------

    public sendPoll business_connection_id(String value) {
        query("business_connection_id", value);
        return this;
    }

    public sendPoll chat_id(long value) {
        query("chat_id", value);
        return this;
    }

    public sendPoll chat_id(String value) {
        query("chat_id", value);
        return this;
    }

    public sendPoll message_thread_id(int value) {
        query("message_thread_id", value);
        return this;
    }

    public sendPoll reply_parameters(ReplyParameters value) {
        query("reply_parameters", value);
        return this;
    }

    public sendPoll reply_markup(InlineKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendPoll reply_markup(ReplyKeyboardMarkup value) {
        query("reply_markup", value);
        return this;
    }

    public sendPoll reply_markup(ReplyKeyboardRemove value) {
        query("reply_markup", value);
        return this;
    }

    public sendPoll reply_markup(ForceReply value) {
        query("reply_markup", value);
        return this;
    }

    public sendPoll disable_notification(boolean value) {
        query("disable_notification", value);
        return this;
    }

    public sendPoll protect_content(boolean value) {
        query("protect_content", value);
        return this;
    }

    public sendPoll allow_paid_broadcast(boolean value) {
        query("allow_paid_broadcast", value);
        return this;
    }

    public sendPoll message_effect_id(String value) {
        query("message_effect_id", value);
        return this;
    }
}
