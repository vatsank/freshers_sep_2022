package com.training;

public class CrediCardService {

	
	public boolean isValid(long cardNumber) {
		
		
		return cardNumber==922?true:false;
		
		
	}
	
	public double getCreditLimit(long cardNumber) {
		
		
		return cardNumber>99999?500000:600000;
	}
}
