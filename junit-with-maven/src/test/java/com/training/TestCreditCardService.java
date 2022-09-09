package com.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCreditCardService {
	
	CrediCardService service;
	
	@BeforeEach
	void init() {
		service= new CrediCardService();
	}

	@DisplayName(value="Test is valid method return true for cardNumber 922 and for other cards false")
	@Test
	void testIsValid() {
		
		assertAll("Testing isValid Method",
				() -> assertEquals(true, service.isValid(922)),
				() -> assertEquals(false, service.isValid(925))
				);
		
	}
	
	@DisplayName(value="get credit limit method returns 500000 for card Numbers greater than 99999 and "
			+ "for others its 600000")
	@Test
	void testGetCreditLimit() {
		
		assertAll("Testing getCredit Limit Method",
				() -> assertEquals(500000, service.getCreditLimit(999999)),
				() -> assertEquals(600000, service.getCreditLimit(99999))
				);

	}
	
	
	
}
