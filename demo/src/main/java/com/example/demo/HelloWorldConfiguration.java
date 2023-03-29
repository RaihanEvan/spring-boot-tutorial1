package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){ };
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
        var person = new Person("Ethar",11, new Address(
                "Debidwar","Cumilla"
        ));
        return person;
    }
    @Bean
    @Primary
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }
    @Bean
    public Person person3Parameters(String name,int age, Address address3){
        return new Person(name,age,address3);
    }
    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Setabganj","Dinajpur");
    }
    @Bean(name = "address3")
    public Address address3(){
        return new Address("Shahjahanpur","Dhaka");
    }
}
