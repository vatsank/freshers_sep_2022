package com.training.entity;

import com.training.stereotypes.MyTable;

@MyTable(name = "lumen_employee")
public class Employee {

	@MyId(columnName = "employee_id")
	private int employeeId;
}
