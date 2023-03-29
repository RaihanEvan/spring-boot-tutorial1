package com.example.demo;


import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContraGame;

public class AppGamingBasicClass {

	public static void main(String[] args) {
		var superContra = new SuperContraGame();
		var marioGame = new MarioGame();
		//need to call new construc
		var gameRunner = new GameRunner(superContra);
		gameRunner.run();
	}

}
