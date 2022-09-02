package com.training;

import java.io.File;
import java.io.IOException;

import com.training.model.Student;
import com.training.services.FileService;

public class Application {

	public static void main(String[] args) {

		FileService service =
				new FileService();
		
		File bookFile = new File("BookData.txt");
		
		int ch= 6;
		
		if (ch==1) {
	  Book headFirstJava =
			  new Book(102,"Spring in Action","Tim Kay",1250.00);
	  
	     System.out.println("is File Created:="+ 
	       service.writeToTextFile(headFirstJava, bookFile));
	      
		} 
		if(ch==2)
		{
			
			Book[] list;
			try {
				list = service.readFromTextFile(bookFile);
				for(Book eachBook:list) {
					System.out.println(eachBook);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		File serFile = new File("BookData.ser");

		if(ch==3) {
			
			  Book headFirstJava =
					  new Book(202,"Thinking in Java","Erick",2250.00);
			
			System.out.println("Is Serialized:="+service.serialize(headFirstJava, serFile));
		}
	      
		if(ch==4) {
			
			System.out.println("Deserlized Book :="+ service.deserliaze(serFile));
		}
		
		File studFile = new File("StudentData.txt");

		if(ch==5) {
			
		       System.out.println(
		    		 "is Saved"+  service.writeToTextFile(
		    				   new Student(203,"Harish",97), studFile));
		       
		}
		
		if(ch==6) {
			
		       System.out.println(
		    		 "Highest Mark"+  service.findMaxMark(studFile));
		       
		}
	}

}
