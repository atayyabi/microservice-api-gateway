package com.uway.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uway.orderservice.entity.Order;
import com.uway.orderservice.payload.Payment;
import com.uway.orderservice.payload.TransactionRequest;
import com.uway.orderservice.payload.TransactionResponse;
import com.uway.orderservice.service.OrderRepositoryService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderRepositoryService orderService;
	
	@PostMapping("/saveOrder")
	public TransactionResponse saveOrder(@RequestBody TransactionRequest transactionRequest) {
		
		return orderService.saveOrder(transactionRequest);
		
	}

}