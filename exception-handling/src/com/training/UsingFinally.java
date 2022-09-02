package com.training;
import java.util.*;
public class UsingFinally {

	public static void main(String[] args) {

		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your name");
//		String name = sc.next();
//		
//		System.out.println(name.toUpperCase());
//		
//		
//		sc.close();

		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter your name");
			String name = sc.next();
			
			System.out.println(name.toUpperCase());
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
