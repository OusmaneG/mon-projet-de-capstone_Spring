package com.saraya.capstonespring.repository;


import java.util.List;

import com.saraya.capstonespring.model.Flight;

public interface FlightRepositoryInterface {
	
	public Flight addFlight(Flight flight);
	public List<Flight> getAllFlight();
	public List<Flight> search(String source, String destination, String journeyDate);
	public void createFlight(String airlines, String sources, String destination, String fare, 
			String journeyDate, Integer seatCount); 

}
