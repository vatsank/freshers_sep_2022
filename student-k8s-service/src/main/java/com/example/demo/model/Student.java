package com.example.demo.model;

public class Student {

	private int rollNumber;
	private String firstName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String firstName) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
	}
	/**
	 * @return the rollNumber
	 */
	public int getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
