package com.mobile;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mobile.util.HibernateUtil;
import com.mobile.entity.Customer;
import com.mobile.entity.Mobile;

import java.util.List;

public class App {
    public static void main(String[] args, Customer[] customers) {
        // Get SessionFactory and open a session
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        
        Session sessionFactory = factory.openSession() ;
		try (Session session1 = sessionFactory) {
			List<Customer> customers1 = session1.createQuery("from Customer", Customer.class).list();
			session1.close();

			for (Customer c : customers1) {
			    System.out.println(c);
			}


			// Close resources
			session1.close();
		} finally {
		}
        factory.close();
    }
}
