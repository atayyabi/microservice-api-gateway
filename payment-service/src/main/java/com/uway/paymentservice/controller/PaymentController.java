package com.uway.paymentservice.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uway.paymentservice.entity.Payment;
import com.uway.paymentservice.service.PaymentRepositoryService;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentRepositoryService paymentService;
	
	@PostMapping("/chargePayment")
	public Payment chargePayment(@RequestBody Payment payment) {
		
		return paymentService.chargePayment(payment);
	}
	
	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) {
		
		return paymentService.findPaymentHistoryByOrderId(orderId);
	}
	
	
	
	

}
