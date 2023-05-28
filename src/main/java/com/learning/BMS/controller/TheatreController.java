package com.learning.BMS.controller;

import org.springframework.web.bind.annotation.RestController;

import com.learning.BMS.service.TheatreService;

import lombok.Getter;
import lombok.Setter;

@RestController
public class TheatreController {
private TheatreService theatreService;

public TheatreController(TheatreService theatreService) {
	this.theatreService = theatreService;
}

}
