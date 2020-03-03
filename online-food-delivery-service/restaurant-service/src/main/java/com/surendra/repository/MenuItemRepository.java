package com.surendra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.surendra.model.MenuItem;

public interface MenuItemRepository extends PagingAndSortingRepository<MenuItem, String>{

}
