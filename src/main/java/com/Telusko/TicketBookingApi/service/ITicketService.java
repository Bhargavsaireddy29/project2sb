package com.Telusko.TicketBookingApi.service;

import com.Telusko.TicketBookingApi.model.User;

public interface ITicketService 
{
   public User registerPassenger(User user);
   public User fetchUserInfo(Integer id);
}
