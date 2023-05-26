package com.learning.BMS.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.learning.BMS.model.enums.ShowSeatState;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{
	
	@ManyToOne
	private Show show;
	
	@ManyToOne
	private Seat seat;
	
	@Enumerated(EnumType.ORDINAL)
	private ShowSeatState seatState;

}
