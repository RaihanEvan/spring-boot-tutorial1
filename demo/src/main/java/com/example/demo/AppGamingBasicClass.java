package com.example.demo;


import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContraGame;

public class AppGamingBasicClass {

	public static void main(String[] args) {
		//var game = new SuperContraGame();
		var game = new MarioGame();

		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
