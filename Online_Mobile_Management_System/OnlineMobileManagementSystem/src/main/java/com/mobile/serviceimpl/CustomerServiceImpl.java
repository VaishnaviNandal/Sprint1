package com.mobile.serviceimpl;

import java.util.List;

import com.mobile.dao.CustomerDao;
import com.mobile.daoimpl.CustomerDaoImpl;
import com.mobile.entity.Customer;
import com.mobile.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDAO = new CustomerDaoImpl();

    @Override
    public void createCustomer(Customer customer) {
        customerDAO.createCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }

    @Override
    public void updateCustomer(String customerId, Customer updatedCustomer) {
        customerDAO.updateCustomer(customerId, updatedCustomer);
    }

    @Override
    public void deleteCustomer(String customerId) {
        customerDAO.deleteCustomer(customerId);
    }
}
