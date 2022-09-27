package com.example.demo.utils;
import java.sql.*;
import java.util.ResourceBundle;
import java.io.*;
public class ConnectionFactory {

	
	public static Connection getMySqlConnection() {
		
		Connection con =null;
		
		try {
			
			ResourceBundle bundle = ResourceBundle.getBundle("application");
			
			String url = bundle.getString("datasource.url");
			String userName= bundle.getString("datasource.username");
			String password = bundle.getString("datasource.password");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		con =	DriverManager.getConnection(url, userName,password);
		
			
		} catch (SQLException | ClassNotFoundException e) {

			 e.printStackTrace();
		}
		
		return con;
	}
}
