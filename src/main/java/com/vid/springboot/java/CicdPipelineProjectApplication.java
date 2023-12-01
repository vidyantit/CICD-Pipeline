package com.vid.springboot.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CicdPipelineProjectApplication {

	@GetMapping("/welcome")
	public String welcomePage() {
		return "Hello to welcome page";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CicdPipelineProjectApplication.class, args);
	}

}
