package com.chris.starter.controller;

import com.chris.starter.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/14 16:02
 */
@RestController

public class UserController {
    @Autowired
    private UserClient userClient;

    @GetMapping("/user/name")
    public String getName() {
        System.out.println("-----------------");
        System.out.println("Hello, world!");
        return userClient.getName();
    }
}
