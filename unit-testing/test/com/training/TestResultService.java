package com.training;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
public class TestResultService {
	
	private ResultService service;
	@BeforeAll
	static void setUp() {
		
		System.out.println("Before All Called");
	}
	
	@AfterAll
	static void tearDown() {
		
		System.out.println("After All Called");
	}
	
	@Test
	@DisplayName(value = "Find Result Should not Return Null")
	void testFindResultForNotNull() {
		
		assertNotNull(service.findResult(90));
		
		
	}
	
	@Test
	@DisplayName(value = "Find Result Should Grade B for Marks 0 to 60")
	void testFindResultfirstCondition() {
		
		assertEquals("B",service.findResult(60));
		
		
	}
	
	@BeforeEach
	void init(TestInfo info) {
		
		service = new ResultService();
		System.out.println("Called Before :="+
		              info.getTestMethod().get().getName());
	}
	
	@AfterEach
	void destory(TestInfo info) {
		service = null;
		System.out.println("Called After :="+
		               info.getTestMethod().get().getName());

	}
	
}
