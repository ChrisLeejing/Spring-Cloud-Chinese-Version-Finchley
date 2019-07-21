package com.chris.eureka_client_article_service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/21 9:57
 */
@Configuration
public class BeanConfiguration {

    /**
     * RestTemplate: 提供多种远程HTTP服务的方法
     * LoadBalanced:
     * Hello, world! The server port is: 8081
     * Hello, world! The server port is: 8080
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
