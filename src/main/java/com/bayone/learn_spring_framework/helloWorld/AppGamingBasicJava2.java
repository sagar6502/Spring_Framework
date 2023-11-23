package com.bayone.learn_spring_framework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava2 {

	public static void main(String[] args) {
		//launch a Spring call
		
		try(var context  = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class))
				{
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("person2"));
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("personQualifier");
				}
		
		//var context  = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//configure the things that we want Spring to manage - @Configuration
		//helloWorldConfiguration - @Configuration
		//name - @Bean	
		
		
	}

}
