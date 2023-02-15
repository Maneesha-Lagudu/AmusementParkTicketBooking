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

import com.cg.AmusementParkTicketbooking.entities.Customer;
import com.cg.AmusementParkTicketbooking.service.CustomerService;
@RestController
@RequestMapping("/Customer")
public class CustomerController {
@Autowired
private CustomerService custService;
@PostMapping("/addCustomer")
public Customer addCustomer(@RequestBody Customer customer) {
	return custService.addCustomerService(customer);
}
@PutMapping("/updateCustomer/{customerId}")
public Customer updateCustomer(@PathVariable("customerId")Integer customerId ,@RequestBody Customer customer) {
	return custService.updateCustomerService(customerId,customer);
}
@GetMapping("/viewCustomer")
public List<Customer>viewCustomer(){
	return custService.viewCustomer();
}
@GetMapping("/viewCustomer/{customerId}")
public Customer viewCustomer(@PathVariable("customerId")int customerId ) {
	return custService.viewCustomer(customerId);
}
}
