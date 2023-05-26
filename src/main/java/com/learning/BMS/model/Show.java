package com.learning.BMS.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.learning.BMS.model.enums.Feature;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "movie_show")
@Getter
@Setter
public class Show extends BaseModel{

	@ManyToOne
	private Movie movie;
	
	private Date startTime;
	private Date endTime;
	
	@ManyToOne
	private Auditorium auditorium;
	
	@ElementCollection
	@Enumerated(EnumType.ORDINAL)
	private List<Feature> features;
	
	
}
