package com.learning.BMS.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.learning.BMS.model.enums.TicketStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket extends BaseModel {
	private double totalAmount;
	private Date bookingTime;

	@ManyToOne
	private User bookedBy;

	@ManyToMany
	private List<ShowSeat> showSeats;

	@ManyToOne
	private Show show;

	@OneToMany
	private List<Payment> payment;
	
	@Enumerated(EnumType.ORDINAL)
	private TicketStatus ticketStatus;

}
