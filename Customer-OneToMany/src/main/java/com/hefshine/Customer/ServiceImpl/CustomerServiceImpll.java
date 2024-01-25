package com.hefshine.Customer.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.Customer.Model.Customer;
import com.hefshine.Customer.Repository.CustomerRepository;
import com.hefshine.Customer.Service.CustomerService;

@Service
public class CustomerServiceImpll implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}

}
