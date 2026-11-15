package com.example.evi.login.processor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.UUID;

public record LoginTrackingResultEvent(
        UUID customerId,
        String username,
        Client client,
        Instant timestamp,
        UUID messageId,
        String customerIp,
        @JsonProperty("request-result") RequestResult requestResult) {

    public static LoginTrackingResultEvent of(CustomerLoginEvent login, RequestResult result) {
        return new LoginTrackingResultEvent(
                login.customerId(), login.username(), login.client(),
                login.timestamp(), login.messageId(), login.customerIp(), result);
    }
}
