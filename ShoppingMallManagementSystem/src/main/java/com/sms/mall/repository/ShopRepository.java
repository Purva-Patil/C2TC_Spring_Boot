package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.Shop;

public interface ShopRepository  extends JpaRepository<Shop, Integer> 
{

}