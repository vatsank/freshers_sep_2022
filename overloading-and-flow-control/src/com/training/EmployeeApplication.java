package com.training;

public class EmployeeApplication {

	public static void print(Employee[] list) {
		
		for(Employee eachEmployee:list) {
			 if(eachEmployee!=null) {
				 System.out.println(eachEmployee);

			 }

	       }
	}
	public static void main(String[] args) {

		ManageEmplyees service = new ManageEmplyees();
		
		
		// use the service.add method and add employees 
		
		System.out.println("ARRAY WITH SIZE -3");
		System.out.println("Is Element Added"+ service.add(new Employee(101,"Ram",4500)));
		System.out.println("Is Element Added"+ service.add(new Employee(102,"Shyam",5500)));
		System.out.println("Is Element Added"+ service.add(new Employee(103,"Guru",6500)));

		
		 Employee[] list = service.getAll();
		 
		 // using Foreach Loop print all the employees

		 print(list); 

			System.out.println("Is Element Added"+ service.add(new Employee(104,"Siva",7500)));
			System.out.println("Is Element Added"+ service.add(new Employee(105,"Vivek",8500)));
			//System.out.println("Is Element Added"+ service.add(new Employee(205,"Vikram",8500)));

			Employee[] updatedList = service.getAll();

			

				System.out.println("RESIZED ARRAY ");

				print(updatedList);
				
				System.out.println("Position of Given element:======="+service.findIndex(new Employee(106,"Manish",81500)));

			 			 }
			
	}


