package com.example.demo.utils;
import java.sql.*;
import java.util.ResourceBundle;
import java.io.*;
public class ConnectionFactory {

	
	public static Connection getMySqlConnection() {
		
		Connection con =null;
		
		try {
			
//			ResourceBundle bundle = ResourceBundle.getBundle("application");
			
//			String url = bundle.getString("datasource.url");
//			String userName= bundle.getString("datasource.username");
//			String password = bundle.getString("datasource.password");
//			
		con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","srivatsan");
		
			
		} catch (SQLException e) {

			 e.printStackTrace();
		}
		
		return con;
	}
}
