package com.chris.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/14 15:47
 */
@Data
@ConfigurationProperties(prefix = "spring.user")
public class UserProperties {
    private String name;
}
