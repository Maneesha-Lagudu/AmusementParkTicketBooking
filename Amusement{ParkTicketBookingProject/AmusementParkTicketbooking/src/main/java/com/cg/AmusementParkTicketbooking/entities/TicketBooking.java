package com.cg.AmusementParkTicketbooking.entities;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class TicketBooking {
@Id
@GeneratedValue
private int ticketBookingId;
private double totalPrice;
private String activities;
@OneToOne
@JoinColumn(name="customerId")
private Customer customer;
@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
@JoinColumn(name="ticketBookingId")
private List<Activity> activitiy;
public int getTicketBookingId() {
	return ticketBookingId;
}
public void setTicketBookingId(int ticketBookingId) {
	this.ticketBookingId = ticketBookingId;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public String getActivities() {
	return activities;
}
public void setActivities(String activities) {
	this.activities = activities;
}

}
