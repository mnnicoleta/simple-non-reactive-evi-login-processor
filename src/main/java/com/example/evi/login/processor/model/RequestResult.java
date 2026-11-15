package com.example.evi.login.processor.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Locale;

public enum RequestResult {
    SUCCESSFUL, UNSUCCESSFUL;

    @JsonValue
    public String value() {
        return name().toLowerCase(Locale.ROOT);
    }

    @JsonCreator
    public static RequestResult fromValue(String value) {
        return RequestResult.valueOf(value.trim().toUpperCase(Locale.ROOT));
    }
}
