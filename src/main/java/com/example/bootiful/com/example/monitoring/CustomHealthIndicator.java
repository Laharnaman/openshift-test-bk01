package com.example.bootiful.com.example.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        return Health.status("Doing fine thanks!").build();
    }
}
