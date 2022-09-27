package com.training;

import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import com.training.model.Student;
import com.training.services.StudentService;

public class Application {

	public static void print(List<?> list) {
		
		list.forEach(System.out::println);
	}
	public static void main(String[] args) {

		StudentService service = new StudentService();
		
		int key =2;
		
		switch (key) {
		case 1:
			print(service.getPassStudentList());
			break;
		case 2:
			print(service.getFailedStudentNames());
			break;
		case 3:
			Map<String, Double> map = service.getFailedStudentNameAndMark();

			Set<Map.Entry<String,Double>> items = map.entrySet();
			items.
			  forEach(e -> System.out.println(e.getKey() + ","+e.getValue()));
			break;
		case 4:
			System.out.println("Sorted by Mark");
			print(service.getStudentsSortedByMark());
			break;
		case 5:
			System.out.println("Sorted By Name");
			print(service.getStudentsSortedByName());
			break;
		case 6:
			System.out.println("Top Three By Mark");
			print(service.getTopStudentsByMark(5));
			break;
		case 7:
			System.out.println("Todays Birth Day");
			print(service.findStudentsByDateOfBirth(LocalDate.now()));
		case 8:
			System.out.println("Highest Mark");
			service.getHighestMark().
			 ifPresent(e -> System.out.println(e));
			break;
		case 9:
			printUsingIterator(service.getAsLinkedList());
			break;
		case 10:
			System.out.println("This Months Birth Days");
			print(service.findStudentBirthDayByMonth(Month.SEPTEMBER));
			break;
		default:
			break;
		}
		
	}
	private static void printUsingIterator(List<Student> asLinkedList) {

		ListIterator<Student> itr = asLinkedList.listIterator();
		
		System.out.println("Traversing Forward");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Traversing Reverse");

		while(itr.hasPrevious()) {
			
			System.out.println(itr.previous());
			
			
		}
	}

}
