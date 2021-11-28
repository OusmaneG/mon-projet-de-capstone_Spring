package com.saraya.capstonespring.model;

import java.time.LocalDate;

public class Flight {
	
	private String flightId;
	private String airlines;
	private String sources;
	private String destination;
	private String fare;
	private String journeyDate;
	private Integer seatCount;
	
	public Flight() {
		super();
	}
	
	public Flight(String airlines, String sources, String destination, String fare, String journeyDate,
			Integer seatCount) {
		super();
		this.airlines = airlines;
		this.sources = sources;
		this.destination = destination;
		this.fare = fare;
		this.journeyDate = journeyDate;
		this.seatCount = seatCount;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getAirlines() {
		return airlines;
	}

	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public String toString() {
		return "Flight [airlines=" + airlines + ", sources=" + sources + ", destination=" + destination + ", fare="
				+ fare + ", journeyDate=" + journeyDate + ", seatCount=" + seatCount + "]";
	}
	
	
	
	
	
	
	


}
