package com.chris.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * This is description.
 * 线程池参数配置类
 *
 * @author Chris Lee
 * @date 2019/7/13 20:43
 */
@Configuration
@ConfigurationProperties(prefix = "spring.task.pool")
@Data
public class TaskThreadPoolConfig {
    private Integer corePoolSize = 5;
    private Integer maxPoolSize = 50;
    private Integer keepAliveSeconds = 60;
    private Integer queueCapacity = 10000;
    private String threadNamePrefix = "Chris-AsyncTask";
}
