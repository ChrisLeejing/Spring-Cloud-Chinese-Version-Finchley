package com.chris.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 18:40
 */
@ConfigurationProperties(prefix = "com.chris")
@Component
@Data
public class PropertyConfig {
    private String name;
}
