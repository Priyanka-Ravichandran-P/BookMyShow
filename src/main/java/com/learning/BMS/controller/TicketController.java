package com.learning.BMS.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.learning.BMS.exception.ShowSeatNotAvailableException;
import com.learning.BMS.model.Ticket;
import com.learning.BMS.service.TicketService;

@Controller
public class TicketController {
	private TicketService ticketService;
	
	public TicketController(TicketService ticketService) {
		this.ticketService = ticketService;
	}
	
	public Ticket bookTicket(Long showId, List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException {
		
		return this.ticketService.bookTicket(showId, showSeatIds, userId);
	}
}
