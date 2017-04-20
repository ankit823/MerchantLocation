package com.geoLocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
@Configuration
@ComponentScan(basePackages = "com.shop")
@EnableAutoConfiguration*/
@SpringBootApplication(scanBasePackages={"com.geoLocation"})
public class MerchantShopLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantShopLocationApplication.class, args);
	}
}
