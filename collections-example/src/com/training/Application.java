package com.training;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;

import com.training.daos.StudentRepositoryImpl;
import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;

public class Application {
	
	public static void inputValues(CrudRepository repo) {
		
		
	Executors e;
	
		String ch="y";
		Scanner sc = new Scanner(System.in);
		do {
		
	
			
			System.out.println("Roll Number");
			int rollNumber = sc.nextInt();
			System.out.println("Student Name");
			String name = sc.next();
			System.out.println("Mark Scored");
			double mark = sc.nextDouble();
			 Student obj = new Student(rollNumber, name, mark);
			 
			 System.out.println("is Element Added:="+ repo.save(obj));

			 System.out.println("Y to continue N-stop");
	          ch = sc.next();
		
		}
		while(ch.equalsIgnoreCase("y"));

		 sc.close();
		}
	
	public static void print(CrudRepository repo) {
		
		Collection<Student> list = repo.findAll();
		for(Student eachStudent:list) {
			System.out.println(eachStudent);
		}

	}

	public static void main(String[] args) {

		int key = 1;
		
		CrudRepository<Student> repo = new StudentRepositoryImpl();
		
		do {
		switch (key) {
		case 1:
			inputValues(repo);
			break;
		case 2:
			print(repo);
						break;
		case 3:
			
			 boolean result;
			try {

				result = repo.delete(null);
				 System.out.println("Is Deleted:="+result);

			} catch (ElementNotFoundException e) {
				e.printStackTrace();
			}
			 break;
		default:
			break;
		}
		key++;
		}
		while(key<4);
	}

}
