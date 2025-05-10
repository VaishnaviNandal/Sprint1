package com.mobile.service;

import com.mobile.entity.Cart;
import com.mobile.entity.Customer;
import com.mobile.entity.Mobile;
import com.mobile.entity.Orders;

import java.util.List;

public interface MobileService {
    Mobile createMobile(Mobile mobile);
    List<Mobile> getAllMobiles();
    Mobile getMobile(String mobileId);
    Mobile updateMobile(String mobileId, Mobile mobile);
    String deleteMobile(String mobileId);
	void saveOrder(Orders order);
	void createCustomer(Customer customer);
	List<Customer> getAllCustomers();
	void updateCustomer(String customerId, Customer updatedCustomer);
	void createCustomer(String deleteId);
	void cancelOrder(String orderId);
	void addToCart(Cart cart);
	List<Cart> getCartItems();
	void checkout();
	void removeFromCart(String itemId);
	Mobile getMobile(int mId);
	Mobile updateMobile(int mId, Mobile updatedData);
	String deleteMobile(int id);
}