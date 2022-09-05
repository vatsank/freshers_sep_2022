package com.training.services;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.example.demo.utils.ConnectionFactory;
import com.training.entity.Course;
import com.training.entity.Participant;
public class CourseService {

	private Connection con ;

	public CourseService() {
		super();
		this.con= ConnectionFactory.getMySqlConnection();
		
		System.out.println("Connection Established"+this.con);
	}
	
	
	public int addCourse(Course course) {
		
		int rowAdded = 0;
		
		String sql = "insert into lumen_course_2022 values (?,?,?)";
		
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			pstmt.setInt(1, course.getCourseId());
			pstmt.setString(2, course.getCourseName());
			
			// Using a wild card import of sql and util package will create ambiguity
			// so we use fully qualified class Name
			// Alternatively we can import java.sql.Date and use just the class Name
			
			// java.sql.Date date = java.sql.Date.valueOf(course.getStartDate());
			
			Date date = Date.valueOf(course.getStartDate());
			
			pstmt.setDate(3, date);
			
			rowAdded = pstmt.executeUpdate();
						
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return rowAdded;
	}
	
	public Course findByCourseName(String courseName) {
		
		Course course = new Course();
		String sql ="SELECT p.id, p.firstName,p.email,c.courseName,c.startDate FROM "
				+ "test.lumen_participant_2022 p LEFT OUTER JOIN test.lumen_course_2022 c "
				+ "on p.course_ref=c.courseId where c.courseName=?";
		
		
		
		Set<Participant> list = new HashSet<>();

		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setString(1,courseName );
			
			ResultSet rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				Participant obj = new Participant();

				int id = rs.getInt(1);
				String firstName =rs.getString(2);
				String email =rs.getString(3);
				obj.setId(id);
				obj.setFirstName(firstName);
				obj.setEmail(email);
				list.add(obj);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		course.setList(list);
		return course;
	}
	
}
