package com.surendra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surendra.service.MenuItemService;
import com.surendra.service.RestaurantService;

@RestController
@RequestMapping("/api")
public class RestaurantServiceController {
	
	private RestaurantService restaurantService;
	private MenuItemService menuItemService;
	
	@Autowired
	public RestaurantServiceController(RestaurantService restaurantService, MenuItemService menuItemService)
	{
		this.restaurantService = restaurantService;
		this.menuItemService = menuItemService;
	}

}
