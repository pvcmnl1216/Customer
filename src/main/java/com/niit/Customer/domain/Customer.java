/*
 * Author Name: Philip Meshach
 * Date: 29-12-2022
 * Praise The Lord
 */
package com.niit.Customer.domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    private int customerId;
    private String customerName;
    private long customerPhoneNo;
    private Product product;

    public Customer() {
    }

    public Customer(int customerId, String customerName, long customerPhoneNo, Product product) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.product = product;
    }
}
