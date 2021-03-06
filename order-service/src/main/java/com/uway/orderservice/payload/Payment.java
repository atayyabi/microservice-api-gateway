package com.uway.orderservice.payload;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_TB")
public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentId;
	private String transactionId;
	private String paymentResponse;
	private int orderId;
	private double amount;
	
	public Payment() {
		
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentResponse() {
		return paymentResponse;
	}

	public void setPaymentResponse(String paymentResponse) {
		this.paymentResponse = paymentResponse;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
