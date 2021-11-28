package com.saraya.capstonespring.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.saraya.capstonespring.model.Flight;

@Repository
public class FlightRepositoryImpl implements FlightRepositoryInterface {
	
	public static List <Flight> flights = new ArrayList<>();
	private static int count = 0;
	
	static {
		flights.add(new Flight("Air Senegal", "Dakar","New York", "6250.00", "12",20));
		flights.add(new Flight("Air Mali", "Bamako","New York", "3450.00", "12",35));
		flights.add(new Flight("Air Guinee", "Conakry","Conakry", "4550.00", "12",30));
		flights.add(new Flight("Air Cote d'ivoire", "Abidjan","New York", "3050.00", "12",12));
		
	}

	@Override
	public Flight addFlight(Flight flight) {
		flight.setFlightId(String.valueOf(++count));
		flights.add(flight);
		return flight;
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return flights;
	}

	@Override
	public List<Flight> search(String source, String destination, String journeyDate) {
		List<Flight> filtered = new ArrayList<Flight>();
		for (Flight flight : flights) {
			if(flight.getSources().equals(source) && flight.getDestination().equals(destination)
					&& flight.getJourneyDate().equals(journeyDate)) {
				filtered.add(flight);
			}
		}
		return filtered;
	}

	@Override
	public void createFlight(String airlines, String sources, String destination, String fare, String journeyDate,
			Integer seatCount) {
		flights.add(new Flight( airlines, sources, destination, fare, journeyDate,
				seatCount));
		
		
	}

}

	
	
	
	
	

