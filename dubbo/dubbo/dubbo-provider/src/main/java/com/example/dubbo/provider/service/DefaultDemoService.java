package com.example.dubbo.provider.service;

import com.example.demo.client.service.DemoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.PostConstruct;

@DubboService(version = "1.0.0")
public class DefaultDemoService implements DemoService {

    @PostConstruct
    private void init(){
        System.out.println("init ...");
    }

    @Override
    public String sayHello(String name) {
        name = StringUtils.isNotBlank(name)? name : "World";
        return String.format("Hello, %s!", name);
    }
}
