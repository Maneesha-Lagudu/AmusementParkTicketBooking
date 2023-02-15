package com.cg.AmusementParkTicketbooking.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.AmusementParkTicketbooking.Repository.AdminRepository;
import com.cg.AmusementParkTicketbooking.entities.Admin;
import com.cg.AmusementParkTicketbooking.service.AdminService;
@Component
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepo;
//	@Autowired
//	private TicketBookingRepository ticketRepo;
//
	@Override
	public Admin addAdmin(Admin admin) {
		Admin a=adminRepo.save(admin);
		return a;
	}

	@Override
	public Admin updateAdmin(int adminId,Admin admin) {
		Admin a=adminRepo.findById(adminId).get();
		adminRepo.save(admin);
		return a;
	}

	@Override
	public void deleteAdmin(int adminId) {
		adminRepo.deleteById(adminId);
	}

//	@Override
//	public List<TicketBooking> getAllActivitiesForDays(int customerId, LocalDateTime fromDate,
//			LocalDateTime toDate) {
//	 List<TicketBooking>activity=ticketRepo.findAll();
//		return activity;
//	}
//
//	@Override
//	public List<TicketBooking> getAllActivities(int ticketBookingId) {
//		List<TicketBooking>activity=ticketRepo.findActivityByTicketBookingId(ticketBookingId);
//		return activity;
//	}
//
//	@Override
//	public List<ActivitySchedule> getActivitiesDatewise(Date date) {
//		List<ActivitySchedule>activity=ticketRepo.findActivityByDate(date);
//		return activity;
//	}

}
