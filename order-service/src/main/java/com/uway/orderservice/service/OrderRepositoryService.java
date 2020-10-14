package com.uway.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.uway.orderservice.entity.Order;
import com.uway.orderservice.payload.Payment;
import com.uway.orderservice.payload.TransactionRequest;
import com.uway.orderservice.payload.TransactionResponse;
import com.uway.orderservice.repository.OrderRepository;

@Service
public class OrderRepositoryService {

	@Autowired
	private OrderRepository orderRepo;

	@Autowired
	private RestTemplate restTemplate;

	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {

		String transactionMessage = "";
		Order order = transactionRequest.getOrder();
		Payment payment = transactionRequest.getPayment();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
	

		Payment paymentResponse = restTemplate.postForObject("http://PAYMENT-SERVICE/payment/chargePayment", payment,
				Payment.class);
		
		System.out.println(paymentResponse.getPaymentResponse());

		transactionMessage = paymentResponse.getPaymentResponse().equals("payment successful")
				? "payment has successfully been processed"
				: "payment processing has failed";
		orderRepo.save(order);
		return new TransactionResponse(order, paymentResponse.getTransactionId(), paymentResponse.getAmount(),
				transactionMessage);
	}

}
