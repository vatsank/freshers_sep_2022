package com.training;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
	
	
	@Test
	@DisplayName(value="Combined Test for FindResult Method")
	void testResultCombined() {
		
		/*
		 * assertAll(string,Executable) 
		 * Executable is a varargs(can pass one or more values) 
		 * denoted by three dots ...
		 * and Executable is a functional interface
		 * which has one method execute
		 * What is passed here is the implementation of Executable
		 */
		assertAll("Multiple Tests",
				
				() -> assertEquals("B", service.findResult(52)),
				() -> assertEquals("C", service.findResult(75)),
				() -> assertEquals("O", service.findResult(93))
				
				);
	}
	
	@Test
	// @Disabled("Disabled waiting for detailed requirement")
	@DisplayName(value ="overloaded findResult with String should"
			+ " throw Number Format Exception if the argument to the method is "
			+ "string value if its a number it should return A for marks"
			+ "less than or equal to 70 and O for greater than 70")
	void testFindResultReturnValue() {
		
		assertAll("Testing Find Result Method",
				() -> { assertThrows(NumberFormatException.class, 
						  () -> service.findResult("Fifty"));},
						  
				() -> assertEquals("B", service.findResult("60")),
				() -> assertEquals("A", service.findResult("80")));
	
					  
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5})
	@DisplayName("Test getName Method has non null values in position 1,3,5")
	void testForNonNull(int pos) {
		
		assertNotNull(service.getNames().get(pos));
		
	}

	@ParameterizedTest
	@ValueSource(ints = {1,3,5})
	@DisplayName("Using Assumptions -Test getName Method has non null values in position 1,3,5 ")
	void testForNonNullWithAssumptions(int pos) {
		
		  String os =System.getProperty("os.name");
		  
		long freeMemory =Runtime.getRuntime().freeMemory();
		 
		 // assumeTrue(os.equals("Windows 10"));
		  assumeTrue(freeMemory >110000000);
		assertNotNull(service.getNames().get(pos));
		
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
