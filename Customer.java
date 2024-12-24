package com.customer.customerdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//model class - achieved by encapsulation
@Entity
@Table(name = "customer_data")
public class Customer {
    @Id
    private String customer_id;
    private String customer_name;
    private String customer_age;
    private String customer_gender;
    private String customer_phone;
    
    public Customer() {
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_age() {
        return customer_age;
    }

    public void setCustomer_age(String customer_age) {
        this.customer_age = customer_age;
    }

    public String getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(String customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }
    
    
}

