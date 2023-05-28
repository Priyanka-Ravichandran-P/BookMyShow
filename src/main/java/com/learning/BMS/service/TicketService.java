package com.learning.BMS.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;

import com.learning.BMS.exception.ShowSeatNotAvailableException;
import com.learning.BMS.model.ShowSeat;
import com.learning.BMS.model.Ticket;
import com.learning.BMS.model.enums.ShowSeatState;
import com.learning.BMS.repository.ShowRepository;
import com.learning.BMS.repository.ShowSeatRepository;
import com.learning.BMS.repository.TicketRepository;
import com.learning.BMS.repository.UserRepository;

@Service
public class TicketService {
	private TicketRepository ticketRepository;
	private ShowSeatRepository showSeatRepository;
	private ShowRepository showRepository;
	private UserRepository userRepository;

	public TicketService(TicketRepository ticketRepository, ShowSeatRepository showSeatRepository,
			ShowRepository showRepository, UserRepository userRepository) {
		this.ticketRepository = ticketRepository;
		this.showSeatRepository = showSeatRepository;
		this.showRepository = showRepository;
		this.userRepository = userRepository;
	}

	@Transactional(isolation = Isolation.SERIALIZABLE)  //sets the Transaction isolation level as SERIALIZABLE
	public Ticket bookTicket(Long showId, List<Long> showSeatIds, Long userId) throws ShowSeatNotAvailableException {

		List<ShowSeat> showSeats = showSeatRepository.findByIdIn(showSeatIds);
		for (ShowSeat showSeat : showSeats) {
			if (!showSeat.getSeatState().equals(ShowSeatState.AVAILABLE)) {
				throw new ShowSeatNotAvailableException("Show seat is not available");
			}
		}
		for (ShowSeat showSeat : showSeats) {
			showSeat.setSeatState(ShowSeatState.LOCKED);
			showSeatRepository.save(showSeat);
		}

		// wait for payment confirmation
		// assuming payment is done
		// create and return the ticket object
		Ticket ticket = new Ticket();
		ticket.setShowSeats(showSeats);
		ticket.setShow(showRepository.findById(showId).get());
		ticket.setBookedBy(userRepository.findById(userId).get());

		ticketRepository.save(ticket);

		// Once Ticket is generated change the status to booked
		for (ShowSeat showSeat : showSeats) {
			showSeat.setSeatState(ShowSeatState.BOOKED);
			showSeatRepository.save(showSeat);
		}

		return ticket;
	}

}
