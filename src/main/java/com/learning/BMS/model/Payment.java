package com.learning.BMS.model;

import java.util.Date;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.learning.BMS.model.enums.PaymentMethod;
import com.learning.BMS.model.enums.PaymentStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment extends BaseModel {
	private double amount;
	private Date paymentDateTime;
	private String referenceID;
	
	@Enumerated(EnumType.ORDINAL)
	private PaymentMethod method;

	@Enumerated(EnumType.ORDINAL)
	private PaymentStatus status;
	
	@ManyToOne
	private Ticket ticket;
	
}
