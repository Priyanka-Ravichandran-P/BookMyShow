package com.learning.BMS.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class City extends BaseModel {
	private String name;
	
	@OneToMany
	private List<Theatre> theatres;
}
