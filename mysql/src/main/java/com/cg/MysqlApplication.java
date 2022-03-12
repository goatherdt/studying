package com.cg;

import com.cg.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class MysqlApplication {


	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);

	}

}
