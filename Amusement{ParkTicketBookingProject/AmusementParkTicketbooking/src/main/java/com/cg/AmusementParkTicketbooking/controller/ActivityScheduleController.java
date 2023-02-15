package com.cg.AmusementParkTicketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.AmusementParkTicketbooking.entities.ActivitySchedule;
import com.cg.AmusementParkTicketbooking.service.ActitvityScheduleService;
@RestController
@RequestMapping("/activityScheduler")
public class ActivityScheduleController {
@Autowired
private ActitvityScheduleService actSchedule;
@GetMapping("/showAllActivities")
public List<ActivitySchedule>showAllActivities(){
	  return actSchedule.showAllActivities();
}
}
