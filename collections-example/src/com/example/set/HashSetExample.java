package com.example.set;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor kanna = new Doctor(101,"Kanna","ENT",3929239);
		Doctor panna = new Doctor(102,"Phani Raj","SKIN",7929239);
		Doctor chinna = new Doctor(103,"Chinna","PED",6929239);
		Doctor dodda = new Doctor(103,"Chinna","PED",6929239);

		
		Set<Doctor> docList =
				new HashSet<>();
		
	System.out.println("is Added:="+docList.add(chinna));	
	System.out.println("is Added:="+docList.add(dodda));	
	System.out.println("is Added:="+docList.add(panna));	
	System.out.println("is Added:="+docList.add(kanna));	
		
		System.out.println("Size: " +docList.size());
		
		for(Doctor eachDoctor:docList) {
			System.out.println(eachDoctor);
		}
	
		System.out.println("====== TREE SET ========");
	
	Set<Doctor> doctorSet = new TreeSet<>();
	
	System.out.println("is Added:="+doctorSet.add(chinna));	
	System.out.println("is Added:="+doctorSet.add(dodda));	
	System.out.println("is Added:="+doctorSet.add(panna));	
	System.out.println("is Added:="+doctorSet.add(kanna));	
	

	for(Doctor eachDoctor:doctorSet) {
		System.out.println(eachDoctor);
	}

	}

}
