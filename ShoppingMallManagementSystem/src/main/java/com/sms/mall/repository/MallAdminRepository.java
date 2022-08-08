package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.MallAdmin;

public interface MallAdminRepository extends JpaRepository<MallAdmin,Integer> {
}