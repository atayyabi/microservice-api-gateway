package com.uway.paymentservice.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uway.paymentservice.entity.Payment;
import com.uway.paymentservice.repository.PaymentRepository;

@Service
public class PaymentRepositoryService {
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	public Payment chargePayment(Payment payment) {
		
		payment.setPaymentResponse(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
	
	public String paymentProcessing() {
		// replace with Stripe API 
		return new Random().nextBoolean() ? "payment successful" : "payment failure";
	}
	
	public Payment findPaymentHistoryByOrderId(int orderId) {
		
		return paymentRepo.findByOrderId(orderId);
	}

}
