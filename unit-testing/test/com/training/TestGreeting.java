package com.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestGreeting {

	@Test
	@DisplayName(value = "Test getMessage return a String of length less than or equal to FIVE")
	void testGetMessage() {

		Greeting grtObj = new Greeting();
		
		assertEquals(5, grtObj.getMessage().length());
	}

	@Test
	@DisplayName(value = "Test getMessage return a String Hello")
	void testGetMessageReturnValue() {

		Greeting grtObj = new Greeting();
		
		assertEquals("Hello", grtObj.getMessage());
	}

}
