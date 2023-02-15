package com.cg.AmusementParkTicketbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.AmusementParkTicketbooking.entities.Activity;
import com.cg.AmusementParkTicketbooking.service.ActivityService;

@RestController
@RequestMapping("/activities")
public class ActivityController {
	@Autowired
	private ActivityService actService;
	@PostMapping("addActivities")
	public Activity addActivity(@RequestBody Activity activity) {
		return actService.addActivity(activity);
	}
	@GetMapping("/{price}")
	public List<Activity>viewActivitiesOfPrice(@PathVariable("price")float price){
		return actService.viewActivitiesOfPrice(price);
	}
	@GetMapping("/pricesLessThanEqual/{price}")
	public List<Activity> viewActivitiesOfPriceLessThanEqual(@PathVariable("price") float price){
		return actService.viewActivitiesOfPriceLessThanEqual(price);
	}
	@GetMapping("/pricesGreaterThanEqual/{price}")
	public List<Activity> viewActivitiesOfPriceGreaterThanEqual(@PathVariable("price") float price){
		return actService.viewActivitiesOfPriceGreaterThanEqual(price);
	}
	@GetMapping("/searchActivities/{activityName}")
	public List<Activity> searchByActivityName(@PathVariable("activityName")String activityName){
		return actService.searchByActivityName(activityName);
	}
	@PutMapping("updateActivities/{activityId}")
	public Activity update(@RequestBody Activity activity) {
		return actService.updateActivity(activity.getActivityId(), activity);
	}
 
}
