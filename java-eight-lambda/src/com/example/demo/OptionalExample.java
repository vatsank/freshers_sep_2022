package com.example.demo;
import java.util.*;

import javax.management.RuntimeErrorException;
public class OptionalExample {

	public static void main(String[] args) {

		Optional<String> optional = Optional.empty();
		
//		String name = null;
//		System.out.println(name.length());
		
		Optional<Integer> choice = Optional.of(Integer.valueOf(200));
		
		if(optional.isPresent()) {
			System.out.println("Value:="+optional.get());
		}else {
			System.out.println("Value is Not Present");
		}
		
		
		choice.ifPresent( val -> System.out.println(val));
		
		Optional<String> oneMore = Optional.empty();
		
		oneMore.orElseThrow(() ->  new RuntimeException("Value of oneMore is  not present"));
		
		
	}

}
