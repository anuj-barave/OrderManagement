package com.orderManagement.orderApi.Service;

import com.orderManagement.orderApi.Entity.Food;
import com.orderManagement.orderApi.Entity.Payment;

import java.util.List;

public interface PaymentService {

    public List<Payment> getAllPayments();

    public Payment getPaymentById(int PaymentId);

    public void addPayment(Payment payment);

    public void UpdatePayment(int PaymentId,Payment payment);

    public void DeletePayment(int PaymentId);
}
