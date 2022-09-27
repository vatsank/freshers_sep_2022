package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Student;

@SpringBootApplication
public class StudentK8sServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentK8sServiceApplication.class, args);
	}

	@Bean
	public Student ram() {
		
		return new Student(101, "Ramesh");
	}
}
