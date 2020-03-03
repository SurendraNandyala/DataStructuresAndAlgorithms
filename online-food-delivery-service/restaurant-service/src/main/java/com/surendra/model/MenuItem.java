package com.surendra.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Document
public class MenuItem {
	
	@Id
	private String id;
	
	private String restaurantId;
	private String name;
	private String description;
	private int price; 

}
