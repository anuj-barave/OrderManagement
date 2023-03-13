package com.orderManagement.orderApi.ServiceImpl;

import com.orderManagement.orderApi.Entity.Customer;
import com.orderManagement.orderApi.Repository.CustomerRepository;
import com.orderManagement.orderApi.Service.CustomerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAllFromCustomer();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer getCustomerByName(String CustomerName) {
        return customerRepository.findByName(CustomerName);
    }

    @Override
    public void addCusotmer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void UpdateCustomer(int CustomerId, Customer UpdatedCusotmer) {
        Customer customer = customerRepository.findById(CustomerId).orElse(null);
        customer.setName(UpdatedCusotmer.getName());
        customer.setAddress(UpdatedCusotmer.getAddress());
        customer.setPhoneNo(UpdatedCusotmer.getPhoneNo());
    }

    @Override
    public void DeleteCustomer(int CustomerId) {
        customerRepository.deleteById(CustomerId);
    }

}
