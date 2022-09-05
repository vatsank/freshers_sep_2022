package com.example.demo.ifaces;

@FunctionalInterface
public interface Converter<T,R> {

	public R convert(T t);
	public default void show(String msg) {
		
		System.out.println("Inside Converter"+msg);
	}
	
}
