package com.geoLocation.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geoLocation.dataService.ShopService;
import com.geoLocation.model.Merchant;
import com.geoLocation.model.User;

//import com.model.Merchant;

@RestController

public class ShopController {

	Map<Long, Merchant> employeeMap = new HashMap<>();
	@Autowired
	private ShopService shopService;

	
	@RequestMapping(value = "/employee/", method = RequestMethod.POST)
	public @ResponseBody Merchant getMerchantById(@RequestBody User user) {
		
		return shopService.getShopDetails(user);
	
	}

}
