package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.ifaces.BookRepository;

@RestController
@RequestMapping(path = "/api/v1/books")
public class BookController {

	
	@Autowired
	BookRepository repo;
	
	
	@GetMapping
	public List<Book> findAll(){
		
		return this.repo.findAll();
	}
	
	@PostMapping
	public Book add(@RequestBody Book book) {
		return this.repo.save(book);
	}
}
