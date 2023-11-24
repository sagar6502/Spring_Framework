package com.example.one;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameRunner {
	
	public static final Logger objLgr = LoggerFactory.getLogger(GameRunner.class);
	 GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		// TODO Auto-generated method stub
		objLgr.info("Running game : "+game);
		game.upButton();
		game.downButton();
		game.leftButton();
		game.rightButton();
	}	
}
