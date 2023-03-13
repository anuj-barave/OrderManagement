package com.orderManagement.orderApi.ServiceImpl;

import com.orderManagement.orderApi.Entity.orderapp;
import com.orderManagement.orderApi.Entity.Payment;
import com.orderManagement.orderApi.Repository.OrderRepository;
import com.orderManagement.orderApi.Service.OrderService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<orderapp> getallOrders() {
        return orderRepository.findAll();
    }

    @Override
    public orderapp getOrderById(int OrderId) {
        return orderRepository.findById(OrderId).orElse(null);
    }

    @Override
    public void addOrder(orderapp orderApp) {
        orderRepository.save(orderApp);
    }

    @Override
    public void UpdateOrder(int OrderId, orderapp UpdatedOrder) {
    }

//    @Override
//    public void UpdateOrder(int OrderId,OrderApp UpdatedOrder) {
//        OrderApp orderApp = orderRepository.findById(OrderId).orElse(null);
//    }

    @Override
    public void DeleteOrder(int OrderId) {
        orderRepository.deleteById(OrderId);
    }


}
