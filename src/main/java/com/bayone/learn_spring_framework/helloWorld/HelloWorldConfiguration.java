package com.bayone.learn_spring_framework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};

record Address (String place, String street) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Prahlad";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	@Primary
	public Person person() {
		var person = new Person ("Sagar", 20 , new Address("Butwal", "Deepnagar"));
		return person;
	}
	
	@Bean
	public Person person2() {
		var person = new Person (name(), age(), address());
		return person;
	}
	
	@Bean
	@Qualifier("personQualifier")
	public Person person3Parameters(String name, int age,@Qualifier("addressQualifier") Address address2) {
		return new Person (name, age, address2);
	}
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person (name, age, address);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		var address = new Address("Sarjapura", "#1 Maruthi Garden");
		return address;
	}
	
	@Bean(name = "address3")
	@Qualifier("addressQualifier")
	public Address address2() {
		var address = new Address("Saket", "Insta Office");
		return address;
	}
}
