package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ServicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicedemoApplication.class, args);

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
		System.out.println(context.getDisplayName() + ": here");
		context.start();
		System.out.println("服务已经启动...");
	}
}
