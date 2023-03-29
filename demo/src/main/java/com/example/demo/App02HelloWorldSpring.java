package com.example.demo;


import com.example.demo.game.GameRunner;
import com.example.demo.game.HelloWorldConfiguration;
import com.example.demo.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//Launch Context
		//Add Configuration
		@Configuration
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
	}

}
