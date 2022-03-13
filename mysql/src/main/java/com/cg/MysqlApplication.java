package com.cg;

import com.cg.entity.UserProperty;
import com.cg.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableConfigurationProperties(UserProperty.class)
public class MysqlApplication {


	public static void main(String[] args) {
		SpringApplication.run(MysqlApplication.class, args);

	}

}
