package com.orderManagement.orderApi.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String address;
    @NotNull
    private String phone;
    @JsonIgnore
    @OneToMany(mappedBy = "customer",fetch=FetchType.LAZY)
    private List<orderapp> orders = new ArrayList<>();

    public Customer(String name, String address, String phoneNo) {
        this.name = name;
        this.address = address;
        this.phone = phoneNo;
    }

    public Customer() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void Customer(){

    };

    @JsonIgnore
    public List<orderapp> getOrders() {
        return orders;
    }

    public void setOrders(List<orderapp> orders) {
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phone;
    }

    public void setPhoneNo(String phoneNo) {
        this.phone = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo='" + phone + '\'' +
                '}';
    }
}
