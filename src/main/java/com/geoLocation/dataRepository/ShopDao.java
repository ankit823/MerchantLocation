package com.geoLocation.dataRepository;

import com.geoLocation.model.Merchant;
import com.geoLocation.model.User;


public interface ShopDao {

	Merchant getShopDetailsData(User user);
}
