package com.example.demo;

import java.sql.*;
import java.util.*;

import com.example.demo.repos.StudentRepositoryImpl;
import com.example.demo.utils.ConnectionFactory;
import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
public class Application {

	public static void main(String[] args) {
		
		Connection con =ConnectionFactory.getMySqlConnection();
		
		CrudRepository<Student> repo = new StudentRepositoryImpl(con);
		try {
			String key ="add";
			switch (key) {
			case "add":
				Student ram = new Student(205, "ramkumar", 90);
				
				System.out.println("Is Record Added:=" +repo.save(ram));

				break;
			case "findAll":
				for(Student eachStudent:repo.findAll()) {
					System.out.println(eachStudent);
				}
				break;
			case "findById":
				System.out.println(repo.findById(102));
				 break;
			case "deleteById":
					System.out.println(repo.deleteById(2102));
			break;
			case "delete":
				Student vishal = new Student(205, "Vishal", 90);

				System.out.println(repo.delete(vishal));
				
				break;
			default:
				break;
			}

		} catch (ElementNotFoundException e) {
               e.printStackTrace();
		}
				
		
		
		
		
		

	}

}
