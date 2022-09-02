package com.training;
import java.util.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		
//	    System.out.println("Employee Id");
//	    int employeeId = sc.nextInt();
//	    
//	    System.out.println("Employee Name");
//	    String employeeName= sc.next();
//	    
//	    System.out.println("Salary");
//	    double salary = sc.nextDouble();
//		
//	    Employee obj = new Employee(employeeId, employeeName, salary);
//	    
//	    EmployeeService service = new EmployeeService();
//	    
//	     service.caclulateBonus(obj);
//	    
//	     
//	     service.calculateBonus(45000);
//	     
//	    sc.close();
//		
	    Employee ram = new Employee(101, "Ram", 45000);
	    Employee shyam = new Employee(101, "Ram", 45000);
	    Employee ramdu = ram;
	    Employee hari =null;
	    
	    System.out.println("is Equal :="+ram.equals(hari));
	    
	    System.out.println(ram.hashCode());
	}

}
