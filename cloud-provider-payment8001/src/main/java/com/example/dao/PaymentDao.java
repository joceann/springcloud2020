package com.example.dao;

import com.example.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by JOCEAN on 2020/8/19.
 */
@Repository
@Mapper
public interface PaymentDao {

	int create(Payment payment);

	Payment getPayment(@Param("id") Long id);
}
