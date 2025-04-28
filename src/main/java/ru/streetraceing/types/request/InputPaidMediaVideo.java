package ru.streetraceing.types.request;

public class InputPaidMediaVideo extends InputPaidMedia {
    public InputPaidMediaVideo(String media) {
        add("type", "photo");
        add("media", media);
    }

    public InputPaidMediaVideo thumbnail(String value) {
        add("thumbnail", value);
        return this;
    }

    public InputPaidMediaVideo cover(String value) {
        add("cover", value);
        return this;
    }

    public InputPaidMediaVideo start_timestamp(int value) {
        add("start_timestamp", value);
        return this;
    }

    public InputPaidMediaVideo width(int value) {
        add("width", value);
        return this;
    }

    public InputPaidMediaVideo height(int value) {
        add("height", value);
        return this;
    }

    public InputPaidMediaVideo duration(int value) {
        add("duration", value);
        return this;
    }

    public InputPaidMediaVideo supports_streaming(boolean value) {
        add("supports_streaming", value);
        return this;
    }
}
