package com.bayone.learn_spring_framework;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyInitializationLauncherApplication {
	
	private static final Logger logInfo = LoggerFactory.getLogger(LazyInitializationLauncherApplication.class);

	public static void main(String[] args) {
		//launch a Spring call
		
		try(var context  = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class))
				{
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			
				}
	}

}
