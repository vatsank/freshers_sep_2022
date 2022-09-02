package com.training;
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

	
	public Employee(int employeeId) {
		
		this(employeeId,"New Employee",23000);
		this.employeeId = employeeId;
		System.out.println("One Argument Constructor Called");	

	}


	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
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
		this.employeeId = employeeId;
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
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	
	
}
