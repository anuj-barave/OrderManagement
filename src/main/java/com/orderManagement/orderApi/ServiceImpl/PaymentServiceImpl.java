package com.orderManagement.orderApi.ServiceImpl;

import com.orderManagement.orderApi.Entity.Payment;
import com.orderManagement.orderApi.Repository.PaymentRepository;
import com.orderManagement.orderApi.Service.PaymentService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(int PaymentId) {
        return paymentRepository.findById(PaymentId).orElse(null);
    }

    @Override
    public void addPayment(Payment payment) {
        paymentRepository.save(payment);
    }

    @Override
    public void UpdatePayment(int PaymentId,Payment UpdatedPayment) {
        Payment payment = paymentRepository.findById(PaymentId).orElse(null);
        payment.setStatus(UpdatedPayment.getStatus());
        payment.setMethod(UpdatedPayment.getMethod());
    }

    @Override
    public void DeletePayment(int PaymentId) {
        paymentRepository.deleteById(PaymentId);
    }
}
