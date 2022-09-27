package com.example.demo.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.repos.RestaurantRepository;
import com.training.model.Restaurant;

public class RestaurantService {

	private RestaurantRepository repo;
	public RestaurantService() {
		super();

		this.repo = new RestaurantRepository();
	}

	
	public boolean add(Restaurant entity) {
		
		return this.repo.save(entity);
	}
	
	public Collection<Restaurant> findAll(){
		
		return this.repo.findAll();
	}
}
