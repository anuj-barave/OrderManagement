package com.orderManagement.orderApi.Resource;

import com.orderManagement.orderApi.Entity.Food;
import com.orderManagement.orderApi.Entity.Payment;
import com.orderManagement.orderApi.ServiceImpl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentResource {

    @Autowired
    PaymentServiceImpl paymentService;

    @RequestMapping(value = "/payment",method = RequestMethod.POST)
    public void addPayment(@RequestBody Payment payment) {
        paymentService.addPayment(payment);
    }

    @RequestMapping(value = "/payment",method = RequestMethod.GET)
    public List<Payment> GetAllPayments() {
        return paymentService.getAllPayments();
    }

    @RequestMapping(value = "/payment/{paymentd}",method = RequestMethod.GET)
    public Payment GetSpecificPayment(@PathVariable int paymentId) {
        return paymentService.getPaymentById(paymentId);
    }

    @RequestMapping(value="/payment/{paymentId}",method = RequestMethod.PUT)
    public void UpdatePayment(@PathVariable int paymentId,@RequestBody Payment payment) {
        paymentService.UpdatePayment(paymentId,payment);
    }

    @RequestMapping(value = "/payment/{paymentId}",method = RequestMethod.DELETE)
    public void DeletePayment(@PathVariable int paymentId) {
        paymentService.DeletePayment(paymentId);
    }

}
