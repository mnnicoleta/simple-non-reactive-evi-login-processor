package com.example.evi.login.processor.model;

import java.time.Instant;
import java.util.UUID;

public record CustomerLoginEvent(
        UUID customerId,
        String username,
        Client client,
        Instant timestamp,
        UUID messageId,
        String customerIp) {
}