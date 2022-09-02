/**
 * 
 */
package com.example.demo;

import com.example.services.EmployeeService;
import com.training.Employee;

/**
 * @author vatsan
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Employee ram = new Employee();
//		
//		ram.setEmployeeId(101);
//		ram.setEmployeeName("Ram Kumar");
//		ram.setSalary(56000);
//		
//     System.out.println(ram);
//     
//     Employee shyam = new Employee(102, "Shyam Kumar", 53000);
//     
//     System.out.println(shyam);
//     
//     
//     Employee ganesh = new Employee(103);
//     
//     ganesh.setEmployeeName(args[0]);
//     
//     System.out.println(ganesh);
//     
//       int employeeId = Integer.parseInt(args[1]);
//       double salary =Double.parseDouble(args[3]);
//       
//     Employee obj = new Employee(employeeId, args[2], salary);
//     
//      System.out.println(obj);
//     
//		EmployeeService service = new EmployeeService();
//		
		// Static method should not be accessed in a non static way

		//service.showEmployee(new Employee(103));   
		        
        // EmployeeService.showEmployee(new Employee(102));
        
        Employee sugesh = new Employee(105, "Sugesh", 50000);
        System.out.println("Before :=" +sugesh);
        EmployeeService.showEmployee(sugesh);
        System.out.println("After:="+sugesh);
        System.out.println(EmployeeService.getBonus(sugesh));
        
	}

}
