package com.example.dubbo.consumer;

import com.example.demo.client.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(version = "1.0.0")
    private DemoService demoService;


    @Bean
    public ApplicationRunner runner() {
        return args -> {
            logger.info(demoService.sayHello("mercyblitz"));
        };
    }
}
