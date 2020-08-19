package com.example.service;

import com.example.dao.PaymentDao;
import com.example.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JOCEAN on 2020/8/19.
 */
public interface PaymentService {

	int create(Payment payment);

	Payment getPayment(Long id);
}
