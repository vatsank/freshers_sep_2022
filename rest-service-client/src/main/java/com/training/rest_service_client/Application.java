package com.training.rest_service_client;

import com.training.model.Student;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
public class Application {

	public static void getAll() {
		
	Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/myapp/").path("api/students");
		   
		   Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		   
		   Response resp = builder.get();
		   
		   Student[] list =resp.readEntity(Student[].class);
		   
		   for(Student eachStudent:list) {
			   System.out.println(eachStudent);
		   }
              System.out.println("Status :=>" +resp.getStatus());
              
	}

	 public static void add(Student stud) {
		 
	 }
	
	
	public static void main(String[] args) {
		
		       add(new Student(39239, "Sagu", 65));
	          getAll();
	               
	          
	}

}
