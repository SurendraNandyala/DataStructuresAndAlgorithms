package com.surendra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendra.repository.RestaurantRepository;
import com.surendra.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	private RestaurantRepository restaurantRepository;
	
	@Autowired
	public RestaurantServiceImpl(RestaurantRepository restaurantRepository)
	{
		this.restaurantRepository = restaurantRepository;
	}
}
