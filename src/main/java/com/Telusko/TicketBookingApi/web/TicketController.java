package com.Telusko.TicketBookingApi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Telusko.TicketBookingApi.model.Ticket;
import com.Telusko.TicketBookingApi.model.User;
import com.Telusko.TicketBookingApi.service.ImpTicket;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "TicketBoolingApi", description = "There Are Two Apis running One For Generating Ticket Number and Other For Viewing Complete Ticket Booking Details")
public class TicketController {

    @Autowired
    private ImpTicket obj2;

    @PostMapping("/getTicketNumber")
    @Operation(summary = "POST Operation", description = "This Will Take User Details And Generate Ticket Number")
    public ResponseEntity<Ticket> registerUser(@RequestBody User user) {
        // Manually set the ticket number (uId)
        user.setuId(101); 
        System.out.println("User before saving: " + user);  // Log the user object before saving
        
        // Save user and create ticket object
        User savedUser = obj2.registerPassenger(user);
        System.out.println("User saved: " + savedUser);  // Log the saved user object
        
        Ticket ticket = new Ticket();
        ticket.setTicketNumber(savedUser.getuId());
        
        // Return the ticket with ticket number
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    @GetMapping("/getFullTicketNumber/{ticketNumber}")
    @Operation(summary = "GET Operation", description = "This Api will Take Ticket Number and Generate Complete Ticket Booking Information")
    public ResponseEntity<Ticket> getFullTicketDetails(@PathVariable("ticketNumber") Integer ticketNumber) {
        System.out.println("Received ticket number: " + ticketNumber);  // Log the received ticket number
        
        // Fetch user by ticket number (uId)
        User user = obj2.fetchUserInfo(ticketNumber);
        if (user != null) {
            System.out.println("Fetched User: " + user);  // Log the fetched user object
        } else {
            System.out.println("User not found for ticket number: " + ticketNumber);  // Log missing user
        }
        
        // Create the ticket and set the information
        Ticket ticket = new Ticket();
        ticket.setTicketNumber(user != null ? user.getuId() : null);
        ticket.setName(user != null ? user.getName() : "N/A");
        ticket.setDeparture(user != null ? user.getDeparture() : "N/A");
        ticket.setArrival(user != null ? user.getArrival() : "N/A");
        ticket.setDateOfJourney(user != null ? user.getDateOfJourney() : "N/A");
        ticket.setStatus("Booking Confirmed");
        ticket.setTicketPrice(345.00);
        
        // Return the ticket with full details
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }
}
