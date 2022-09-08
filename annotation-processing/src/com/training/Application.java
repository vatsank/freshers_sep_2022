package com.training;

import com.training.entity.Book;
import com.training.entity.Employee;
import com.training.utils.AnnotationProcessor;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationProcessor processor =
				new AnnotationProcessor();
		
	      Book obj1 = new Book();
		
		Employee obj2 = new Employee();
	
		System.out.println(processor.createSql(obj1));
		System.out.println(processor.createQueryFindById(obj1));
		
		System.out.println(processor.createSql(obj2));
		System.out.println(processor.createQueryFindById(obj2));

		
	}

}
