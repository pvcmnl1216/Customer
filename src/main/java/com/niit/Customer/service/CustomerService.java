package com.niit.Customer.service;

import com.niit.Customer.domain.Customer;
import com.niit.Customer.exception.UserAlreadyExistException;
import com.niit.Customer.exception.UserNotFoundException;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer) throws UserAlreadyExistException;
    public List<Customer> getAll();
    public String deleteCustomer(Integer customerId) throws UserNotFoundException;
    public List<Customer> getAllTheDetailsWhoHaveBoughtSamsung(String productName);
}
