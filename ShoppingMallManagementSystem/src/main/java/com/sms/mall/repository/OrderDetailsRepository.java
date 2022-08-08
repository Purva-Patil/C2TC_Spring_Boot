package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.OrderDetails;
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> 
{
	
}
