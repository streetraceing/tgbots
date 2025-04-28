package ru.streetraceing.types.request;

import ru.streetraceing.types.request.base.Container;

public class LinkPreviewOptions extends Container {
    public LinkPreviewOptions is_disabled(boolean value) {
        add("is_disabled", value);
        return this;
    }

    public LinkPreviewOptions prefer_small_media(boolean value) {
        add("prefer_small_media", value);
        return this;
    }

    public LinkPreviewOptions url(String value) {
        add("url", value);
        return this;
    }

    public LinkPreviewOptions prefer_large_media(boolean value) {
        add("prefer_large_media", value);
        return this;
    }

    public LinkPreviewOptions show_above_text(boolean value) {
        add("show_above_text", value);
        return this;
    }
}
