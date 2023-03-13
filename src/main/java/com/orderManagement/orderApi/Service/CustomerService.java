package com.orderManagement.orderApi.Service;

import com.orderManagement.orderApi.Entity.Customer;

import java.math.BigInteger;
import java.util.List;

public interface CustomerService {

    public List<Customer> getAllCustomers();

    public Customer getCustomerById(int id);

    public Customer getCustomerByName(String CustomerName);

    public void addCusotmer(Customer customer);

    public void UpdateCustomer(int CustomerId,Customer UpdatedCusotmer);

    public void DeleteCustomer(int CustomerId);

}
