package com.training.task;

import java.util.*;

public class ProductService {

	private List<Product> foodList;
	
	private List<Product> textileList;

	
	public ProductService() {
		super();
		this.foodList=new ArrayList();
		this.textileList=new ArrayList();
	}

	public boolean add(Product product) {
		
		if(product instanceof FoodProduct) {
			return this.foodList.add(product);
		} else {
			return this.textileList.add(product);
		}
	}
	
	public Collection<Product> findTopThree(int ch){
	
		Collections.sort(foodList);
		Collections.sort(textileList);
		
		List<Product> topThree=new ArrayList<Product>();
		if(ch ==1) {
			
		 for(int idx=0;idx<=2;idx++) {
		    	topThree.add(this.foodList.get(idx));
		  }
			
		}
		if(ch==2) {
			 for(int idx=0;idx<=2;idx++) {
			    	topThree.add(this.textileList.get(idx));
			  }
			
		}
		return topThree;
	}
	
	public Collection<Product> findLeastThree(int ch){
		
		return null;
	}
	
	
}
