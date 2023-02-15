package com.cg.AmusementParkTicketbooking.Dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;

public class BookingDto {
private int customerId;
@JsonFormat(pattern ="dd-MM-yyyy")
private LocalDate date;
public List<Integer> activities=new ArrayList<>();
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public List<Integer> getActivities() {
	return activities;
}
public void setActivities(List<Integer> activities) {
	this.activities = activities;
}
}
