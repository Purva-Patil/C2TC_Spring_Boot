package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}