package com.orderManagement.orderApi.Entity;

import com.orderManagement.orderApi.Entity.Customer;
import com.orderManagement.orderApi.Entity.Payment;
import com.orderManagement.orderApi.Repository.CustomerRepository;
import com.orderManagement.orderApi.Repository.FoodRepository;
import com.orderManagement.orderApi.Repository.OrderRepository;
import com.orderManagement.orderApi.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EntityCommandLineRunner implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    FoodRepository foodRepository;
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

//        Customer customer1 = new Customer();
//        customer1.setName("Anuj");
//        customer1.setAddress("Pune");
//        customer1.setPhoneNo("9766984161");
//
//        Customer customer2 = new Customer();
//        customer2.setName("Abhijeet");
//        customer2.setAddress("Shirdi");
//        customer2.setPhoneNo("8304820020");
//
//        Customer customer3 = new Customer();
//        customer3.setName("Vrushaket");
//        customer3.setAddress("Jalgoan");
//        customer3.setPhoneNo("9768984161");
//
//        customerRepository.save(customer1);
//        customerRepository.save(customer3);
//        customerRepository.save(customer2);
//
//        Food item1 = new Food();
//        item1.setName("Samosa");
//        item1.setPrice(15.00);
//
//        Food item2 = new Food();
//        item2.setName("Vadapav");
//        item2.setPrice(20.00);
//
//        Food item3 = new Food();
//        item3.setName("Misal");
//        item3.setPrice(50.00);
//
//        foodRepository.save(item1);
//        foodRepository.save(item2);
//        foodRepository.save(item3);
//
//        orderapp order1 = new orderapp();
//        Customer CustomerOrder1 = customerRepository.findById(1).orElse(null);
//        if(CustomerOrder1!=null) {
//            order1.setCustomer(CustomerOrder1);
//            Food OrderFood = foodRepository.findByName("Vadapav");
//            if(OrderFood!=null)
//            {
//                List<Food> OrderFoodList = new ArrayList<>();
//                OrderFoodList.add(OrderFood);
//                order1.setFoodList(OrderFoodList);
//                Payment payment = new Payment();
//                payment.setMethod("Cash");
//                payment.setStatus("Paid");
//                order1.setPayment(payment);
//            }
//
//        }
//
//        orderapp order2 = new orderapp();
//        Customer CustomerOrder2 = customerRepository.findById(2).orElse(null);
//        if(CustomerOrder2!=null) {
//            order2.setCustomer(CustomerOrder2);
//            Food OrderFood = foodRepository.findByName("Samosa");
//            if(OrderFood!=null)
//            {
//                List<Food> OrderFoodList = new ArrayList<>();
//                OrderFoodList.add(OrderFood);
//                order2.setFoodList(OrderFoodList);
//                Payment payment = new Payment();
//                payment.setMethod("Online");
//                payment.setStatus("Paid");
//                order2.setPayment(payment);
//            }
//        }
//
//        orderRepository.save(order1);
//        orderRepository.save(order2);

    }
}
