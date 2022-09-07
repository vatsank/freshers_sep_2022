package com.training;

public class ResultService {

	public String findResult(int mark){

		   String result ="O";
		   if(mark<=60)
		   {
		          result="B";
		   }
		   if(mark>60 && mark<=80)
		   {
		        result ="C";
		   }
		   return result;

		   }

}
