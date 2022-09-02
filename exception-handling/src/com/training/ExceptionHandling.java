package com.training;

public class ExceptionHandling {

	public static void multiCatchAnotherWay() {

		try {
			Object strMark = "hundred";
			
			//Integer strMark = Integer.valueOf(100);
			
			String strAge = "Twenty";

			int age = Integer.parseInt(strAge);
			
			System.out.println("Age :="+age);

			
			Integer mark =(Integer)strMark;

			
			System.out.println("Mark:="+mark);  // When there is an exception this line will not excute

		} catch (ClassCastException | NumberFormatException e) {

			System.err.println(e.getClass().getName());
		}
		
	}

	
	
	public static void multiCatch() {

		try {
			Object strMark = "hundred";
			
			//Integer strMark = Integer.valueOf(100);
			
			String strAge = "20";

			int age = Integer.parseInt(strAge);
			
			System.out.println("Age :="+age);

			
			Integer mark =(Integer)strMark;

			
			System.out.println("Mark:="+mark);  // When there is an exception this line will not excute

		} catch (ClassCastException e) {

			System.err.println("ERR-102 - Illegal Casting ");
		}
        catch(NumberFormatException e) {
        	System.out.println("ERR-103 Value of Age should be a number");
        }
	}
	public static void print() {
		
		try {
			//Object strMark = "hundred";
			
			Integer strMark = Integer.valueOf(100);
			
			Integer mark =(Integer)strMark;

			System.out.println(mark);  // When there is an exception this line will not excute

		} catch (ClassCastException e) {

			
		}
		
		System.out.println("Done !"); // this line always gets executed
		
		
	}
	
	
	public static void main(String[] args) {
	
		//print();
		
		//multiCatch();
		
		multiCatchAnotherWay();
	}

}
