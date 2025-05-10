package com.mobile.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;  // Changed to Long for consistency

    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Default Constructor
    public Orders() {}

    // Parameterized Constructor
    public Orders(LocalDate orderDate, Customer customer) {
        this.orderDate = orderDate;
        this.customer = customer;
    }

    // Getters and Setters
    public Long getOrderId() {  // Changed to Long
        return orderId;
    }
    public void setOrderId(Long orderId) {  // Changed to Long
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderDate=" + orderDate +
                ", customer=" + customer.getName() +
                '}';
    }
}
