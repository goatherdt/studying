package com.example.mybatisdemo;

import com.example.mybatisdemo.mapper.ChildMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {

//	@Autowired
	private ChildMapper childMapper;
	@Test
	void contextLoads() {
//		List<ChildDO> all = childMapper.findAll();
//		all.stream().map(ChildDO::getName).forEach(System.out::println);
	}

}
