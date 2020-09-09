package com.example.service;

import com.example.cloudcommon.entity.Payment;

/**
 * Created by JOCEAN on 2020/8/19.
 */
public interface PaymentService {

	int create(Payment payment);

	Payment getPayment(Long id);
}
