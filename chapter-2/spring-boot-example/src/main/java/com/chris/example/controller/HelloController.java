package com.chris.example.controller;

import com.chris.example.config.PropertyConfig;
import com.chris.example.service.HelloService;
import com.chris.starter.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 18:27
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @Autowired
    private Environment environment;

    @GetMapping("/property")
    public String property() {
        String port = environment.getProperty("server.port");
        return port;
    }

    @Value("${server.port}")
    private String property2;

    @GetMapping("/property2")
    public String property2() {
        return property2;
    }

    @Autowired
    private PropertyConfig property3;

    @GetMapping("/property3")
    public String property3() {
        return property3.getName() +"0710123";
    }

    @GetMapping("/async")
    public void async() {
        helloService.async();
    }

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/name")
    public String getName() {
        return userClient.getName();
    }
}
