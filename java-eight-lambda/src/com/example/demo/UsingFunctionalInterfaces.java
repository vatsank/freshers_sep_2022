package com.example.demo;

import com.example.demo.ifaces.Converter;

public class UsingFunctionalInterfaces {

	public static void print(Converter<Double,Double> conv) {
		System.out.println(conv.convert(100.00D));
		
	}
	
	public static void main(String[] args) {

		// Verbose
//		Converter<Double, Double> dlrToInr =
//				    (Double dlr) -> { return dlr * 90;};

		//concise
				    Converter<Double, Double> dlrToInr =
						    (dlr) ->   dlr * 90;


						    Converter<Double, Double> euroToInr =
								    (dlr) ->   dlr * 120;

						print(dlrToInr);
						print(euroToInr);
						
						print( (val) -> val *100);
						 
	}

}
