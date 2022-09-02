package com.training.maps;

import java.util.*;

import com.training.model.Student;

public class StudentHashMap {

	
	public static void usingHashMap() {
		
		HashMap<Integer, Student> map =
				 new HashMap<>();
		
		Student ram = new Student(102, "Ramu", 89);
		
		System.out.println("Response:="+map.put(ram.getRollNumber(), ram));
		
		
		Student ramdu = new Student(103, "Ramudu", 92);
		
		/*
		 * If duplicate key is used the existing element is replaced with new value
		 * and it returns the existing element or the old element 
		 */
		System.out.println("Response:="+map.put(102, ramdu));
		
		System.out.println(map.get(102));
		

	}

	public static void usingHashMapWithKeys() {
		
		HashMap<Integer, Student> map =
				 new HashMap<>();
		
		Student ram = new Student(102, "Ramu", 89);
		Student jagan = new Student(202, "Jagan", 99);
		Student vikas = new Student(100, "Vikas", 79);
		
		
	System.out.println(map.put(ram.getRollNumber(),ram));
	System.out.println(map.put(jagan.getRollNumber(), jagan));
	System.out.println(map.put(vikas.getRollNumber(), vikas));
		
	       Set<Integer> keys   =map.keySet();
	        
	       for(Integer eachKey:keys) {
	    	   System.out.println(map.get(eachKey));
	    	   
	       }
	                  
	
		
	}

	
	public static void usingHashTable() {
		
		Hashtable<Integer, Student> map =
				 new Hashtable<>();
		
		Student ram = new Student(102, "Ramu", 89);
		Student jagan = new Student(202, "Jagan", 99);
		Student vikas = new Student(100, "Vikas", 79);
		
		
	System.out.println(map.put(ram.getRollNumber(),ram));
	System.out.println(map.put(jagan.getRollNumber(), jagan));
	System.out.println(map.put(vikas.getRollNumber(), vikas));
		
	
	 for( Map.Entry<Integer, Student> eachElement:map.entrySet()) {
		 
		 System.out.println(eachElement.getKey() + ","+eachElement.getValue());
		 
	 }
		
	}
	
	
	public static void main(String[] args) {

		//usingHashMap();
		
		//usingHashTable();
		
		//usingTreeMap();
		
		usingHashMapWithKeys();
		
		
	}

	private static void usingTreeMap() {
		TreeMap<Integer, Student> map =
				 new TreeMap<>();
		
		Student ram = new Student(102, "Ramu", 89);
		Student jagan = new Student(202, "Jagan", 99);
		Student vikas = new Student(100, "Vikas", 79);
		
		
	System.out.println(map.put(ram.getRollNumber(),ram));
	System.out.println(map.put(jagan.getRollNumber(), jagan));
	System.out.println(map.put(vikas.getRollNumber(), vikas));
		
	 for(Map.Entry<Integer, Student> eachElement:map.entrySet()) {
		 
		 System.out.println(eachElement.getKey() + ","+eachElement.getValue());
		 
	 }
			
	}

}
