package com.saraya.capstonespring.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.capstonespring.model.Flight;
import com.saraya.capstonespring.service.FlightServiceImpl;

@Controller
public class FlightController {
	
	@Autowired
	FlightServiceImpl service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String ShowPage() {
		return "login";
	}
	
	
	@RequestMapping(value="/flight-list", method=RequestMethod.GET)
	public String ShowList(ModelMap model) {
		model.addAttribute("flights", service.getAllFlight());
		return "listFlight";
	}
	
	@RequestMapping(value="/flight-list", method=RequestMethod.POST)
	public String addFlight (@RequestParam String airlines,
			@RequestParam String sources, @RequestParam String destination,
			@RequestParam String fare, String journeyDate, Integer seatCount) {
	  service.createFlight(airlines, sources, destination, fare, journeyDate, seatCount);
		return "listFlight";
	}
	
	
}
