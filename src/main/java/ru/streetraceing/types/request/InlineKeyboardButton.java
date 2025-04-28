package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class InlineKeyboardButton extends Container {
    public InlineKeyboardButton text(String value) {
        add("text", value);
        return this;
    }

    public InlineKeyboardButton url(String value) {
        add("url", value);
        return this;
    }

    public InlineKeyboardButton callback_data(String value) {
        add("callback_data", value);
        return this;
    }

    public InlineKeyboardButton switch_inline_query(String value) {
        add("switch_inline_query", value);
        return this;
    }

    public InlineKeyboardButton switch_inline_query_current_chat(String value) {
        add("switch_inline_query_current_chat", value);
        return this;
    }

    public InlineKeyboardButton pay(boolean value) {
        add("pay", value);
        return this;
    }

    public InlineKeyboardButton web_app(WebAppInfo value) {
        add("web_app", value.toMap());
        return this;
    }

    public InlineKeyboardButton login_url(LoginUrl value) {
        add("login_url", value.toMap());
        return this;
    }

    public InlineKeyboardButton copy_text(CopyTextButton value) {
        add("copy_text", value.toMap());
        return this;
    }

    public InlineKeyboardButton switch_inline_query_chosen_chat(SwitchInlineQueryChosenChat value) {
        add("switch_inline_query_chosen_chat", value.toMap());
        return this;
    }
}
