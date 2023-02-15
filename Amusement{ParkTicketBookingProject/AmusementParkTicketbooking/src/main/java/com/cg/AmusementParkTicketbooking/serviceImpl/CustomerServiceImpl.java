package com.cg.AmusementParkTicketbooking.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.cg.AmusementParkTicketbooking.Repository.CustomerRepository;
import com.cg.AmusementParkTicketbooking.entities.Customer;
import com.cg.AmusementParkTicketbooking.service.CustomerService;
@Component
@Transactional
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerRepository custRepo;
	@Override
	public Customer addCustomerService(Customer customer) {
		Customer cust= custRepo.save(customer);
		return cust;
	}

	@Override
	public Customer updateCustomerService(int customerId, Customer customer) {
		Customer cust=custRepo.findById(customerId).get();
		custRepo.save(customer);
		return cust;
		
	}

	@Override
	public List<Customer> viewCustomer() {
	List<Customer> cust=custRepo.findAll();
		return cust;
	}

	@Override
	public Customer viewCustomer(int customerId) {
	Customer cust=custRepo.findById(customerId).get();
		return cust;
	}
	@Override
	public void saveCustomer(Customer customer) {
		custRepo.save(customer);
		
	}
}