package com.example.demo.ifaces;

@FunctionalInterface
public interface Transformer {

	public StringBuffer transform(String msg);
	
	public default void show(String msg) {
		
		System.out.println("Inside Transformer Method"+msg);
	}
}
