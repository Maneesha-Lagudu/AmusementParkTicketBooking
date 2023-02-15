package com.cg.AmusementParkTicketbooking.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.AmusementParkTicketbooking.entities.Customer;

@Repository

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	Customer findCustomerByUserNameAndEmail(String username, String email);
}
