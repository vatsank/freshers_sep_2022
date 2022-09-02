package com.training;

public class EmployeeService {

	
	public double caclulateBonus(Employee employee) {
		
//		double bonus = employee.getSalary() *0.10;
//		return bonus;
//		
		return employee.getSalary() *0.10;
		
	}
	
	public double calculateBonus(double salary) {
		
		return salary *0.20;
	}
	
	public double calculateBonus(String employeeName,double salary) {
		
		double bonus = 0.0;
		if(employeeName.contains("s"))
		{
		  bonus = salary *.10;
		} else {
			  bonus = salary *.20;

		}
		
		return bonus;
	}

    public double calculateBonus(String employeeName) {
		
		double bonus = 25000.0;

		if(employeeName.equals("Krishna")) {
			bonus =50000.00;
		}
		return bonus;
	}


    public double findBonus(Employee employee) {

//    	if employee name ="ram " = 10000 
//    			 if name="shyam" = 20000
//    			 if name = "magesh" 30000 
//    			 in all other case 35000
//    			 
//    			 use swtich-case with string and return
//    					 
    	return 0.0;
	}

    
}
