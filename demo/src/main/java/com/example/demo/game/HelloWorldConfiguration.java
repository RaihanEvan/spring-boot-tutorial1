package com.example.demo.game;

import org.springframework.context.annotation.Bean;

public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Evan";
    }
}
