package com.example.demo.utils;

import java.sql.*;
import java.util.*;

import com.example.demo.repos.StudentRepositoryImpl;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
public class Application {

	public static void main(String[] args) {
		
		Connection con =ConnectionFactory.getMySqlConnection();
		
		CrudRepository<Student> repo = new StudentRepositoryImpl(con);
		
		Student ram = new Student(205, "Vishal", 90);
		
		//System.out.println("Is Record Added:=" +repo.save(ram));
		
		
		
		for(Student eachStudent:repo.findAll()) {
			System.out.println(eachStudent);
		}
		
		

	}

}
