package com.practice.app;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		System.out.println("Hello Springboot!");
	
//		Old way		
//		Alien obj = new Alien();
//		obj.code();

		Alien obj = context.getBean(Alien.class);
		obj.code();
	
	}

}
