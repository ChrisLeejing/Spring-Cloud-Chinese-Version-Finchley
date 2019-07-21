package com.chris.eureka_client_user_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/21 9:51
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, world! The server port is: " + port;
    }
}
