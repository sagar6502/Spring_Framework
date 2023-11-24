package com.bayone.learn_spring_framework.d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class LazyInitializationLaunchApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyInitializationLaunchApplication.class, args);
	}

}
