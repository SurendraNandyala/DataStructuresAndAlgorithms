package com.surendra.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendra.repository.MenuItemRepository;
import com.surendra.service.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	private MenuItemRepository menuItemRepository;
	
	@Autowired
	public MenuItemServiceImpl(MenuItemRepository menuItemRepository)
	{
		this.menuItemRepository = menuItemRepository;
	}
}
