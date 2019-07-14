package com.chris.starter.client;

import com.chris.starter.config.UserProperties;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/14 15:49
 */
public class UserClient {
    private UserProperties userProperties;

    public String getName() {
        return userProperties.getName();
    }
    public UserClient(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

    public UserClient() {
    }
}
