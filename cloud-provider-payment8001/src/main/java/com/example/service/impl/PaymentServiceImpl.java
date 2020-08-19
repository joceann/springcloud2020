package com.example.service.impl;

import com.example.dao.PaymentDao;
import com.example.entity.Payment;
import com.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JOCEAN on 2020/8/19.
 */
@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPayment(Long id) {
		return paymentDao.getPayment(id);
	}
}
