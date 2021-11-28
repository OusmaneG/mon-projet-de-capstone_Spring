package com.saraya.capstonespring.service;


import java.util.List;

import com.saraya.capstonespring.model.Flight;

public interface FlightServiceInterface {
	
	public Flight showFlight(Flight flight) ;
	public List<Flight> getAllFlight();
	public void createFlight(String airlines, String sources, String destination, String fare, 
			String journeyDay, Integer SeatCount);
	
	

}
