package com.orderManagement.orderApi.Service;

import com.orderManagement.orderApi.Entity.orderapp;
import com.orderManagement.orderApi.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderService{

    public List<orderapp> getallOrders();

    public orderapp getOrderById(int OrderId);

    public void addOrder(orderapp orderApp);

    public void UpdateOrder(int OrderId,orderapp UpdatedOrder);

    public void DeleteOrder(int OrderId);
}
