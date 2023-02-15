package com.cg.AmusementParkTicketbooking.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.AmusementParkTicketbooking.entities.TicketBooking;

@Repository

public interface TicketBookingRepository extends JpaRepository<TicketBooking,Integer>{

	List<TicketBooking> findActivityByTicketBookingId(int ticketBookingId);

	

}
