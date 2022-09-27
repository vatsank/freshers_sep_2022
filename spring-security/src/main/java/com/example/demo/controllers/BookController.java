package com.example.demo.controllers;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")

public class BookController {

	// Admin User only will be able to access this endpoint
	@GetMapping(path = "/best")
	@RolesAllowed(value = {"ROLE_ADMIN"})
	public String[] getBestBooks() {
		return new String[] {"HeadFirstJava","Thinking in java","Effective Java"};
	}
	
	@GetMapping(path = "/useful")
	public String[] getUsefulBooks() {
		return new String[] {"tutorialpoint","geekforgeek","stackoverflow"};
	}
	
	// Any User  will be able to access this endpoint

	@GetMapping(path = "/best/actors")
	@RolesAllowed(value = {"ROLE_ADMIN","ROLE_USER"})

	public String[] getBestActors() {
		return new String[] {"NTR","RajKumar","Rajini"};
		
	}

}
