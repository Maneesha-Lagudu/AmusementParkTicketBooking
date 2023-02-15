package com.cg.AmusementParkTicketbooking.service;

import java.util.List;
import com.cg.AmusementParkTicketbooking.entities.Customer;

public interface CustomerService {
public Customer addCustomerService(Customer customer);
public Customer updateCustomerService(int customerId,Customer customer);
public List<Customer>viewCustomer();
public Customer viewCustomer(int customerId);
public void saveCustomer(Customer customer);
}
