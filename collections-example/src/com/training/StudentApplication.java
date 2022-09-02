package com.training;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.training.daos.StudentRepositoryImpl;
import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
import com.training.utils.FirstNameComparator;

public class StudentApplication {

	public static void main(String[] args) {

		CrudRepository<Student> repo = new StudentRepositoryImpl();

		 Student ramesh = new Student(301, "Ramesh", 59);
		 Student rajesh = new Student(102, "Rajesh", 99);
		 Student vishal = new Student(505, "Vishal", 69);
		 Student aman = new Student(210, "Aman", 92);


        repo.save(aman);
        repo.save(vishal);
        repo.save(ramesh);
        repo.save(rajesh);
        
        List<Student> list = (List<Student>) repo.findAll();
        
        Collections.sort(list);
        
        System.out.println("Sorted By Mark");
           for(Student eachStudent : repo.findAll()) {
        	   System.out.println(eachStudent);
           }
			
           
           Collections.sort(list,new FirstNameComparator());
           
           System.out.println("Sorted By Name");
           for(Student eachStudent : repo.findAll()) {
        	   System.out.println(eachStudent);
           }
			
           
           try {
			repo.delete(aman);
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}
           
           System.out.println("After Deleting");

           for(Student eachStudent : repo.findAll()) {
        	   System.out.println(eachStudent);
           }
           
	}

}
