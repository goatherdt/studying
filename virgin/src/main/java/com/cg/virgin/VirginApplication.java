package com.cg.virgin;

import com.cg.virgin.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

//@SpringBootApplication
@RestController
public class VirginApplication {

//	@Autowired
//	private ApplicationContext applicationContext;

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
//		SpringApplication.run(VirginApplication.class, args);
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(AppConfiguration.class);


	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		studentService.register();
		return "hello!";
	}
}
