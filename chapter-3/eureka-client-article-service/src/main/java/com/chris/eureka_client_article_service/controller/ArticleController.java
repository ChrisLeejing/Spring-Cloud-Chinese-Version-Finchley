package com.chris.eureka_client_article_service.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/21 10:00
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private EurekaClient eurekaClient;

    @GetMapping("/callHello")
    public String callHello() {
        // return restTemplate.getForObject("http://localhost:8081/user/hello", String.class);
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);
    }

    @RequestMapping("/infos")
    public Object serviceUrl() {
        return eurekaClient.getInstancesByVipAddress("eureka-client-user-service", false);
    }

}
