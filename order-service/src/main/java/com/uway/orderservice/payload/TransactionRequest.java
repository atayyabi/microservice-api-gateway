package com.uway.orderservice.payload;


import com.uway.orderservice.entity.Order;

public class TransactionRequest {
	
	private Order order;
	private Payment payment;
	
	public TransactionRequest() {
		
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
	

}
