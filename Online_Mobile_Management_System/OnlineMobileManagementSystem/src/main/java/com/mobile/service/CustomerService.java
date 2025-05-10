package com.mobile.service;

import java.util.List;
import com.mobile.entity.Customer;

public interface CustomerService {
    void createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    void updateCustomer(String customerId, Customer updatedCustomer);
    void deleteCustomer(String customerId);
}
