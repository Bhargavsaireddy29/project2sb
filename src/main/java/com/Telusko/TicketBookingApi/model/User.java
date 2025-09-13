package com.Telusko.TicketBookingApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uId;
    private String name;
    private String departure;
    private String arrival;
    private String dateOfJourney;
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) 
	{
		this.uId = uId;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getDeparture() 
	{
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) 
	{
		this.arrival = arrival;
	}
	public String getDateOfJourney() 
	{
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) 
	{
		this.dateOfJourney = dateOfJourney;
	}
	public User(Integer uId, String name, String departure, String arrival, String dateOfJourney) 
	{
		super();
		this.uId = uId;
		this.name = name;
		this.departure = departure;
		this.arrival = arrival;
		this.dateOfJourney = dateOfJourney;
	}
	public User() 
	{
		super();
		
	}
	@Override
	public String toString() 
	{
		return "User [uId=" + uId + ", name=" + name + ", departure=" + departure + ", arrival=" + arrival
				+ ", dateOfJourney=" + dateOfJourney + "]";
	}
    
}
