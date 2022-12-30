/*
 * Author Name: Philip Meshach
 * Date: 29-12-2022
 * Praise The Lord
 */
package com.niit.Customer.service;

import com.niit.Customer.domain.Customer;
import com.niit.Customer.exception.UserAlreadyExistException;
import com.niit.Customer.exception.UserNotFoundException;
import com.niit.Customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer addCustomer(Customer customer) throws UserAlreadyExistException {
    if (customerRepository.findById(customer.getCustomerId()).isEmpty()){
        Customer customer1=customerRepository.save(customer);
        return customer1;
    }
        throw new UserAlreadyExistException();
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public String deleteCustomer(Integer customerId) throws UserNotFoundException {
        if (customerRepository.findById(customerId).isEmpty()){
            throw new UserNotFoundException();
        }
       customerRepository.deleteById(customerId);
        return "Deleetd Successfully";
    }

    @Override
    public List<Customer> getAllTheDetailsWhoHaveBoughtSamsung(String productName) {
        return customerRepository.getAllTheDetailsWhoHaveBoughtSamsung(productName);
    }
}
