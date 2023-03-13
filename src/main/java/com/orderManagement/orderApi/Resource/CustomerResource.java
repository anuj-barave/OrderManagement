package com.orderManagement.orderApi.Resource;

import com.orderManagement.orderApi.Entity.Customer;
import com.orderManagement.orderApi.Entity.orderapp;
import com.orderManagement.orderApi.ServiceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerResource {

    @Autowired
    CustomerServiceImpl customerService;

    @RequestMapping(value = "/customer",method = RequestMethod.POST)
    public void addCusotmers(@RequestBody Customer customer) {
        customerService.addCusotmer(customer);
    }

    @RequestMapping(value = "/customer",method = RequestMethod.GET)
    public List<Customer> GetAllCusotmers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "/customer/{CustomerId}",method = RequestMethod.GET)
    public Customer GetSpecficCusotmer(@PathVariable int CustomerId) {
        return customerService.getCustomerById(CustomerId);
    }

    @RequestMapping(value="/customer/{CustomerId}",method = RequestMethod.PUT)
    public void UpdateCusomterById(@PathVariable int CustomerId,@RequestBody Customer UpdatedCustomer)
    {
        customerService.UpdateCustomer(CustomerId,UpdatedCustomer);
    }

    @RequestMapping(value = "/customer/{CustomerId}",method = RequestMethod.DELETE)
    public void DeleteSpecficCustomer(@PathVariable int CustomerId) {
         customerService.DeleteCustomer(CustomerId);
    }

}
