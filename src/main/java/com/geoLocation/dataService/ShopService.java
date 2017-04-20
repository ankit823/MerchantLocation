package com.geoLocation.dataService;

import com.geoLocation.model.Merchant;
import com.geoLocation.model.User;


public interface ShopService {

	Merchant getShopDetails(User user);
}
