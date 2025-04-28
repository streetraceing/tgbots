package ru.streetraceing.api.network;

public class TelegramException extends RuntimeException {
    public int error_code;
    public String description;

    public TelegramException(int error_code, String description) {
        super("[" + error_code + "] " + description);
        this.error_code = error_code;
        this.description = description;
    }
}
