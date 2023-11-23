package com.bayone.learn_spring_framework.helloWorld;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava2 {
	
	private static final Logger logInfo = LoggerFactory.getLogger(AppGamingBasicJava2.class);

	public static void main(String[] args) {
		//launch a Spring call
		
		try(var context  = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
				{
			logInfo.info(context.getBean("name").toString());
			logInfo.info(context.getBean("age").toString());
			
			logInfo.info(context.getBean("person").toString());
			
			logInfo.info(context.getBean("address2").toString());
			
			logInfo.info(context.getBean(Address.class).toString());
			logInfo.info(context.getBean(Person.class).toString());
			
			logInfo.info(context.getBean("person3Parameters").toString());
			
			logInfo.info(context.getBean("person2").toString());
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			logInfo.info("personQualifier");
				}
		
		//var context  = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//configure the things that we want Spring to manage - @Configuration
		//helloWorldConfiguration - @Configuration
		//name - @Bean	
		
		
	}

}
