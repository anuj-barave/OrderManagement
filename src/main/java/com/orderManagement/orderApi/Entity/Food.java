package com.orderManagement.orderApi.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    @JsonIgnore
    @ManyToMany(mappedBy = "foodList")
    private List<orderapp> orderApps = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<orderapp> getOrderApps() {
        return orderApps;
    }

    public void setOrderApps(List<orderapp> orderApps) {
        this.orderApps = orderApps;
    }

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Food() {

    }

    @Override
    public String toString() {
        return "Food{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
