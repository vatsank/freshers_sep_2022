package com.training.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.model.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String strRollNumber=  request.getParameter("rollNumber");
		 	int rollNumber = Integer.parseInt(strRollNumber);
		 
		   String firstName = request.getParameter("firstName");
		   
		   String strMark = request.getParameter("markScored");
		     double markScored = Double.parseDouble(strMark);
		   
		  String strDate = request.getParameter("dateOfBirth");
		  
		  LocalDate dateOfBirth = LocalDate.parse(strDate);
		  
		  Student obj = new Student(rollNumber, firstName, markScored,dateOfBirth);
		  
		 
		  System.out.println(obj);
	}

}
