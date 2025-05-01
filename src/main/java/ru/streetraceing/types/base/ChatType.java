package ru.streetraceing.types.base;

import com.google.gson.annotations.SerializedName;

public enum ChatType {
    @SerializedName("private")
    PRIVATE,

    @SerializedName("group")
    GROUP,

    @SerializedName("supergroup")
    SUPERGROUP,

    @SerializedName("channel")
    CHANNEL
}
