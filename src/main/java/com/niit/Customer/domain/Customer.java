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

}
