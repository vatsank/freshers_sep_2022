package com.training;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
     Gson obj =   new GsonBuilder().setPrettyPrinting().create();
     
       Employee ram = new Employee(101, "Ramu", 54000);
       Employee shyam = new Employee(102, "Shyam", 24000);
       Employee jagan = new Employee(103, "Jagan", 34000);
       Employee jaya = new Employee(104, "Jaya", 44000);

       
       System.out.println(obj.toJson(ram));
       
       List<Employee> empList = new ArrayList<>();
       
        empList.add(ram);
        empList.add(shyam);
        empList.add(jagan);
        empList.add(jaya);
        
        
        System.out.println(obj.toJson(empList));
        
     String jsonStr  ="{\r\n"
     		+ "  \"employeeId\": 101,\r\n"
     		+ "  \"employeeName\": \"Ramu\",\r\n"
     		+ "  \"salary\": 54000.0\r\n"
     		+ "}";

      System.out.println(obj.fromJson(jsonStr, Employee.class));
     
    }
}
