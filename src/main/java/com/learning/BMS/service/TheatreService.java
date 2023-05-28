package com.learning.BMS.service;

import org.springframework.stereotype.Service;

import com.learning.BMS.repository.TheatreRepository;

@Service
public class TheatreService {
	private TheatreRepository theatreRepository;

	public TheatreService(TheatreRepository theatreRepository) {
		this.theatreRepository = theatreRepository;
	}
	
	
}
