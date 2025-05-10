package com.mobile.dao;

import com.mobile.entity.Payment;
import java.util.List;

public interface PaymentDao {
    // Save
    Payment savePayment(Payment payment);

    // Find
    Payment getPaymentById(Long id);
    List<Payment> getAllPayments();

    // Delete
    boolean deletePayment(Long id); // Returns boolean to indicate success/failure

	Payment getPaymentById(String paymentId);

	String deletePayment(String paymentId);
}
