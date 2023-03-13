package com.orderManagement.orderApi.Repository;

import com.orderManagement.orderApi.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findByName(String customerName);

    @Query(value = "Select * from Customer",nativeQuery = true)
    List<Customer> findAllFromCustomer();

}
