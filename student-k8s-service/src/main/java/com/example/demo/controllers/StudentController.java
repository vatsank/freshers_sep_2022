package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

	@Autowired
	private Student ram;
	
	
	@GetMapping
	public Student getStudent() {
		
		return ram;
		
	}
}
