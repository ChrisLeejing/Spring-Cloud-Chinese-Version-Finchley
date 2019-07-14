package com.chris.example;

import com.chris.example.config.StartCommandConfig;
import com.chris.starter.client.EnableUserClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableUserClient
@EnableAsync
public class ExampleApplication {

    public static void main(String[] args) {
        // 启动参数设置, 如: 自动生成未占用的端口.
        // new StartCommandConfig(args);
        SpringApplication.run(ExampleApplication.class, args);
    }

}
