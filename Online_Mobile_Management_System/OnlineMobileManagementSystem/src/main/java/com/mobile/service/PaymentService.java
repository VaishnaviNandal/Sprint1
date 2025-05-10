package com.mobile.service;

import com.mobile.entity.Payment;
import java.util.List;

public interface PaymentService {
    Payment processPayment(Payment payment);
    List<Payment> getAllPayments();
    Payment getPayment(String paymentId);
    String deletePayment(String paymentId);
	Payment makePayment(String orderId, String paymentMethod, double amount);
}
