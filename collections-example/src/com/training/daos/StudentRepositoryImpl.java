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
	}

	@Override
	public boolean save(Student obj) {

		// cannot add other than student object to studentList
		// becuase its type safe collections
		//this.studentList.add(new String("Ram"));
		return this.studentList.add(obj);
		
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
