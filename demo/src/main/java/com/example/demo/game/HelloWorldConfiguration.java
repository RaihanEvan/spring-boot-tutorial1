package com.example.demo.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){ };
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Evan";
    }
    @Bean
    public int age(){
        return 24;
    }
    @Bean
    public Person person(){
        var person = new Person("Ethar",11);
        return person;
    }
    @Bean
    public Address address(){
        return new Address("Setabganj","Dinajpur");
    }
}
