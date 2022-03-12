package com.cg.mysql;

import com.cg.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MysqlApplicationTests {

	@Resource
	private UserRepository userRepository;
	@Test
	void contextLoads() {
		Iterable t = userRepository.findAll();
		System.out.println(t);
	}

}
