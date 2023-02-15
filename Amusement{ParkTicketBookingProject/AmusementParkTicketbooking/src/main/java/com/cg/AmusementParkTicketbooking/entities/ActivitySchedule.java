package com.cg.AmusementParkTicketbooking.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ActivitySchedule {
	@Id
@GeneratedValue
private int ActivityScheduleId;
private int activityId;
private String activityName;
private int seatTaken;
private float charges;
private LocalDate date;
public int getSeatTaken() {
	return seatTaken;
}
public void setSeatTaken(int seatTaken) {
	this.seatTaken = seatTaken;
}
public int getActivityScheduleId() {
	return ActivityScheduleId;
}
public void setActivityScheduleId(int activityScheduleId) {
	ActivityScheduleId = activityScheduleId;
}
public int getActivityId() {
	return activityId;
}
public void setActivityId(int activityId) {
	this.activityId = activityId;
}
public String getActivityName() {
	return activityName;
}
public void setActivityName(String activityName) {
	this.activityName = activityName;
}
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges = charges;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public ActivitySchedule() {
	super();
}

}
