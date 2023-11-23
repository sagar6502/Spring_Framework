package com.bayone.learn_spring_framework.test;

import java.io.Serializable;

class Pojo{
	private String text;
	
	private int number;
	
	public String toString() {
		return text+" : "+number;	
	}
}

class JavaBean implements Serializable //EJB[enterprise java bean]
{
	private String text;
	
	private int number;
	
	public JavaBean() { //public no-arg constructor
		
	}
	
	public JavaBean(String text, int number) {
		super();
		this.text = text;
		this.number = number;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

public class SpringBeanVsJavaBean {
		public static void main(String[] args) {
			Pojo pojo = new Pojo();
			System.out.println(pojo);
		}
}
