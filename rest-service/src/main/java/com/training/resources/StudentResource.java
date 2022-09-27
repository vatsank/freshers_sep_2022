package com.training.resources;

import java.util.Collection;

import com.example.demo.repos.StudentRepositoryImpl;
import com.training.exceptions.ElementNotFoundException;
import com.training.model.Student;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/students")
public class StudentResource {

	private StudentRepositoryImpl repo ;
	
	public StudentResource() {
		super();
		this.repo = new StudentRepositoryImpl();
	}

	@Produces(value = MediaType.APPLICATION_JSON)
	@GET
	public Collection<Student> findAllStudent() {
		
		return repo.findAll();
	}
	
	@Produces(value = MediaType.APPLICATION_JSON)
	@Consumes(value = MediaType.APPLICATION_JSON)
	@POST
	public Response addStudent(Student entity) {
		
		boolean result = repo.save(entity);
		 
		return Response.ok(entity).status(201).build();
	}
	
	@Produces(value = MediaType.APPLICATION_JSON)
	@Consumes(value = MediaType.APPLICATION_JSON)
	@DELETE
	public Response removeStudent(Student entity) {
		boolean result =false;
		try {
			 result = repo.delete(entity);
		} catch (ElementNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return Response.ok().status(204).build();
	}
}
