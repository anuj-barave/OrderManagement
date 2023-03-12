package com.orderManagement.orderApi.Food;


import com.orderManagement.orderApi.OrderApp;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    @ManyToMany(mappedBy = "foodList")
    private List<OrderApp> orderApps = new ArrayList<>();

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
