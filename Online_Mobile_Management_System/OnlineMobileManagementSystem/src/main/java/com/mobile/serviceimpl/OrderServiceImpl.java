package com.mobile.serviceimpl;

import com.mobile.dao.OrderDao;
import com.mobile.daoimpl.OrderDaoImpl;
import com.mobile.entity.Orders;
import com.mobile.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao = new OrderDaoImpl();

    @Override
    public Orders placeOrder(Orders order) {
        return orderDao.saveOrder(order);
    }

    @Override
    public List<Orders> getAllOrders() {
        return orderDao.getAllOrders();
    }

    @Override
    public Orders getOrder(String orderId) {
        return orderDao.getOrderById(orderId);
    }

    @Override
    public Orders updateOrder(String orderId, Orders order) {
        return orderDao.updateOrder(orderId, order);
    }

    @Override
    public String cancelOrder(String orderId) {
        return orderDao.deleteOrder(orderId);
    }
}
