package com.geoLocation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

	@Value("${database_Path}")
	private String path;

	@RequestMapping(value = "/employee/", method = RequestMethod.POST)
	public @ResponseBody Merchant getMerchantById(@RequestBody User user) {
		user.setPath(path);
		return shopService.getShopDetails(user);
		// employeeMap.get(Id);
	}

}
