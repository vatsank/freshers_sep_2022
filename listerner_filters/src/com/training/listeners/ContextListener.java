package com.training.listeners;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
@WebListener
public class ContextListener implements ServletContextListener, 
                          HttpSessionListener, HttpSessionAttributeListener {

    int count ;

    
    /**
     * Default constructor. 
     */
    public ContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 

    	System.out.println("Session Id:"+se.getSession().getId());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)   { 
         // TODO Auto-generated method stub
    	
    	System.out.println("Context Destroy called");
    	
    	File file = new File(Thread.currentThread().getContextClassLoader()
    			.getResource("count.txt").getFile());
    	
        try(  PrintWriter  output = new PrintWriter(file);)
                {
        	 int updatedCount = (int)sce.getServletContext().getAttribute("count");
        	System.out.println("D Count"+ updatedCount);
        	 output.println(updatedCount);
              }catch(Exception e) {
            	  e.printStackTrace();
              }
              

    	    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
         // TODO Auto-generated method stub
    	
    	System.out.println("Attribute Removed"+se.getName());
    	
    	se.getSession().setAttribute("details", "Added By Listener");

    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 

    	
    }
    

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	System.out.println("Context Init called");
		int count =0;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
        	File directory = new File(Thread.currentThread().getContextClassLoader()
        			.getResource("count.txt").getFile());

          fileReader = new FileReader(directory);
          bufferedReader = new BufferedReader(fileReader);
          String initial = bufferedReader.readLine();
          count = Integer.parseInt(initial);
          
          System.out.println("count"+count);
          }catch(Exception e) {
        	  e.printStackTrace();
          }

    	
    	sce.getServletContext().setAttribute("count", count);
    	
    }
	
}
