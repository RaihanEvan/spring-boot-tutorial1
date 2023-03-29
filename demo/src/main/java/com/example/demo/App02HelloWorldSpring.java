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
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		//System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));


	}

}
