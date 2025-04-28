package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class ChatAdministratorRights extends Container {
    public ChatAdministratorRights is_anonymous(boolean value) {
        add("is_anonymous", value);
        return this;
    }

    public ChatAdministratorRights can_manage_chat(boolean value) {
        add("can_manage_chat", value);
        return this;
    }

    public ChatAdministratorRights can_delete_messages(boolean value) {
        add("can_delete_messages", value);
        return this;
    }

    public ChatAdministratorRights can_manage_video_chats(boolean value) {
        add("can_manage_video_chats", value);
        return this;
    }

    public ChatAdministratorRights can_restrict_members(boolean value) {
        add("can_restrict_members", value);
        return this;
    }

    public ChatAdministratorRights can_promote_members(boolean value) {
        add("can_promote_members", value);
        return this;
    }

    public ChatAdministratorRights can_change_info(boolean value) {
        add("can_change_info", value);
        return this;
    }

    public ChatAdministratorRights can_invite_users(boolean value) {
        add("can_invite_users", value);
        return this;
    }

    public ChatAdministratorRights can_post_stories(boolean value) {
        add("can_post_stories", value);
        return this;
    }

    public ChatAdministratorRights can_edit_stories(boolean value) {
        add("can_edit_stories", value);
        return this;
    }

    public ChatAdministratorRights can_manage_topics(boolean value) {
        add("can_manage_topics", value);
        return this;
    }

    public ChatAdministratorRights can_pin_messages(boolean value) {
        add("can_pin_messages", value);
        return this;
    }

    public ChatAdministratorRights can_edit_messages(boolean value) {
        add("can_edit_messages", value);
        return this;
    }

    public ChatAdministratorRights can_post_messages(boolean value) {
        add("can_post_messages", value);
        return this;
    }

    public ChatAdministratorRights can_delete_stories(boolean value) {
        add("can_delete_stories", value);
        return this;
    }
}
