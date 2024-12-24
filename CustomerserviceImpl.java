package com.customer.customerdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.customerdata.model.Customer;
import com.customer.customerdata.repository.CustomerRepo;
@Service
public class CustomerserviceImpl implements Customerservice {
    
    CustomerRepo repo;
    
        public CustomerserviceImpl (CustomerRepo repo){
            this.repo = repo; //constructor injection - repository
        }
    
   @Override
    public Customer getCustomerdetails(String customer_id) {
        return repo.findById(customer_id).get();
    }

    @Override
    public String createcustomerdetails(Customer data) {
        repo.save(data);
        return "saved";
    }

    @Override
    public String updatecustomerdetails(Customer data) {
      repo.save(data);
      return "updated";
    }

    @Override
    public String deletecustomerdetails(String customer_id) {
        repo.deleteById(customer_id);
        return "deleted";
    }

    @Override
    public List<Customer> getAllCustomerdetails(){
        return repo.findAll();
    }

   
        
    }


