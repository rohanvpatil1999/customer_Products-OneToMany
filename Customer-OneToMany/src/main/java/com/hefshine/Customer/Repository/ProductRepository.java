package com.hefshine.Customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hefshine.Customer.Model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
