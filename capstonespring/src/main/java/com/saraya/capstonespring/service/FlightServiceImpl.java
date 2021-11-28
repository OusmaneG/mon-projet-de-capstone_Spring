package com.saraya.capstonespring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saraya.capstonespring.model.Flight;
import com.saraya.capstonespring.repository.FlightRepositoryImpl;

@Service
public class FlightServiceImpl implements FlightServiceInterface {
	
	@Autowired
	FlightRepositoryImpl repo;

	@Override
	public Flight showFlight(Flight flight) {
		return repo.addFlight(flight);
	}

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return repo.getAllFlight();
	}

	@Override
	public void createFlight(String airlines, String sources, String destination, String fare, 
			String journeyDay, Integer SeatCount) {
		repo.createFlight(airlines, sources, destination, fare, journeyDay, SeatCount);
			
	}

	
//	@Override
//	public List<Flight> searchFlight() {
//		// TODO Auto-generated method stub
//		return repo.allFlight();
//	}


	
}
