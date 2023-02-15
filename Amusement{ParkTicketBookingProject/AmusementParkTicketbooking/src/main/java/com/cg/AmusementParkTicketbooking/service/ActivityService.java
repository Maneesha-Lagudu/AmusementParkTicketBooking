package com.cg.AmusementParkTicketbooking.service;

import java.util.List;

import com.cg.AmusementParkTicketbooking.entities.Activity;

public interface ActivityService {
	public Activity addActivity(Activity activity);
	public Activity updateActivity(int activityId,Activity activity);
	public String removeActivity(int activityId);
	public List<Activity> viewActivitiesOfPrice(float price);
	public List<Activity> viewActivitiesOfPriceGreaterThanEqual(float price);
	public List<Activity> viewActivitiesOfPriceLessThanEqual(float price);
//	public List<Activity> viewActivitiesOfPriceBetween(float price);
	public List<Activity> searchByActivityName(String activityName);
    
}
