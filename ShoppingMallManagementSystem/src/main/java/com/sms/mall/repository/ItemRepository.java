package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
