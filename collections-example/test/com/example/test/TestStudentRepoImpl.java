package com.example.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.daos.StudentRepositoryImpl;
import com.training.model.Student;

public class TestStudentRepoImpl {

	
	@Test
	@DisplayName(value = "Find All Method should not return null")
	void testFindAll() {
		
		StudentRepositoryImpl repo = new StudentRepositoryImpl();
		
		assertNotNull(repo.findAll());
		
	}
	
	@Test
	@DisplayName(value = "add Method should return true while adding element successfully")
	void testSave() {
		
		StudentRepositoryImpl repo = new StudentRepositoryImpl();
		
		assertEquals(true,repo.save(new Student(101,"Ramesh",50)));
		
	}

	@Test
	@DisplayName(value = "add Method should should throw exception if element is already present")
	void testSaveThrowsException() {
		
		StudentRepositoryImpl repo = new StudentRepositoryImpl();
		
		assertThrows(RuntimeException.class, () -> repo.save(new Student(101,"Ramesh",50)));
		
	}

	@Test
	@DisplayName(value = "Find All Method should return a collection size greatert than or equal toThree")
	void testFindAllReqTwo() {
		
		StudentRepositoryImpl repo = new StudentRepositoryImpl();
		
		assertEquals(3,repo.findAll().size());
		
	}
	
}
