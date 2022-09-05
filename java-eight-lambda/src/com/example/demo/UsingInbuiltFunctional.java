package com.example.demo;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class UsingInbuiltFunctional {

	public static void usingPredicate() {
		
		Predicate<Integer> result = (mark) -> mark >80;
		
		System.out.println("Is Pass:="+result.test(90));
		
		System.out.println("Is Fail:="+result.negate().test(90));
	}
	
	public static void usingConsumer() {
		
		
		//Consumer<String> printNames = (name) -> System.out.println(name);
		
		List<String> nameList = 
				 Arrays.asList("Anand","Vivek","Magesh","Zahir");
		
		nameList.forEach(System.out::println);
		
		
	}
	
	public static void usingfunction() {
		
		Function<Double,Double> dlrToInr= (dlr) -> dlr*90;
		 
		System.out.println(dlrToInr.apply(100.00D));
		 
				
				
		
	}
	public static void main(String[] args) {
		usingPredicate();
		
	}
}
