package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;
@Component
public class Teacher {

	
	private List<Student> studentList;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Teacher(List<Student> studentList) {
		super();
		this.studentList = studentList;
	}

	/**
	 * @return the studentList
	 */
	public List<Student> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

		
	
}
