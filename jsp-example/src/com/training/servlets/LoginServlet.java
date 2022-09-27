package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();

       // System.out.println("Constructor Called :="+ getServletConfig().getServletName());
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String reqURL = request.getServletPath();
		
		String modifiedURL = reqURL.substring(1);
		
		System.out.println("Request URL"+ modifiedURL);
		
		RequestDispatcher dispatcher=null;
		  HttpSession session = request.getSession();

		switch (modifiedURL) {
		case "login":
			dispatcher =request.getRequestDispatcher("login.jsp");
			break;
		case "success":
			 session.setAttribute("userName", "Ramesh");

			dispatcher=request.getRequestDispatcher("success.jsp");
			break;
		case "failure":
			 getServletContext().setAttribute("designer", "Ramesh");
			dispatcher=request.getRequestDispatcher("failure.jsp");
			break;
		case "logout":
			 session.invalidate();
				dispatcher=request.getRequestDispatcher("login.jsp");

		     break;
		default:
			break;
		}
		dispatcher.forward(request, response);
		
	}

	@Override
	public void destroy() {
		
		System.out.println("Destroy Method Called");
	}

	@Override
	public void init() throws ServletException {
        System.out.println("Init Called :="+ getServletConfig().getServletName());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   String reqURL = request.getServletPath();
		
		String modifiedURL = reqURL.substring(1);
	

		switch (modifiedURL) {
		case "login":
			handleLogin(request,response);
			break;

		default:
			break;
		}
	
	}

	private void handleLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("failure.jsp");

		if(userName.equals("india") && password.equals("india")) {
			dispatcher=request.getRequestDispatcher("success.jsp");
			  HttpSession session = request.getSession();
				 session.setAttribute("userName", userName);
				 session.setAttribute("isLogged", "yes");
		} 
		 getServletContext().setAttribute("designer", "Ramesh");

		dispatcher.forward(request, response);
		
		
	}

}
