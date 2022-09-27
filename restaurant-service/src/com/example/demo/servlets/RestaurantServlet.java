package com.example.demo.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.repos.RestaurantRepository;
import com.example.demo.services.RestaurantService;
import com.example.demo.utils.ConnectionFactory;
import com.training.model.Restaurant;

/**
 * Servlet implementation class RestaurantServlet
 */
@WebServlet("/restaurant")
public class RestaurantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private  RestaurantService service=null;
	
    @Override
	public void init() throws ServletException {

    	service = new RestaurantService();
    	
    }

	/**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Collection<Restaurant> list = service.findAll();
		
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("showRestaurants.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String strId=  request.getParameter("id");
		 	int id = Integer.parseInt(strId);
		 
		   String restaurantName = request.getParameter("restaurantName");
		   
		   String strPinCode = request.getParameter("pinCode");
		     long pincode = Long.parseLong(strPinCode);
		   
		  String cuisine = request.getParameter("cuisine");
		  
		  Restaurant entity = new Restaurant(id, restaurantName, pincode, cuisine);
		  
		    String message =this.service.add(entity)?"One Record Added":"Exception";
		    
		    request.setAttribute("message", message);
		    
		    RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
		    dispatcher.forward(request, response);
		    
		  
			}

}
