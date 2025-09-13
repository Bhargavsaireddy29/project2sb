package com.Telusko.TicketBookingApi.model;

public class Ticket 
{
  private Integer ticketNumber;
  private String status;
  private Double ticketPrice;
  private String name;
  private String departure;
  private String arrival;
  private String dateOfJourney;
public Integer getTicketNumber() 
{
	return ticketNumber;
}
public void setTicketNumber(Integer ticketNumber) 
{
	this.ticketNumber = ticketNumber;
}
public String getStatus() 
{
	return status;
}
public void setStatus(String status) 
{
	this.status = status;
}
public Double getTicketPrice() 
{
	return ticketPrice;
}
public void setTicketPrice(Double ticketPrice) 
{
	this.ticketPrice = ticketPrice;
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
public void setDeparture(String departure) 
{
	this.departure = departure;
}
public String getArrival() 
{
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
public Ticket(Integer ticketNumber, String status, Double ticketPrice, String name, String departure, String arrival,
		String dateOfJourney) 
{
	super();
	this.ticketNumber = ticketNumber;
	this.status = status;
	this.ticketPrice = ticketPrice;
	this.name = name;
	this.departure = departure;
	this.arrival = arrival;
	this.dateOfJourney = dateOfJourney;
}
public Ticket() 
{
	super();
	
}
@Override
public String toString() 
{
	return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", ticketPrice=" + ticketPrice + ", name="
			+ name + ", departure=" + departure + ", arrival=" + arrival + ", dateOfJourney=" + dateOfJourney + "]";
}
  
}
