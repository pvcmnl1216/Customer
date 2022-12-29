package com.niit.Customer.service;

import com.niit.Customer.domain.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public List<Customer> getAll();
    public String deleteCustomer(Integer customerId);
    public List<Customer> getAllTheDetailsWhoHaveBoughtSamsung(String productName);
}
