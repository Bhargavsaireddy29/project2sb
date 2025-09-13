package com.Telusko.TicketBookingApi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Telusko.TicketBookingApi.model.User;
import com.Telusko.TicketBookingApi.repo.ITicketRepo;

@Service
public class ImpTicket implements ITicketService
{
	@Autowired
   private ITicketRepo obj;
	@Override
	public User registerPassenger(User user) 
	{

		return obj.save(user);
	}

	@Override
	public User fetchUserInfo(Integer id) 
	
	{
		Optional<User>op=obj.findById(id);
	
		return op.get();
	}
    
}
