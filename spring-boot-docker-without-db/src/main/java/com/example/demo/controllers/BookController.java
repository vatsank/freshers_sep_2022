package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")

public class BookController {

	@GetMapping(path = "/books")
	public String[] getBestBooks() {
		return new String[] {"HeadFirstJava","Thinking in java","Effective Java","Vatsan"};
	}
	
	@GetMapping(path = "/useful")
	public String[] getUsefulBooks() {
		return new String[] {"tutorialpoint","geekforgeek","stackoverflow"};
	}
	
		@GetMapping(path = "/best/actors")
	
	public String[] getBestActors() {
		return new String[] {"NTR","RajKumar","Rajini"};
		
	}

}
