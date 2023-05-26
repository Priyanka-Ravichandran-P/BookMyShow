package com.learning.BMS.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.learning.BMS.model.enums.Genre;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie extends BaseModel {
	private String name;
	
	@ManyToMany
	private List<Actor> actors;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> features;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Genre> genres;
	
}
