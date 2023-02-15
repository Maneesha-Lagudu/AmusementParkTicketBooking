package com.cg.AmusementParkTicketbooking.service;
import com.cg.AmusementParkTicketbooking.entities.Admin;


public interface AdminService {
 public Admin addAdmin(Admin admin);
 public Admin updateAdmin(int adminId,Admin admin);
 public void deleteAdmin(int adminId);
// public List<TicketBooking>getAllActivitiesForDays(int customerId,LocalDateTime fromDate,LocalDateTime toDate);
// public List<TicketBooking>getAllActivities(int ticketBookingId);
// public List<ActivitySchedule>getActivitiesDatewise(Date date);


}
 
