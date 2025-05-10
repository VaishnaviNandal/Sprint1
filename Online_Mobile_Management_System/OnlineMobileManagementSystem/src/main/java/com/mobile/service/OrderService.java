package com.mobile.service;

import com.mobile.entity.Orders;
import java.util.List;

public interface OrderService {
    Orders placeOrder(Orders order);
    List<Orders> getAllOrders();
    Orders getOrder(String orderId);
    Orders updateOrder(String orderId, Orders order);
    String cancelOrder(String orderId);
}
