package com.mobile.daoimpl;

import com.mobile.dao.PaymentDao;
import com.mobile.entity.Payment;
import com.mobile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class PaymentDaoImpl implements PaymentDao {

    // Saves a new Payment entity into the database
    @Override
    public Payment savePayment(Payment payment) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(payment); // Persist the Payment entity
            transaction.commit(); // Commit the transaction
            return payment; // Return the saved Payment object
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback in case of failure
            e.printStackTrace();
        }
        return null; // Return null if saving fails
    }

    // Fetches a Payment entity by its Long ID
    @Override
    public Payment getPaymentById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Payment.class, id); // Retrieve Payment by ID
        }
    }

    // Retrieves all Payment entities from the database
    @Override
    public List<Payment> getAllPayments() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Payment", Payment.class).list(); // Fetch all Payments
        }
    }

    // Retrieves a Payment entity using a String ID (incorrect implementation, should use Long)
    @Override
    public Payment getPaymentById(String paymentId) {
        // Not yet implemented
        return null;
    }

    // Deletes a Payment entity using a String ID (incorrect implementation, should use Long)
    @Override
    public String deletePayment(String paymentId) {
        // Not yet implemented
        return null;
    }

	@Override
	public boolean deletePayment(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
