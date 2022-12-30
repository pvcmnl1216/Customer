/*
 * Author Name: Philip Meshach
 * Date: 29-12-2022
 * Praise The Lord
 */
package com.niit.Customer.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Customer {
    @Id
    private int customerId;
    private String customerName;
    private String customerPhoneNo;
    private Product product;

    public Customer() {
    }

    public Customer(int customerId, String customerName, String customerPhoneNo, Product product) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhoneNo = customerPhoneNo;
        this.product = product;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPhoneNo=" + customerPhoneNo +
                ", product=" + product +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && Objects.equals(customerName, customer.customerName) && Objects.equals(customerPhoneNo, customer.customerPhoneNo) && Objects.equals(product, customer.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerPhoneNo, product);
    }
}
