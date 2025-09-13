package com.Telusko.TicketBookingApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Telusko.TicketBookingApi.model.User;

public interface ITicketRepo extends JpaRepository<User, Integer> 
{

}
