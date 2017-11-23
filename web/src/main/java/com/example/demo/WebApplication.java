package com.example.demo;

import com.zuioqing.base.service.LoginService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		//测试常规服务
		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("consumer.xml");
		context.start();

		System.out.println("consumer start");
		LoginService loginService = context.getBean(LoginService.class);
		System.out.println("consumer");
		System.out.println(loginService.ligin());


	}
}
