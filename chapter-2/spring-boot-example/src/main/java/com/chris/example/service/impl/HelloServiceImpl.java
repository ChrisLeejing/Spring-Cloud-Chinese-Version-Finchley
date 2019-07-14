package com.chris.example.service.impl;

import com.chris.example.service.HelloService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 20:29
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Async
    @Override
    public void async() {
        System.out.println(Thread.currentThread().getName());
        /*
        启动类未加@EnableAsync:
        http-nio-8080-exec-6
        http-nio-8080-exec-9
        http-nio-8080-exec-1
        http-nio-8080-exec-2
        http-nio-8080-exec-5
        http-nio-8080-exec-8
        http-nio-8080-exec-10
        http-nio-8080-exec-3
        http-nio-8080-exec-4
        http-nio-8080-exec-6
        http-nio-8080-exec-8
        http-nio-8080-exec-10

        启动类加了@EnableAsync:
        task-1
        task-2
        task-3
        task-4
        task-5
        task-6
        task-7
        task-8
        task-1
        task-2
        task-3
        task-4
        task-5
        task-6
        task-7
        task-8
         */
    }
}
