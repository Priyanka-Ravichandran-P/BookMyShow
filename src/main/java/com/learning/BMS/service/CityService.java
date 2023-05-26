package com.learning.BMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.BMS.model.City;
import com.learning.BMS.repository.CityRepository;

@Service
public class CityService {
	private CityRepository cityRepository;
	
	@Autowired
	public CityService(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}
	
	public City addCity(String name) {
		City newCity = new City();
		newCity.setName(name);
		return this.cityRepository.save(newCity);
	}
}
