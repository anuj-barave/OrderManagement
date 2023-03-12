package com.orderManagement.orderApi.CustomerApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerCommandLineRunner implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    private Logger logger= LoggerFactory.getLogger(getClass());

    @Override
    public void run(String... args) throws Exception {
        customerRepository.save(new Customer("Anuj","pune","766984161"));
    }
}
