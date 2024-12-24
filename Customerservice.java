package com.customer.customerdata.service;

import java.util.List;

import com.customer.customerdata.model.Customer;

public interface Customerservice {
    public Customer getCustomerdetails(String customer_id);
    public String createcustomerdetails(Customer data);
    public String  updatecustomerdetails(Customer data);
    public List<Customer> getAllCustomerdetails();
    public String deletecustomerdetails(String customer_id);

}
