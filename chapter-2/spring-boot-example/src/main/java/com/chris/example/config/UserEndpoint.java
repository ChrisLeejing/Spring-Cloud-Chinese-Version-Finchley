package com.chris.example.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 19:49
 */
@Component
@Endpoint(id = "user")
public class UserEndpoint {

    @ReadOperation
    public List<Map<String, String>> health() {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("userName", "Chris");
        map.put("userId", "0710");
        list.add(map);

        return list;
    }
}
