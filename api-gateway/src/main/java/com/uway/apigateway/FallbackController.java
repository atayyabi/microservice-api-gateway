package com.uway.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	@RequestMapping("/orderFallback")
	public Mono<String> orderServiceFallback() {
		return Mono.just("Order service is not responding..");
	}
	
	@RequestMapping("/paymentFallback")
	public Mono<String> paymentServiceFallback() {
		return Mono.just("Payment service is not responding..");
	}

}
