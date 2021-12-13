package com.example.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class GreetingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsApplication.class, args);
	}

	// annotations... shown by an @
	// tells our spring boot application when to run the attached method + extra details
}
