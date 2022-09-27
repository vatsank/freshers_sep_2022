package com.example.demo.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")

public class BookController {
	
	@Value("${server.port}")
	private String port;

	@GetMapping(path = "/books")
	public String[] getBestBooks() {
		
		return new String[] {"HeadFirstJava","Thinking in java","Effective Java",port};
	}
	

}
