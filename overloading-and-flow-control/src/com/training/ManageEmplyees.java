package com.training;

import java.util.Arrays;

public class ManageEmplyees {

	private Employee[] employeeList;    // employee List is null
	private int size ;
	private static int index =0;
	
	public ManageEmplyees() {
		super();
          this.size=3;
		 this.employeeList= new Employee[size]; // employee list not null but its initalized with a size 3

	}


	public boolean add(Employee employee) {
		if(index==this.employeeList.length) {
			resizeArray(2*this.size);
		}
		employeeList[index]=employee;
		index++;
		
		return true;
	}
	
	private void resizeArray(int capacity) {
     
		Employee[] temp = Arrays.copyOf(employeeList, capacity);
		this.employeeList= temp;
		
	}


	public Employee[] getAll() {
		
		return this.employeeList;
	}
	
	public int findIndex(Employee emp) {
		
		boolean isContinue=true;
		
		int idx = 0;
		int position= 0;
		
		while(isContinue && idx<employeeList.length) {
			if(this.employeeList[idx]!=null) {
			if(this.employeeList[idx].equals(emp)) {
				position = idx;

				isContinue=false;
			}
			}
			idx=idx+1;

		}
		return ++position;
		
	}
}
