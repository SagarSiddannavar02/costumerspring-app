package com.customer.customerdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.customerdata.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, String> {
    
}
