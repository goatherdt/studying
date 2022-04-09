package com.example.dubbo.consumer.service;

import com.example.demo.client.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private DemoService demoService;

    public String greet(String name){
       return demoService.sayHello(name);
    }
}
