package ru.streetraceing.types.request;

public class InputPaidMediaPhoto extends InputPaidMedia {
    public InputPaidMediaPhoto(String media) {
        add("type", "photo");
        add("media", media);
    }
}
