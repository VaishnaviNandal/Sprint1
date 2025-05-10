package com.mobile.dao;

import java.util.List;
import com.mobile.entity.Customer;

public interface CustomerDao {
    void createCustomer(Customer customer);
    List<Customer> getAllCustomers();
    void updateCustomer(String customerId, Customer updatedCustomer);
    void deleteCustomer(String customerId);
}
