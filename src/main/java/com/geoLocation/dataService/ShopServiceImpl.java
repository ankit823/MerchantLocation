package com.geoLocation.dataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geoLocation.dataRepository.ShopDao;
import com.geoLocation.dataRepository.ShopDaoImpl;
import com.geoLocation.model.Merchant;
import com.geoLocation.model.User;

@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopDao shopDao;

	@Override
	public Merchant getShopDetails(User user) {

		return shopDao.getShopDetailsData(user);
	}

}
