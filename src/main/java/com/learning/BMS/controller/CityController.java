package com.learning.BMS.controller;

import org.springframework.stereotype.Controller;
import com.learning.BMS.model.City;
import com.learning.BMS.service.CityService;

@Controller
public class CityController {
	private CityService cityService;

	public CityController(CityService cityService) {
		this.cityService = cityService;
	}

	public City addCity(String name) {
		return cityService.addCity(name);
	}
//@PostMapping("/city")
//public City addCity(@RequestParam(name = "name") String name) {
//	return this.cityService.addCity(name);
//	
//}
}
