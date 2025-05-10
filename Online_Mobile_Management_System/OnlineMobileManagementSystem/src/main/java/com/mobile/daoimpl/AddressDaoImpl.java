package com.mobile.daoimpl;

import org.hibernate.HibernateException;
import com.mobile.dao.AddressDao;
import com.mobile.entity.Address;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;
import com.mobile.util.HibernateUtil;

public class AddressDaoImpl implements AddressDao {

    @Override
    public Address saveAddress(Address address) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(address);
            transaction.commit();
            return address;  // Return saved address
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return null; // Return null if save fails
    }

    @Override
    public Address getAddressById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Address.class, id);
        }
    }

    @Override
    public List<Address> getAllAddresses() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Address", Address.class).list();
        }
    }

    @Override
    public Address updateAddress(Long id, Address updatedAddress) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Address existingAddress = session.get(Address.class, id);

            if (existingAddress != null) {
                existingAddress.setStreet(updatedAddress.getStreet());
                existingAddress.setCity(updatedAddress.getCity());
                existingAddress.setState(updatedAddress.getState());
                existingAddress.setPincode(updatedAddress.getPincode());
                
                session.update(existingAddress);
                transaction.commit();
                return existingAddress;
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return null; // Return null if update fails
    }

    @Override
    public boolean deleteAddress(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Address address = session.get(Address.class, id);
            if (address != null) {
                session.delete(address);
                transaction.commit();
                return true; // Return true if deleted
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
        return false; // Return false if deletion fails
    }

	@Override
	public Address updateAddress(String addressId, Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAddress(String addressId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddressById(String addressId) {
		// TODO Auto-generated method stub
		return null;
	}
}
