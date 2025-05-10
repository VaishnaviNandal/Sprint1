package com.mobile.dao;

import com.mobile.entity.Orders;
import java.util.List;

public interface OrderDao {
    // Save
    Orders saveOrder(Orders order);

    // Find
    Orders getOrderById(Long id);
    List<Orders> getAllOrders();

    // Update
    Orders updateOrder(Long id, Orders order);

    // Delete
    boolean deleteOrder(Long id); //  Returns boolean to indicate success/failure

	void saveOrder(String orderId);

	Orders updateOrder(String orderId, Orders order);

	Orders getOrderById(String orderId);

	String deleteOrder(String orderId);
}

