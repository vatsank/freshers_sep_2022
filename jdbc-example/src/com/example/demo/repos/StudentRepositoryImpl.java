package com.example.demo.repos;

import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Student;
import java.sql.*;
import java.util.*;
public class StudentRepositoryImpl implements CrudRepository<Student> {

	private Connection con;
	
	
	public StudentRepositoryImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean save(Student obj) {

		String sql = "insert into lumen_student values(?,?,?)";
		int rowUpdated =0;
		try {
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, obj.getRollNumber());
			pstmt.setString(2, obj.getFirstName());
			pstmt.setDouble(3, obj.getMarkScored());
			
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return rowUpdated==1?true:false;
	}

	@Override
	public Collection<Student> findAll() {

		List<Student> studList = new ArrayList<>();
		
		try {
		
			String sql = "select * from lumen_student";
			
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				// propName (From the Student Class)  = columnName from the lumen_student table
				int rollNumber = rs.getInt("rollNumber");
				String firstName = rs.getString("firstName");
				double markScored = rs.getDouble("markScored");
				
				Student obj = new Student(rollNumber, firstName, markScored);
				
				studList.add(obj);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return studList;
	}

	@Override
	public boolean delete(Student obj) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
