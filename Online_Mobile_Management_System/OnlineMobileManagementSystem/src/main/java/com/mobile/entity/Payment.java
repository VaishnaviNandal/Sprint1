package com.mobile.entity;

import javax.persistence.*;



//import com.mysql.cj.x.protobuf.MysqlxCrud.Order;
import com.mobile.entity.Orders;


@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;
    
    @OneToOne
    private Orders order;
    
    private String paymentMethod;
    private double amount;
    
    
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Orders getOrder() {
		return order;
	}
	public void setOrder(Orders order) {
		this.order = order;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public Payment(int paymentId, Orders order, String paymentMethod, double amount) {
		super();
		this.paymentId = paymentId;
		this.order = order;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
	}
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", order=" + order + ", paymentMethod=" + paymentMethod + ", amount="
				+ amount + "]";
	}

}
