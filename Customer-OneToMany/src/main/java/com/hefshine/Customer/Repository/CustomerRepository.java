package com.hefshine.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hefshine.Customer.Model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
