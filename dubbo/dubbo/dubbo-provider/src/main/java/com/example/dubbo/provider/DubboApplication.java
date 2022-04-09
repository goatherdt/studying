package com.example.dubbo.provider;

import com.example.demo.client.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DubboApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DubboApplication.class, args);

		DemoService demoService = context.getBean(DemoService.class);

		String greet = demoService.sayHello("Bob");

		System.out.println(greet);

	}

}
