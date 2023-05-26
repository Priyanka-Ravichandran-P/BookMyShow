package com.learning.BMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.BMS.model.City;
import com.learning.BMS.service.CityService;

@RestController
public class CityController {
private CityService cityService;

public CityController(CityService cityService) {
	this.cityService = cityService;
}

@PostMapping("/city")
public City addCity(@RequestParam(name = "name") String name) {
	return this.cityService.addCity(name);
	
}
}
