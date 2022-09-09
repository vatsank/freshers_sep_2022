package com.training.services;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

import com.training.model.Student;
import com.training.repo.StudentRepoImpl;

public class StudentService {

	
	List<Student> studList ;

	public StudentService() {
	
		StudentRepoImpl dao = new StudentRepoImpl();
		
		this.studList = dao.findAll();
	}
	
	public List<Student> findByName(String name) {
		
		return  this.studList.stream()
				.filter(e -> e.getFirstName().equals(name))
				 .collect(toList());
		
		
	}
	
	public List<Student> getPassStudentList(){
		
		return this.studList.stream()
				          .filter(e -> e.getMarkScored()>80)
				           .collect(toList());
	
	}
	
	public List<String> getFailedStudentNames(){
		
		return this.studList.stream()
				.filter(e -> e.getMarkScored()<=80)
				.peek(e -> System.out.println("Peek -1:=>" +e))
				.map(e -> e.getFirstName())
				.peek(e -> System.out.println("Peek-2:=>"+e))
				.collect(toList());
	}
	
	public Map<String,Double> getFailedStudentNameAndMark(){
		
//		Function<Student,String> fun = 
//				(e) -> e.getFirstName();
//		
		return this.studList.stream()
				.filter(e -> e.getMarkScored()<=80)
				.collect(toMap(Student::getFirstName, Student::getMarkScored));
		
	 }
	
	public List<Student> getStudentsSortedByMark(){
		
		// sorted is a stateful intermediary operator
		
		// this works on the basis of comparable in the student class
		return this.studList.stream().sorted().collect(toList());
	}
	
   public List<Student> getStudentsSortedByName(){
		
		// sorted is a stateful intermediary operator

	   // this works on the basis of comparator passed to the sorted method
	   
		return this.studList.stream().
				sorted(Comparator.comparing(Student::getFirstName))
				  .collect(toList());
	}
   
   public List<Student> getTopStudentsByMark(int postions){
		
		// sorted is a stateful intermediary operator
		
		// this works on the basis of comparable in the student class
		return this.studList.stream()
				.sorted(Comparator.comparing(Student::getMarkScored).reversed())
				.limit(postions).collect(toList());
		
	}
	
   public List<Student> findStudentsByDateOfBirth(LocalDate date){


	
		return this.studList.stream()
		                  .filter(e -> MonthDay.of(e.getDateOfBirth().getMonth(),
		                		     e.getDateOfBirth().getDayOfMonth())
		                		  .equals(MonthDay.from(date))).collect(toList());
   }
   

public List<String> findStudentBirthDayByMonth(Month month){
	   
	   return null;
   }

public List<Student> getAsLinkedList() {
	
	return this.studList.stream().collect(Collectors.toCollection(LinkedList::new));
}

public Optional<Double> getHighestMark() {
	
	return this.studList.stream().map(e -> e.getMarkScored())
			      .max(Comparator.comparing(Double::doubleValue));
}

}


