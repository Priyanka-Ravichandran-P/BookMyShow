package com.learning.BMS.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Theatre extends BaseModel{
	private String name;
	private String address;
	@OneToMany
	private List<Auditorium> auditoriums;
	@ManyToOne
	private City city;
}
