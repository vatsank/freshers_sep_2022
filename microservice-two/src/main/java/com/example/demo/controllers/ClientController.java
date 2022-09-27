package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path = "/api/v1/client")
public class ClientController {

	
	@Autowired
	private WebClient client;
	
	
	@GetMapping(path = "/books")
	public Flux<String> getBooks() {
		
		return client
				.get()
				  .uri("lb://BOOK-SERVICE/api/v1/books")
				    .retrieve()
				     .bodyToFlux(String.class);
	}
}
