package com.geoLocation.dataRepository;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import com.geoLocation.model.LocationDatabase;
import com.geoLocation.model.Merchant;
import com.geoLocation.model.User;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.Location;
import com.maxmind.geoip2.record.Postal;
import com.maxmind.geoip2.record.Subdivision;

@Repository
public class ShopDaoImpl implements ShopDao {

	/*
	 * @Value("${database_Path}") private String path;
	 */
	@Override
	public Merchant getShopDetailsData(User user) {
		Merchant merchant = new Merchant();
		// A File object pointing to your GeoLite2 database
		// File dbFile = new File(user.getPath() + "/" +
		// LocationDatabase.DATABASE_CITY_PATH);
		// File file = new ClassPathResource("countries.xml").getFile();
		
		try {
			ClassPathResource classPathResource = new ClassPathResource(LocationDatabase.DATABASE_CITY_PATH);

	        InputStream inputStream = classPathResource.getInputStream();
	        File dbFile = File.createTempFile("test", ".mmdb");
	        try {
	            FileUtils.copyInputStreamToFile(inputStream, dbFile);
	        } finally {
	            IOUtils.closeQuietly(inputStream);
	        }
			//dbFile = new ClassPathResource(LocationDatabase.DATABASE_CITY_PATH).getFile();
			// This creates the DatabaseReader object,
			// which should be reused across lookups.

			DatabaseReader reader = new DatabaseReader.Builder(dbFile).build();

			// A IP Address
			InetAddress ipAddress = InetAddress.getByName(user.getId());

			// Get City info
			CityResponse response = reader.city(ipAddress);

			// Country Info
			Country country = response.getCountry();
			merchant.setCountryIsoCode(country.getIsoCode());
			merchant.setCountryName(country.getName());

			Subdivision subdivision = response.getMostSpecificSubdivision();
			merchant.setSubDivisionIsoCode(subdivision.getIsoCode());
			merchant.setSubDivisionName(subdivision.getName());

			// City Info.
			City city = response.getCity();
			merchant.setCityName(city.getName());

			// Postal info
			Postal postal = response.getPostal();
			merchant.setPinCode(postal.getCode());
			// Geo Location info.
			Location location = response.getLocation();

			// Latitude
			merchant.setLatitude(location.getLatitude());

			merchant.setLongitude(location.getLongitude());
			// Longitude

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeoIp2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return merchant;

	}

}
