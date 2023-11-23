package com.example.one;

public class GameRunner {
	 GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game : "+game);
		game.upButton();
		game.downButton();
		game.leftButton();
		game.rightButton();
	}	
}
