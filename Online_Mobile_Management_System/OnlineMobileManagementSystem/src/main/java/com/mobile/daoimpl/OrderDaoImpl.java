package com.mobile.daoimpl;

import com.mobile.dao.OrderDao;
import com.mobile.entity.Orders;
import com.mobile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    // Saves a new Order entity into the database
    @Override
    public Orders saveOrder(Orders order) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(order); // Persist the Order entity
            transaction.commit(); // Commit the transaction
            return order; // Return the saved Order object
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback in case of failure
            e.printStackTrace();
        }
        return null; // Return null if saving fails
    }

    // Fetches an Order entity by its Long ID
    @Override
    public Orders getOrderById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Orders.class, id); // Retrieve Order by ID
        }
    }

    // Retrieves all Order entities from the database
    @Override
    public List<Orders> getAllOrders() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Order", Orders.class).list(); // Fetch all Orders
        }
    }

    // This method has an incorrect signature and should be revised or removed
    @Override
    public void saveOrder(String orderId) {
        // Not implemented, method signature is incorrect
    }

    // Updates an existing Order entity using a String ID
    @Override
    public Orders updateOrder(String orderId, Orders order) {
        // Not yet implemented
        return null;
    }

    // Retrieves an Order entity using a String ID
    @Override
    public Orders getOrderById(String orderId) {
        // Not yet implemented
        return null;
    }

    // Deletes an Order entity using a String ID
    @Override
    public String deleteOrder(String orderId) {
        // Not yet implemented
        return null;
    }

	@Override
	public Orders updateOrder(Long id, Orders order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrder(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
