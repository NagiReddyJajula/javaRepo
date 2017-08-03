package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.app")
@EnableAutoConfiguration
@SpringBootApplication
public class Run {
	public static void main(String[] args) {
	
		SpringApplication.run(Run.class, args);
	}
}
