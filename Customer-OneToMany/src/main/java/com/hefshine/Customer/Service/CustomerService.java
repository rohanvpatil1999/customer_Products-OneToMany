package com.hefshine.Customer.Service;

import java.util.List;

import com.hefshine.Customer.Model.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	
	public List<Customer> findAll();

}
