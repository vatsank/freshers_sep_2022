package com.training;

import com.training.exceptions.RangeCheckException;

/**
 * 
 * @author vatsan
 *
 */
public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	
	
	public Employee() {
		super();
		// this();  cannot have both this() and super() becoz this() and super() should be first line
		
	System.out.println("Zero Argument Constructor Called");	
	}

	
	public Employee(int employeeId) throws RangeCheckException{
		
		this(employeeId,"New Employee",23000);
		this.employeeId = employeeId;
		System.out.println("One Argument Constructor Called");	

	}


	/*
	 * Check the range of employee id if its less than or equal to 0 
	 * or greater than 2000 and throw RangeCheckException 
	 * Use Declare Rule(use throws clause) instead handle rule (Don't put try-catch)
	 */
	public Employee(int employeeId, String employeeName, double salary) throws RangeCheckException {
		super();
		if(employeeId<=0 || employeeId >2000) {

			throw new RangeCheckException("ERR-105", "Employee Id Should be positive Integer");
		} else {
			this.employeeId = employeeId;
	
		}
		this.employeeName = employeeName;
		this.salary = salary;
		System.out.println("Three Parameter Constructor Called");
	}
	

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		
		if(employeeId<=0 || employeeId>2000) {
			try {
				throw new RangeCheckException("ERR-105","Employee Id Should be Positive Integer");

			} catch (RangeCheckException e) {
				e.printStackTrace();
			}
		} else {
		this.employeeId = employeeId;
		}
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {//throws RangeCheckException{
		if(salary >50000) {
			try {
				throw new RangeCheckException("ERR-106", "Salary Should be less than 50000");

			} catch (RangeCheckException e) {
				
				//throw e;  // Rethrowing
				throw new RuntimeException(e.getMessage());
			}
		} else {
		this.salary = salary;
		}
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	
	
}
