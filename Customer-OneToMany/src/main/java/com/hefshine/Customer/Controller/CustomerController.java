package com.hefshine.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hefshine.Customer.Model.Customer;
import com.hefshine.Customer.Repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("SaveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping("AllCustomer")
	public List<Customer> showCustomer()
	{
		return customerRepository.findAll();	}

}
