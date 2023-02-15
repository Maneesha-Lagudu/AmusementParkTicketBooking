package com.cg.AmusementParkTicketbooking.Exception;

public class CustomerNotFoundException extends Exception{
	private static final long serialVersionUID = -6172433694395152817L;
	public CustomerNotFoundException(String msg){
		super(msg);
	}
}
