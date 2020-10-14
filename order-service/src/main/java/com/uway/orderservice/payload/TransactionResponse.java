package com.uway.orderservice.payload;

import com.uway.orderservice.entity.Order;

public class TransactionResponse {
	
	private Order order;
	private String transactionId;
	private double amount;
	private String transactionMessage;
	
	public TransactionResponse() {
		
	}

	public TransactionResponse(Order order, String transactionId, double amount, String transactionMessage) {
		
		this.order = order;
		this.transactionId=transactionId;
		this.amount = amount;
		this.transactionMessage = transactionMessage;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionMessage() {
		return transactionMessage;
	}

	public void setTransactionMessage(String transactionMessage) {
		this.transactionMessage = transactionMessage;
	}
	
	
	
	

}
