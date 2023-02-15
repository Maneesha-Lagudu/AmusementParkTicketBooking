package com.cg.AmusementParkTicketbooking.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.AmusementParkTicketbooking.Dto.BookingDto;
import com.cg.AmusementParkTicketbooking.Exception.ActivityNotFoundException;
import com.cg.AmusementParkTicketbooking.Exception.CustomerNotFoundException;
import com.cg.AmusementParkTicketbooking.Exception.TickectBookingNotFoundException;
import com.cg.AmusementParkTicketbooking.entities.TicketBooking;
import com.cg.AmusementParkTicketbooking.service.TicketBookingService;

@RestController
@RequestMapping("Ticket")
public class TickectBookingController {
	@Autowired
	private TicketBookingService ticketService;
@PostMapping("/book-rides")
public BookingDto bookRides(@RequestBody BookingDto bookingDto )throws CustomerNotFoundException,ActivityNotFoundException {
	return ticketService.bookTicketService(bookingDto);
	  
}
	
@DeleteMapping("cancelTicket/{ticketBookingId}")
public TicketBooking cancelTicket(@PathVariable("ticketBookingId") int ticketBookingId) throws TickectBookingNotFoundException{
	return ticketService.cancelTicket(ticketBookingId);}

}
