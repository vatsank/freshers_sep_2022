package com.training;

import java.time.LocalDate;
import java.time.Month;

import com.training.entity.Course;
import com.training.entity.Participant;
import com.training.services.CourseService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CourseService service = new CourseService();
		
		Course java = new Course(890, "Core Jva", LocalDate.of(2022, Month.SEPTEMBER, 12));
		
		//System.out.println("Row Added :="+ service.addCourse(java));
		
		 String srchCourse="Dot Net";
		 Course course =service.findByCourseName(srchCourse);
		
		 System.out.println("===============================");
		 System.out.println(srchCourse +" Participants");
		 System.out.println("===============================");
		 for(Participant eachParticipant:course.getList()) {
			 
			 System.out.println(eachParticipant);
		 }
		 
		
	}

}
