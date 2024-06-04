package com.example.java002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java002Application {

	@GetMapping("/mensaje")
	public String mensaje() { return "Hola Mundo"; }
	
	public static void main(String[] args) {
		SpringApplication.run(Java002Application.class, args);
	}

}
