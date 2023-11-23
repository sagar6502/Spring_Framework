package com.example.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpringBean {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).upButton();
			context.getBean(GameRunner.class).run();
		}
		
		
	}

}
