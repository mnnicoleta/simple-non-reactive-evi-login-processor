package com.example.evi.login.processor.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;

public enum Client {
    WEB, ANDROID, IOS;

    @JsonValue
    public String value() {
        return name().toLowerCase(Locale.ROOT);
    }

    @JsonCreator
    public static Client fromValue(String value) {
        return Client.valueOf(value.trim().toUpperCase(Locale.ROOT));
    }
}