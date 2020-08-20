package com.example.cloudcomsumerorder80.controller;

import com.example.cloudcommon.entity.CommonResult;
import com.example.cloudcommon.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderController {

	public static final String URL = "http://localhost:8001";

	@Resource
	private RestTemplate restTemplate;

	@GetMapping("/payment/create")
	public CommonResult<Payment> create(Payment payment) {
		return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
	}

	@GetMapping("/payment/getPayment/{id}")
	public CommonResult getPayment(@PathVariable("id") Long id) {
		return restTemplate.getForObject(URL + "/payment/getPayment/" + id, CommonResult.class);
	}
}
