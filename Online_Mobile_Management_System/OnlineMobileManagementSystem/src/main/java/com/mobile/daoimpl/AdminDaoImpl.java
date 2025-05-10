package com.mobile.daoimpl;

import com.mobile.dao.AdminDao;
import com.mobile.entity.Admin;
import com.mobile.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class AdminDaoImpl implements AdminDao {

    // Save a new Admin record in the database
    @Override
    public Admin saveAdmin(Admin admin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(admin); // Persist the admin entity
            transaction.commit(); // Commit transaction
            return admin; // Return saved admin
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace();
        }
        return null; // Return null if the save operation fails
    }

    // Fetch an Admin entity by ID
    @Override
    public Admin getAdminById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Admin.class, id); // Retrieve admin from DB
        }
    }

    // Retrieve all Admin records from the database
    @Override
    public List<Admin> getAllAdmins() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Admin", Admin.class).list(); // Fetch all admins
        }
    }

    // Update an existing Admin record
    @Override
    public Admin updateAdmin(Long id, Admin updatedAdmin) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Admin existingAdmin = session.get(Admin.class, id); // Fetch existing admin

            if (existingAdmin != null) {
                // Update fields with new values
                existingAdmin.setName(updatedAdmin.getName());
                existingAdmin.setEmail(updatedAdmin.getEmail());
                existingAdmin.setPassword(updatedAdmin.getPassword());

                session.update(existingAdmin); // Save changes
                transaction.commit();
                return existingAdmin; // Return updated admin
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback in case of an error
            e.printStackTrace();
        }
        return null; // Return null if update fails
    }

    // Delete an Admin record by ID
    @Override
    public boolean deleteAdmin(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Admin admin = session.get(Admin.class, id); // Fetch admin entity
            if (admin != null) {
                session.delete(admin); // Delete admin from DB
                transaction.commit();
                return true; // Return true if deletion is successful
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback(); // Rollback if an error occurs
            e.printStackTrace();
        }
        return false; // Return false if deletion fails
    }

	@Override
	public Admin updateAdmin(String adminId, Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAdmin(String adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdminById(String adminId) {
		// TODO Auto-generated method stub
		return null;
	}
}
