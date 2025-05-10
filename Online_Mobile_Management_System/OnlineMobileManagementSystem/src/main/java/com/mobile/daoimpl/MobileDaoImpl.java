package com.mobile.daoimpl;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;
import com.mobile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class MobileDaoImpl implements MobileDao {

    // Saves a new Mobile entity into the database
    @Override
    public Mobile saveMobile(Mobile mobile) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(mobile); // Persist the Mobile entity
            transaction.commit(); // Commit the transaction
            return mobile; // Return the saved Mobile object
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback in case of failure
            e.printStackTrace();
        }
        return null; // Return null if saving fails
    }

    // Fetches a Mobile entity by its ID
    @Override
    public Mobile getMobileById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Mobile.class, id); // Retrieve Mobile by ID
        }
    }

    // Retrieves all Mobile entities from the database
    @Override
    public List<Mobile> getAllMobiles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Mobile", Mobile.class).list(); // Fetch all Mobiles
        }
    }

    // Saves a Mobile entity (Duplicate method, needs implementation)
    @Override
    public Mobile save(Mobile mobile) {
        return null; // Not yet implemented
    }

    // Finds a Mobile entity by ID (Duplicate method, needs implementation)
    @Override
    public Mobile findById(Long id) {
        return null; // Not yet implemented
    }

    // Retrieves all Mobile entities (Duplicate method, needs implementation)
    @Override
    public List<Mobile> findAll() {
        return null; // Not yet implemented
    }

    // Updates a Mobile entity (Not implemented)
    @Override
    public void update(Mobile mobile) {
        // Not yet implemented
    }

    // Deletes a Mobile entity by ID (Not implemented)
    @Override
    public void delete(Long id) {
        // Not yet implemented
    }

    // Retrieves a Mobile entity using a String ID (Not implemented)
    @Override
    public Mobile getMobileById(String mobileId) {
        return null; // Not yet implemented
    }

    // Updates a Mobile entity by ID (Not implemented)
    @Override
    public Mobile updateMobile(String mobileId, Mobile mobile) {
        return null; // Not yet implemented
    }

    // Deletes a Mobile entity using a String ID (Not implemented)
    @Override
    public String deleteMobile(String mobileId) {
        return null; // Not yet implemented
    }

	@Override
	public Mobile updateMobile(Long id, Mobile mobile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
}