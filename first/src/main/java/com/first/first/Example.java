package com.first.first;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/greeting")
	String home() {
		return "Hello World!";
	}
	@RequestMapping("/")
	int number()
	{
		return 121;
	}
	public static void main(String[] args) {
		SpringApplication.run(Example.class, args);
	}

}