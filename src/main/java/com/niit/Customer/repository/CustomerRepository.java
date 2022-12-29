package com.niit.Customer.repository;

import com.niit.Customer.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer,Integer> {

    @Query("{'product.productName':{$in:[?0]}}")
    public List<Customer> getAllTheDetailsWhoHaveBoughtSamsung(String productName);
}
