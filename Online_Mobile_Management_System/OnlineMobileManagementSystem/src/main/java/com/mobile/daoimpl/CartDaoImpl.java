package com.mobile.daoimpl;

import com.mobile.dao.CartDao;
import com.mobile.entity.Cart;
import com.mobile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class CartDaoImpl implements CartDao {

    // Save a new cart record in the database
    @Override
    public Cart saveCart(Cart cart) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(cart); // Persist the cart entity
            transaction.commit(); // Commit the transaction
            return cart; // Return the saved cart
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback in case of an error
            e.printStackTrace();
        }
        return null; // Return null if the save operation fails
    }

    // Fetch a cart entity by ID
    @Override
    public Cart getCartById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Cart.class, id); // Retrieve cart from database
        }
    }

    // Retrieve all cart records from the database
    @Override
    public List<Cart> getAllCarts() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Cart", Cart.class).list(); // Fetch all carts
        }
    }

    // Fetch a cart entity by its string ID (not implemented yet)
    @Override
    public Cart getCartById(String cartId) {
        // Method not yet implemented
        return null;
    }

    // Update an existing cart record (not implemented yet)
    @Override
    public Cart updateCart(String cartId, Cart cart) {
        // Method not yet implemented
        return null;
    }

    // Delete a cart record by ID (not implemented yet)
    @Override
    public String deleteCart(String cartId) {
        // Method not yet implemented
        return null;
    }
}
