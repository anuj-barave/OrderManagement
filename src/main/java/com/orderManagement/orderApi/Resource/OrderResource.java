package com.orderManagement.orderApi.Resource;

import com.orderManagement.orderApi.Entity.orderapp;
import com.orderManagement.orderApi.ServiceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderResource {

    @Autowired
    OrderServiceImpl orderService;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public void addOrders(@RequestBody orderapp order) {
        orderService.addOrder(order);
    }

    @RequestMapping(value = "/order",method = RequestMethod.GET)
    public List<orderapp> GeAllOrders() {
        return orderService.getallOrders();
    }

    @RequestMapping(value = "/order/{orderId}",method = RequestMethod.GET)
    public orderapp GetSpecificOrder(@PathVariable int OrderId) {
        return orderService.getOrderById(OrderId);
    }

    @RequestMapping(value="/order/{orderId}",method = RequestMethod.PUT)
    public void UpdateOrder(@PathVariable int OrderId,@RequestBody orderapp UpdatedOrder)
    {
        orderService.UpdateOrder(OrderId,UpdatedOrder);
    }

    @RequestMapping(value = "/order/{orderId}",method = RequestMethod.DELETE)
    public void DeleteOrder(@PathVariable int OrderID) {
        orderService.DeleteOrder(OrderID);
    }
}
