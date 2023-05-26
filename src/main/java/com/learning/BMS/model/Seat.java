package com.learning.BMS.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.learning.BMS.model.enums.SeatStatus;
import com.learning.BMS.model.enums.SeatType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel {

	private String name;

	@Column(name = "seat_row")
	private int row;

	@Column(name = "seat_column")
	private int column;

	@Enumerated(EnumType.ORDINAL)
	private SeatType seatType;

	@Enumerated(EnumType.ORDINAL)
	private SeatStatus seatStatus;
}
