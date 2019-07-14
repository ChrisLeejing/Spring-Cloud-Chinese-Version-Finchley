package com.chris.example.config;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 19:45
 */
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.up().withDetail("status", true);
    }
}
