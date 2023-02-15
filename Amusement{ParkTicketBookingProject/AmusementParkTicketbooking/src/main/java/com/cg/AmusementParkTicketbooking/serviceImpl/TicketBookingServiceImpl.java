package com.cg.AmusementParkTicketbooking.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.AmusementParkTicketbooking.Dto.BookingDto;
import com.cg.AmusementParkTicketbooking.Exception.ActivityNotFoundException;
import com.cg.AmusementParkTicketbooking.Exception.CustomerNotFoundException;
import com.cg.AmusementParkTicketbooking.Exception.TickectBookingNotFoundException;
import com.cg.AmusementParkTicketbooking.Repository.ActivityRepository;
import com.cg.AmusementParkTicketbooking.Repository.CustomerRepository;
import com.cg.AmusementParkTicketbooking.Repository.TicketBookingRepository;
import com.cg.AmusementParkTicketbooking.entities.Activity;
import com.cg.AmusementParkTicketbooking.entities.Customer;
import com.cg.AmusementParkTicketbooking.entities.TicketBooking;
import com.cg.AmusementParkTicketbooking.service.TicketBookingService;
@Component
@Transactional
public class TicketBookingServiceImpl implements TicketBookingService{
	@Autowired
	private ActivityRepository actRepo;
	@Autowired
	private TicketBookingRepository ticketRepo;
	@Autowired
	private CustomerRepository custRepo;

	@Override
	public TicketBooking cancelTicket(int ticketBookingId) throws TickectBookingNotFoundException {
		TicketBooking ticket_booking = ticketRepo.findById(ticketBookingId).orElseThrow(()->new TickectBookingNotFoundException("Ticket Canecelled: "+ ticketBookingId));
		ticketRepo.deleteById(ticketBookingId);
		return ticket_booking;
	}

	@Override
	public BookingDto bookTicketService(BookingDto bookingDto) throws CustomerNotFoundException, ActivityNotFoundException {
	    Customer user = custRepo.findById(bookingDto.getCustomerId())
	            .orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID: " + bookingDto.getCustomerId()));

	    List<Integer> activityIds = bookingDto.getActivities();
	    List<Activity> activities = new ArrayList<>();
	    int totalPrice = 0;
	    StringBuilder activityName = new StringBuilder();

	    for (int activityId : activityIds) {
	        Activity activity = actRepo.findById(activityId)
	                .orElseThrow(() -> new ActivityNotFoundException("Activity not found with ID: " + activityId));
	        activities.add(activity);
	        totalPrice += activity.getPrice();
	        activityName.append(activity.getActivityName()).append(", ");
	    }

	    if (activityName.length() > 2) {
	        activityName.delete(activityName.length() - 2, activityName.length());
	    }

	    TicketBooking ticketBooking = new TicketBooking();
	    ticketBooking.setCustomer(user);
	    ticketBooking.setActivities(activityName.toString());
	    ticketBooking.setTotalPrice(totalPrice);
	    ticketRepo.save(ticketBooking);

	    return bookingDto;
	}

//	public BookingDto bookTicketService(BookingDto bookingDto) throws CustomerNotFoundException,ActivityNotFoundException{
//		Customer user=custRepo.findById(bookingDto.getCustomerId()).orElseThrow(()-> new CustomerNotFoundException("No Customer Found"));
//		List<Integer> activityIds=bookingDto.getActivities();
//		List<Activity>activities=new ArrayList<>();
//		int totalPrice=0;
//		StringBuilder activityName=new StringBuilder();
//		for(int activityId:activityIds){
//			Activity activity=actRepo.findById(activityId).orElseThrow(()->new ActivityNotFoundException(" Activity not found"));
//			activities.add(activity);
//			totalPrice+=activity.getPrice();
//			activityName.append(activity.getActivityName()).append(", ");
//		}
//		activityName.delete(activityName.length()-2,activityName.length());
//		TicketBooking ticketBooking=new TicketBooking();
//		ticketBooking.setCustomer(user);
//		ticketBooking.setActivities(activityName.toString());
//		ticketBooking.setTotalPrice(totalPrice);
//		ticketRepo.save(ticketBooking);
//		return bookingDto;
//		
	
}
