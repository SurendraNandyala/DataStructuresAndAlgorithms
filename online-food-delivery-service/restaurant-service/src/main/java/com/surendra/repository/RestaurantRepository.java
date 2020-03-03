package com.surendra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.surendra.model.Restaurant;

public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, String> {
	
}
