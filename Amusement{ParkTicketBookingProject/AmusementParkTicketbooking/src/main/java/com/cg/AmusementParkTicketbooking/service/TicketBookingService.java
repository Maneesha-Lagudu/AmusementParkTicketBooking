package com.cg.AmusementParkTicketbooking.service;

import com.cg.AmusementParkTicketbooking.Dto.BookingDto;
import com.cg.AmusementParkTicketbooking.Exception.ActivityNotFoundException;
import com.cg.AmusementParkTicketbooking.Exception.CustomerNotFoundException;
import com.cg.AmusementParkTicketbooking.Exception.TickectBookingNotFoundException;
import com.cg.AmusementParkTicketbooking.entities.TicketBooking;

public interface TicketBookingService {
public BookingDto bookTicketService(BookingDto bookingDto)throws CustomerNotFoundException,ActivityNotFoundException;
public TicketBooking cancelTicket(int ticketBookingId) throws TickectBookingNotFoundException;
}
