package com.bayone.learn_spring_framework.game;

public class MarioGame implements GamingConsole {
	public void upButton() {
		System.out.println("Jump");
	}
	public void downButton() {
		System.out.println("Go down");
	}
	public void leftButton() {
		System.out.println("Go back");
	}
	public void rightButton() {
		System.out.println("Accelerate");
	}
	
}
