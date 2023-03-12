package com.orderManagement.orderApi;

import com.orderManagement.orderApi.CustomerApi.Customer;
import com.orderManagement.orderApi.Food.Food;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class OrderApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "Customer_Id")
    private Customer customer;
    @OneToOne
    private Payment payment;
    @ManyToMany
    private List<Food> foodList = new ArrayList<>();


    public OrderApp(){

    }

    public OrderApp(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
