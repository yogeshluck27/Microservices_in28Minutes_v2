package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value="currency-exchange" , configuration=MyCustomLoadBalancer.class)
public class CurrencyExchangeLoadBalancer {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder(){
		return Feign.builder();
	}
}
