package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class TestPaddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestPaddyApplication.class, args);
	}

	@RequestMapping("/Available")
	public String available() {
		System.out.println("This is inside the Test Paddy Application controller");
		return "Availables";
	}
	
}
