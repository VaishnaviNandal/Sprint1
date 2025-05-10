package com.mobile.daoimpl;

import com.mobile.dao.UserDao;
import com.mobile.entity.User;
import com.mobile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class UserDaoImpl implements UserDao {

    // Saves a new User entity into the database
    @Override
    public User saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user); // Persist the User entity
            transaction.commit(); // Commit the transaction
            return user; // Return the saved User object
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback in case of failure
            e.printStackTrace();
        }
        return null; // Return null if saving fails
    }

    // Fetches a User entity by its Long ID
    @Override
    public User getUserById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(User.class, id); // Retrieve User by ID
        }
    }

    // Retrieves all User entities from the database
    @Override
    public List<User> getAllUsers() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from User", User.class).list(); // Fetch all Users
        }
    }

    // Retrieves a User entity using a String ID (this method should ideally use Long instead of String)
    @Override
    public User getUserById(String userId) {
        // Not yet implemented
        return null;
    }

    // Updates a User entity using a String ID (this should also use Long instead of String)
    @Override
    public User updateUser(String userId, User user) {
        // Not yet implemented
        return null;
    }

    // Deletes a User entity using a String ID (this should use Long instead of String)
    @Override
    public String deleteUser(String userId) {
        // Not yet implemented
        return null;
    }

	@Override
	public User updateUser(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}
