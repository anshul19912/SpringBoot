package com.example.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}



/*
@SpringBootApplication: It is a combination of 3 annotation: EnableAutoConfiguration, ComponentScan and Configuration
EnableAutoConfiguration:  It reads all the configuration of springboot project automatically
ComponentScan: it reads the com.example.SpringBoot package. It registers all the beans which we have declared in this package
Configuration: It loads all the configuration classes.
 */