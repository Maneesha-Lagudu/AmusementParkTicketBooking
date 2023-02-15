package com.cg.AmusementParkTicketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.AmusementParkTicketbooking.entities.Admin;
import com.cg.AmusementParkTicketbooking.service.AdminService;


@RestController
@RequestMapping("/Admin")

public class AdminController {
	@Autowired
	private AdminService adminService;
	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return adminService.addAdmin(admin);
	} 
//	@GetMapping("/getAllActivitySchedule/{ticketBookId}")
//	public List<TicketBooking> getAllActivities(@PathVariable ("ticketBookId") int ticketBookId){
//		return adminService.getAllActivities(ticketBookId);
//	}
//	@GetMapping("/getActivitiesByDate")
//	public List<ActivitySchedule> getActivitiesByDate(@RequestBody Date date){
//		return adminService.getActivitiesDatewise(date);
//	}
	@PutMapping("/updateAdmin/{customerId}")
	public Admin updateAdmin(@PathVariable("adminId")int adminId ,@RequestBody Admin admin) {
		return adminService.updateAdmin(adminId,admin);
	}
	@DeleteMapping("/deleteAdmin")
	public void deleteAdmin(int adminId) {
		
	}
}
