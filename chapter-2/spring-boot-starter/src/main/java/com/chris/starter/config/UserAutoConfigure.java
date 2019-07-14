package com.chris.starter.config;

import com.chris.starter.client.UserClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/14 15:52
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {

    @Bean
    // @ConditionalOnProperty(prefix = "spring.user", value = "enabled", havingValue = "true")
    public UserClient userClient(UserProperties userProperties) {
        return new UserClient(userProperties);
    }
}
