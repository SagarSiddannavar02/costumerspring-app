package com.customer.customerdata.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.customerdata.model.Customer;
import com.customer.customerdata.service.Customerservice;

@RestController
@RequestMapping("/customer_data")
public class customerController {
    Customerservice service; //inject service

    public customerController(Customerservice service){ //custructor injection
        this.service = service;
    }


@GetMapping("{customer_id}")
public Customer  getCustomerdetails(@PathVariable String customer_id){
      return service. getCustomerdetails(customer_id);
      
}

@PostMapping
public String createCustomerdetails(@RequestBody Customer data ){
     service. createcustomerdetails(data);
     return "created successfully";
}

@PutMapping
public String updatecustomerdetails(@RequestBody Customer data){
    service. updatecustomerdetails(data);
    return "updated successfully";
}

@DeleteMapping("{customer_id}")
public String deletecuCustomerdetails(@PathVariable ("customer_id") String customer_id){
     service. deletecustomerdetails(customer_id);
     return "deleted successfully";
}
@GetMapping
public List<Customer> getAllCustomerdetails(){
    return service.getAllCustomerdetails();
}
}

