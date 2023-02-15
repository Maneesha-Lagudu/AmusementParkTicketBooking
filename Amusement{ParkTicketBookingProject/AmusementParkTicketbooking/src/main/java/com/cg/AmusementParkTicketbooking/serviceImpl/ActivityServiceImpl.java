package com.cg.AmusementParkTicketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cg.AmusementParkTicketbooking.Repository.ActivityRepository;
import com.cg.AmusementParkTicketbooking.entities.Activity;
import com.cg.AmusementParkTicketbooking.service.ActivityService;
@Component
@Transactional
public class ActivityServiceImpl  implements ActivityService{
@Autowired
private ActivityRepository repo;
@Override
public Activity addActivity(Activity activity) {
	repo.save(activity);
	return activity;
	
}

@Override
public Activity updateActivity(int activityId, Activity activity) {
	Activity a=repo.findById(activityId).get();
	repo.save(activity);
	return a;
}

@Override
public String removeActivity(int activityId) {
	repo.deleteById(activityId);
	return "selected Activity Row Deleted Successfully";
}

@Override
public List<Activity> viewActivitiesOfPrice(float price) {
	List<Activity>activity=repo.findByPrice(price);
	return activity;
}

@Override
public List<Activity> viewActivitiesOfPriceGreaterThanEqual(float price) {
	List<Activity>activity=repo.findByPriceGreaterThanEqual(price);
	return activity;
}

@Override
public List<Activity> viewActivitiesOfPriceLessThanEqual(float price) {
	List<Activity>activity=repo.findByPriceLessThanEqual(price);
	return activity;
}

@Override
public List<Activity> searchByActivityName(String activityName) {
	List<Activity>activity=repo.findByActivityName(activityName);
	return activity;
}

}
