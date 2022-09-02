package com.training;

import com.training.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {

		Employee ram = new Employee();
		
		ram.setEmployeeId(600);
	
		try {
			ram.setSalary(70000);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		try {
			Employee magesh = new Employee(120);
		} catch (RangeCheckException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			Employee shyam = new Employee(2500, "Shyam", 56000);
			System.out.println(shyam);
		} catch (RangeCheckException e) {
			e.printStackTrace();
		}
		
	}

}
