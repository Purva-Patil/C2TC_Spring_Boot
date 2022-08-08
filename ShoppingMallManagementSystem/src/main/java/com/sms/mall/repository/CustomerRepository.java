package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer> 
{

}
