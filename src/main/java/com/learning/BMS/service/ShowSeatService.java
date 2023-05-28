package com.learning.BMS.service;

import org.springframework.stereotype.Service;

import com.learning.BMS.repository.ShowSeatRepository;

@Service
public class ShowSeatService {
	private ShowSeatRepository showSeatRepository;

	public ShowSeatService(ShowSeatRepository showSeatRepository) {
		this.showSeatRepository = showSeatRepository;
	}
	
	
}
