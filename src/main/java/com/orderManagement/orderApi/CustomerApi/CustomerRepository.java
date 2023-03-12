package com.orderManagement.orderApi.CustomerApi;

import com.orderManagement.orderApi.CustomerApi.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface CustomerRepository extends JpaRepository<Customer, BigInteger> {

}
