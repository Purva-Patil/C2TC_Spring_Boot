package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.Mall;

public interface MallRepository extends JpaRepository<Mall,Long> {
}