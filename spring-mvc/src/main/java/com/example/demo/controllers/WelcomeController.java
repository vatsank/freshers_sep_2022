package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.MobilePlan;

@Controller
public class WelcomeController {
	
	@Autowired
	private RestTemplate template;

	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String welcomePage() {
		
		return "index";
	}
	
	// call the URL using GET Operation :http://localhost:8080/api/v1/mobileplans/
	@GetMapping(path = "/plans")
	public MobilePlan[]   getMobilePlans() {
		
	  return this.template.getForObject("http://localhost:8080/api/v1/mobileplans/", MobilePlan[].class);
	}
}
