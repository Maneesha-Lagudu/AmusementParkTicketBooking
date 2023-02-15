package com.cg.AmusementParkTicketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.AmusementParkTicketbooking.Repository.ActivityScheduleRepository;
import com.cg.AmusementParkTicketbooking.entities.ActivitySchedule;
import com.cg.AmusementParkTicketbooking.service.ActitvityScheduleService;
@Component
@Transactional
public class ActivityScheduleServiceImpl implements ActitvityScheduleService{
@Autowired
private ActivityScheduleRepository Repo;
	
@Override
public List<ActivitySchedule> showAllActivities() {
	
	return Repo.findAll();
}

}
