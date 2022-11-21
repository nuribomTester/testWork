package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestBuildApplication {
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionFactory sessionFactory;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testByApplication() {
		try {
			System.out.println("===================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("===================");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBySqlSessionFactroy() {
		try {
			System.out.println("==================");
			System.out.println(sessionFactory.toString());
			System.out.println("==================");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(TestBuildApplication.class, args);
	}

}
