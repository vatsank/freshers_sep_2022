package com.example.services;

import com.training.Employee;

public class EmployeeService {

	private int count ;
	private static int startingNumber;
	
	public static void showEmployee(Employee employee) {
		// instance variable cannot be accessed in a static method
	//	System.out.println(count);
		System.out.println(startingNumber);
		
		System.out.println(employee.getEmployeeName().toUpperCase());
		
	}
	
	public  void displayEmployee(Employee employee) {
	  	System.out.println(count);
		System.out.println(startingNumber);
		
		employee.setEmployeeName(employee.getEmployeeName().toLowerCase());
		System.out.println(employee.getEmployeeName().toLowerCase());
		
	}
	
	public static  double getBonus(Employee employee) {
		
		double bonus=0.0;   // initialize before use 
		
		System.out.println(bonus);
		
		return employee.getSalary()*0.0833;
		
	}
}
