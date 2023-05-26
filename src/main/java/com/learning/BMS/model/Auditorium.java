package com.learning.BMS.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.learning.BMS.model.enums.Feature;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Auditorium extends BaseModel {

	private String name;

	@OneToMany
	private List<Seat> seats;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> features;
}
