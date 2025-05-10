package com.mobile.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;  // Use Long instead of int

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "mobile_id", nullable = false)
    private Mobile mobile;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    // Getters and Setters
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Constructors
    public Cart(Long cartId, Customer customer, Mobile mobile, int quantity) {
        this.cartId = cartId;
        this.customer = customer;
        this.mobile = mobile;
        this.quantity = quantity;
    }

    public Cart(Customer customer, Mobile mobile, int quantity) {
        this.customer = customer;
        this.mobile = mobile;
        this.quantity = quantity;
    }

    public Cart() {
        // Default constructor for Hibernate
    }

    // toString() Method for debugging
    @Override
    public String toString() {
        return "Cart [cartId=" + cartId + ", customer=" + customer + ", mobile=" + mobile + ", quantity=" + quantity + "]";
    }
}
