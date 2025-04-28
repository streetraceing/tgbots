package ru.streetraceing.types.request;

public enum DiceEmoji {
    dice ("🎲"),
    target ("\uD83C\uDFAF"),
    volleyball_ball ("\uD83C\uDFC0"),
    football ("⚽"),
    bowling ("\uD83C\uDFB3"),
    casino ("\uD83C\uDFB0");

    public final String emoji;

    DiceEmoji(String emoji) {
        this.emoji = emoji;
    }
}
