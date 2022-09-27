package org.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.Student;

@Component
public class School {

	private String schoolName;
	
	
	@Autowired
	@Qualifier(value = "ram")
	private Student stud;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName) {
		super();
		this.schoolName = schoolName;
	}

	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}
