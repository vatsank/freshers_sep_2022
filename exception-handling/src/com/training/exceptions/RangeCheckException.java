package com.training.exceptions;

/*
 *  This is a checked Exception since its extending the Exception class
 *  
 */
public class RangeCheckException extends Exception {

	private String errorCode;

	private String message;
	
	public RangeCheckException(String errorCode,String message) {
		super(message);
		this.errorCode = errorCode;
	}

	@Override
	public String getMessage() {
		return this.errorCode+":"+super.getMessage();
	}
	
	
}
