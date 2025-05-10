package com.mobile.serviceimpl;

import com.mobile.dao.PaymentDao;

import com.mobile.daoimpl.PaymentDaoImpl;
import com.mobile.entity.Payment;
import com.mobile.service.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    private PaymentDao paymentDao = new PaymentDaoImpl();

    @Override
    public Payment processPayment(Payment payment) {
        return paymentDao.savePayment(payment);
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentDao.getAllPayments();
    }

    @Override
    public Payment getPayment(String paymentId) {
        return paymentDao.getPaymentById(paymentId);
    }

    @Override
    public String deletePayment(String paymentId) {
        return paymentDao.deletePayment(paymentId);
    }

	@Override
	public Payment makePayment(String orderId, String paymentMethod, double amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
