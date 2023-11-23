package com.bayone.learn_spring_framework.game;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var pacman = new Pacman(); //1. Object Creation
		var gameRunner = new GameRunner(pacman	); 
		//2. Object Creation + Wiring of Dependencies
		
			// Game is the dependency
		gameRunner.run();
	}

}
