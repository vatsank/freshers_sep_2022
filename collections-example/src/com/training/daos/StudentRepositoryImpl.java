package com.training.daos;

import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
import java.util.*;
public class StudentRepositoryImpl implements CrudRepository<Student> {

	private List<Student> studentList;
	
	
	
	public StudentRepositoryImpl() {
		super();
		this.studentList = new ArrayList<>();
		this.studentList.add(new Student(101, "Ramesh", 90));
		this.studentList.add(new Student(102, "Yathi", 79));
		this.studentList.add(new Student(103, "Vikas", 82));
	}

	@Override
	public boolean save(Student obj) throws RuntimeException {

		// cannot add other than student object to studentList
		// becuase its type safe collections
		//this.studentList.add(new String("Ram"));
		 boolean isExisit = this.studentList.contains(obj);
		if(isExisit) {
			throw new RuntimeException("Element Already Exisit");
		} else {
			boolean result = this.studentList.add(obj);
			
			return result;
		}
		
	}

	@Override
	public Collection<Student> findAll() {
		return this.studentList;
	}

	@Override
	public boolean delete(Student obj) throws ElementNotFoundException{

		if(this.studentList.contains(obj)) {
			return this.studentList.remove(obj);
		} else {
			throw new ElementNotFoundException("ERR-106","Element Not Found");
		}
	}

}
