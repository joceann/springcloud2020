package com.example.controller;

import com.example.cloudcommon.entity.CommonResult;
import com.example.cloudcommon.entity.Payment;
import com.example.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by JOCEAN on 2020/8/19.
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping("/create")
	public CommonResult create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		log.info("===========insert result: " + result);
		if (result > 0) {
			return new CommonResult(200, "insert successfully", result);
		} else {
			return new CommonResult(444, "insert fail", null);
		}
	}

	@GetMapping("/getPayment/{id}")
	public CommonResult getPayment(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPayment(id);
		System.out.println(id+"ffddfdf222");
		if (payment != null) {
			return new CommonResult(200, "query successfully", payment);
		} else {
			return new CommonResult(444, "query fail for " + id, null);
		}
	}
}
