package com.training.repo;
import java.time.LocalDate;
import java.util.*;

import com.training.model.Student;
public class StudentRepoImpl {

	private List<Student> studList;

	public StudentRepoImpl() {
		super();

		this.studList=new ArrayList<>();
	}
	
	public List<Student> findAll(){
	
		this.studList.add(new Student(101, "Anand", 98, LocalDate.of(1999, 8, 12)));
		this.studList.add(new Student(201, "Jagan", 78, LocalDate.of(1995, 9, 6)));
		this.studList.add(new Student(121, "Chandru", 87, LocalDate.of(1998, 10, 12)));
		this.studList.add(new Student(301, "Vikas", 72, LocalDate.of(1997, 9, 6)));
		this.studList.add(new Student(10, "Zahir", 79, LocalDate.of(1999, 1, 11)));

		return this.studList;
	}
	
}
